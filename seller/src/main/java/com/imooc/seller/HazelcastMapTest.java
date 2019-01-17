/*
 * www.unisinsight.com Inc.
 * Copyright (c) 2018 All Rights Reserved
 */
package com.imooc.seller;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * description
 *
 * @author hujun [KF.hujunA@h3c.com]
 * @date 2019/01/17 20:30
 * @since 1.0
 */
@Component
public class HazelcastMapTest {

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @PostConstruct
    public void put() {
        Map map = hazelcastInstance.getMap("imooc");
        map.put("name","imooc");
    }
}
