package com.arshad.Springsignupapi.Service.CartService;

import com.arshad.Springsignupapi.Entity.Cart.Cart;
import com.arshad.Springsignupapi.Entity.Cart.CartItem;

import java.util.List;

public interface CartService {
    Cart addToCart(Cart addCart);

    Cart getCartOfUser(String userId);

    Cart addProductToCart(String userId, CartItem cartItem);

    List<CartItem> getCartItemListOfUser(String userId);
}
