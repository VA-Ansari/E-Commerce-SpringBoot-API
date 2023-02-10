package com.arshad.Springsignupapi.Repository.CartRepository;
import com.arshad.Springsignupapi.Entity.Cart.Cart;
import com.arshad.Springsignupapi.Entity.Cart.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends MongoRepository<Cart, Long> {

    Cart findOneByUserUniqueId(String id);

    List<CartItem> findOneByCartItemList(String userId);

    List<CartItem>  findByCartItemList(String userId);

    List<CartItem> findAllByCartItemList(String userId);

}
