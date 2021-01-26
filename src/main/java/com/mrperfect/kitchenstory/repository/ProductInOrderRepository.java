package com.mrperfect.kitchenstory.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mrperfect.kitchenstory.model.ProductInOrder;


public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
