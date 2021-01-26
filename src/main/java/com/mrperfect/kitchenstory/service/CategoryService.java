package com.mrperfect.kitchenstory.service;


import java.util.List;

import com.mrperfect.kitchenstory.model.ProductCategory;


public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
