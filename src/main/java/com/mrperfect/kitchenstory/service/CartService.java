package com.mrperfect.kitchenstory.service;


import java.util.Collection;

import com.mrperfect.kitchenstory.model.Cart;
import com.mrperfect.kitchenstory.model.ProductInOrder;
import com.mrperfect.kitchenstory.model.User;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
