package com.imooc.o2o.service;

import com.imooc.o2o.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    /**
     * 查询指定某个店铺下的所有商品类别信息
     * @param shopId
     * @return
     */
    List<ProductCategory> getProductCategoryList(long shopId);
}
