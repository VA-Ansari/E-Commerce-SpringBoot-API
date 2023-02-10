package com.arshad.Springsignupapi.Controller;

import com.arshad.Springsignupapi.Entity.Cart.Cart;
import com.arshad.Springsignupapi.Entity.Cart.CartItem;
import com.arshad.Springsignupapi.Service.CartService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public Cart addToCart(@RequestBody Cart cart){
        return cartService.addToCart(cart);
    }

    @PostMapping("/cart/{userId}")
    public Cart addProductToCart(@PathVariable("userId") String userId, @RequestBody CartItem cartItem){
        return cartService.addProductToCart(userId, cartItem);
    }

    @GetMapping("/cart/{userId}")
    public Cart getCartOfUser(@PathVariable("userId") String userId){
        return cartService.getCartOfUser(userId);
    }

    @GetMapping("/cartItem/{userUniqueId}")
    public List<CartItem> getCartItemListOfUser(@PathVariable("userUniqueId") String userUniqueId){
        return cartService.getCartItemListOfUser(userUniqueId);
    }


}
