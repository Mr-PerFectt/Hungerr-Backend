package com.mrperfect.kitchenstory.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mrperfect.kitchenstory.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}
