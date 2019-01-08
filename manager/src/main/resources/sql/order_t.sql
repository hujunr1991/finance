CREATE TABLE order_t(
		order_id VARCHAR(50) NOT NULL COMMENT '传品编号',
		chan_id VARCHAR(50) NOT NULL COMMENT '产品名称',
		product_id VARCHAR(50) NOT NULL COMMENT '产品名称',
		chan_user_id VARCHAR(50) NOT NULL COMMENT '产品名称',
		order_type VARCHAR(50) NOT NULL COMMENT '产品名称',
		order_status VARCHAR(50) NOT NULL COMMENT '产品名称',
		outer_order_id VARCHAR(50) NOT NULL COMMENT '产品名称',
		amount DECIMAL(15,3) NOT NULL COMMENT '起头金额',
		memo VARCHAR(200)  COMMENT '备注',
		create_at Datetime  COMMENT '创建时间',

		update_at DATETIME  COMMENT '更新时间',

		PRIMARY KEY(order_id)
)engine=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;