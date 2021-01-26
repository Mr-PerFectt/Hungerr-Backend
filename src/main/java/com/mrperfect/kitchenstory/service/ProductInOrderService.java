package com.mrperfect.kitchenstory.service;


import com.mrperfect.kitchenstory.model.ProductInOrder;
import com.mrperfect.kitchenstory.model.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
