package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryDao {
    /**
     * 通过shopId 查询店铺商品类别
     * @param shopId
     * @return List<ProductCategory>
     */
    List<ProductCategory> queryProductCategoryList(long shopId);
}
