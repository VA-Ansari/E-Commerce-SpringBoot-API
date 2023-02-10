package com.arshad.Springsignupapi.Service.CartService;

import com.arshad.Springsignupapi.Entity.Cart.Cart;
import com.arshad.Springsignupapi.Entity.Cart.CartItem;
import com.arshad.Springsignupapi.Repository.CartRepository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart addToCart(Cart addCart){
        return cartRepository.save(addCart);
    }

    @Override
    public Cart addProductToCart(String userId, CartItem cartItem) {
        Cart cart = cartRepository.findOneByUserUniqueId(userId);

        List<CartItem> cartItems = cart.getCartItemList();
        cartItems.add(cartItem);

        cart.setCartItemList(cartItems);

        cartRepository.save(cart);

        return cartRepository.findOneByUserUniqueId(userId);
    }

    @Override
    public Cart getCartOfUser(String userId) {
        return cartRepository.findOneByUserUniqueId(userId);
    }

    @Override
    public List<CartItem>  getCartItemListOfUser(String userId) {
        Cart cart = cartRepository.findOneByUserUniqueId(userId);
        return cart.getCartItemList();
    }
}
