CREATE TABLE product(
		id VARCHAR(50) NOT NULL COMMENT '传品编号',
		NAME VARCHAR(50) NOT NULL COMMENT '产品名称',
		threshold_amount DECIMAL(15,3) NOT NULL COMMENT '起头金额',
		step_amount DECIMAL(15,3) NOT NULL COMMENT '投资步长',
		lock_term SMALLINT NOT NULL COMMENT '锁定期',
		reward_rate DECIMAL(5,3) not null COMMENT '收益率',
		STATUS VARCHAR(20) NOT NULL COMMENT '状态',
		memo VARCHAR(20)  COMMENT '备注',CREATE TABLE product(
		id VARCHAR(50) NOT NULL COMMENT '传品编号',
		NAME VARCHAR(50) NOT NULL COMMENT '产品名称',
		threshold_amount DECIMAL(15,3) NOT NULL COMMENT '起头金额',
		step_amount DECIMAL(15,3) NOT NULL COMMENT '投资步长',
		lock_term SMALLINT NOT NULL COMMENT '锁定期',
		reward_rate DECIMAL(5,3) not null COMMENT '收益率',
		STATUS VARCHAR(20) NOT NULL COMMENT '状态',
		memo VARCHAR(20)  COMMENT '备注',
		create_at Datetime  COMMENT '创建时间',
		create_user VARCHAR(20)  COMMENT '创建者',
		update_at DATETIME  COMMENT '更新时间',
		update_user VARCHAR(20)  COMMENT '创建者',
		PRIMARY KEY(id)
)engine=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

