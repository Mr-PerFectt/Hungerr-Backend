package com.mrperfect.kitchenstory.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrperfect.kitchenstory.model.ProductCategory;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    // Some category
    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
    // All category
    List<ProductCategory> findAllByOrderByCategoryType();
    // One category
    ProductCategory findByCategoryType(Integer categoryType);
}
