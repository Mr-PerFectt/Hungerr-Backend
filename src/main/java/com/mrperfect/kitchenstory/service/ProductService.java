package com.mrperfect.kitchenstory.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mrperfect.kitchenstory.model.ProductInfo;


public interface ProductService {

    ProductInfo findOne(String productId);

    // All selling products
    Page<ProductInfo> findUpAll(Pageable pageable);
    // All products
    Page<ProductInfo> findAll(Pageable pageable);
    // All products in a category
    Page<ProductInfo> findAllInCategory(Integer categoryType, Pageable pageable);

    Page<ProductInfo>  findAllByProductNameContaining (String productName,Pageable pageable);

    // increase stock
    void increaseStock(String productId, int amount);

    //decrease stock
    void decreaseStock(String productId, int amount);

    ProductInfo offSale(String productId);

    ProductInfo onSale(String productId);

    ProductInfo update(ProductInfo productInfo);
    ProductInfo save(ProductInfo productInfo);

    void delete(String productId);


}
