package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    List<ProductDTO> selectAllProductList();

    List<ProductDTO> selectProductByConditionList(SearchCondition searchCondition);

    int registNewProduct(ProductDTO productList);

    int modifyProductInfo(ProductDTO product);

    int deleteProduct(int code);

}
