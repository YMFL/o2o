package com.imooc.o2o.dto;

import com.imooc.o2o.entity.Product;
import com.imooc.o2o.enums.ProductStateEnum;

import java.util.List;

public class ProductExecution {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //商品数量
    private int count;
    //操作的product（增删改商品的时候使用）
    private Product product;
    //获取product列表（查询商品列表的时候使用）
    private List<Product> productList;

    public ProductExecution(){

    }

    //失败的构造器
    public ProductExecution(ProductStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }

    //成功的构造器




}
