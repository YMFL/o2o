package com.imooc.o2o.dao;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ProductExecution;
import com.imooc.o2o.entity.Product;
import com.imooc.o2o.exceptions.ProductOperationException;

import java.util.List;

public interface ProductDao {
    /**
     * 添加商品信息以及图片处理
     * @param product
     * @param thumbnaill
     * @param imageHolderList
     * @return
     * @throws ProductOperationException
     */
    ProductExecution addProduct(Product product, ImageHolder thumbnaill, List<ImageHolder> imageHolderList) throws ProductOperationException;

    /**
     * 插入商品信息
     * @param product
     * @return
     */
    int insertProduct(Product product);
}
