package com.arshad.Springsignupapi.Service.OrderService;


import com.arshad.Springsignupapi.Entity.Order.Order;

public interface OrderService {

    Order getAllOrdersOfUser(String userId);
}
