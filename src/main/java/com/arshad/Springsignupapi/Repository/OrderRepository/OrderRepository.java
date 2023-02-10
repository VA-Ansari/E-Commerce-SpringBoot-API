package com.arshad.Springsignupapi.Repository.OrderRepository;

import com.arshad.Springsignupapi.Entity.Order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
