package com.szz.springcloud.pojo;

import java.io.PrintStream;
import java.io.Serializable;

/**
 * @Author: Zhengzhong Sun
 * @create 2020-12-14-15:46
 */


public class Dept implements Serializable { //实体类实现序列化 orm对象关系映射 mysql--实体类

    //主键
    private Long deptNum;

    private String deptName;

    //这个数据存在哪个数据库的字段 微服务：一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String dbSource;
    
}
