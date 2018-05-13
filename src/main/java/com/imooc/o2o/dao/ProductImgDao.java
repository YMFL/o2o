package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ProductImg;

import java.util.List;

public interface ProductImgDao {
    List<ProductImg> queryProductimgList(long productId);

    /**
     * 批量添加商品详情图片
     * @param productImgList
     * @return
     */
    int batchInsertProductImg(List<ProductImg> productImgList);

    /**
     *
     * @param productId
     * @return
     */
    int deleteProductImgByProductId(long productId);

}
