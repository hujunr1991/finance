package com.imooc.seller.service;

import com.imooc.api.ProductRpc;
import com.imooc.api.events.ProductStatusEvent;
import com.imooc.entity.Product;
import com.imooc.entity.enums.ProductStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRpcService implements ApplicationListener<ContextRefreshedEvent> {
    private static Logger LOG = LoggerFactory.getLogger(ProductRpcService.class);

    static final String MQ_DESTINATION = "Consumer.cache.VirtualTopic.PRODUCT_STATUS";

    @Autowired
    private ProductRpc productRpc;

    @Autowired
    private ProductCache productCache;

    public List<Product> findAll() {
//        ProductRpcReq req = new ProductRpcReq();
//        List<String> status = new ArrayList<>();
//        status.add(ProductStatus.IN_SELL.name());
//        Pageable pageable = new PageRequest(0,1000, Sort.Direction.DESC,"rewardRate");
//        req.setStatusList(status);
//        LOG.info("rpc查询全部产品，请求{}",req);
//        List<Product> result = productRpc.query(req);
//        LOG.info("rpc查询全部产品，请求{}",result);
//        return result;
            return productCache.readAllCache();
    }

  /*  @PostConstruct
    public void testFindAll(){
        findAll();
    }*/

    public Product findOne(String id) {
        LOG.info("rpc查询单个产品，请求：{}",id);
        Product result = productRpc.findOne(id);
        LOG.info("rpc查询单个产品，结果:{}",result);
        return  result;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        List<Product> products = findAll();
        products.forEach(product -> {
            productCache.putCache(product);
        });
    }

 /*   @PostConstruct
    public void init(){
        findOne("001");
    }*/

    @JmsListener(destination = MQ_DESTINATION)
    public void updateCache(ProductStatusEvent event) {
        LOG.info("receive event:{}",event);
        productCache.removeCache(event.getId());
        if (ProductStatus.IN_SELL.equals(event.getStatus())) {
            productCache.readCache(event.getId());
        }
    }


}
