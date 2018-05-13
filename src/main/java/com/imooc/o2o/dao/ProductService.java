package com.imooc.o2o.dao;

import com.imooc.o2o.dto.ProductExecution;
import com.imooc.o2o.exceptions.ProductOperationException;

public interface ProductService {

    /**
     * 添加商品信息以及图片处理
     * @return
     * @throws ProductOperationException
     */
    ProductExecution addProduct() throws ProductOperationException;
}
