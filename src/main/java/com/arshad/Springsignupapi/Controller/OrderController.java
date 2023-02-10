package com.arshad.Springsignupapi.Controller;

import com.arshad.Springsignupapi.Entity.Order.Order;
import com.arshad.Springsignupapi.Service.OrderService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/order/{userId}")
    public Order getAllOrdersOfUser(@PathVariable("userId") String userId){
        return orderService.getAllOrdersOfUser(userId);
    }
}
