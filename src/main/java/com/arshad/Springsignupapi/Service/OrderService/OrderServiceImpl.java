package com.arshad.Springsignupapi.Service.OrderService;

import com.arshad.Springsignupapi.Entity.Cart.CartItem;
import com.arshad.Springsignupapi.Entity.Order.Order;
import com.arshad.Springsignupapi.Entity.Order.OrderItem;
import com.arshad.Springsignupapi.Entity.Product.Product;
import com.arshad.Springsignupapi.Repository.CartRepository.CartRepository;
import com.arshad.Springsignupapi.Repository.OrderRepository.OrderRepository;
import com.arshad.Springsignupapi.Service.CartService.CartService;
import com.arshad.Springsignupapi.Service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;

    @Override
    public Order getAllOrdersOfUser(String userId) {
        List<CartItem> cItems = cartService.getCartItemListOfUser(userId);

        double totalPriceOfCartItems = 0.0;

        List<OrderItem> orderItemList = new ArrayList<>();

        for (int i = 0; i < cItems.size(); i++) {
            List<CartItem> cartItemListOfUser = cartService.getCartItemListOfUser(userId);
            String productUniqueId = cartItemListOfUser.get(i).getProductUniqueId();

            Product product = productService.getProductById(productUniqueId);

            totalPriceOfCartItems += product.getPrice() * cItems.get(i).getQuantity();


            OrderItem orderItem = new OrderItem();
            orderItem.setQuantity(cItems.get(i).getQuantity());
            orderItem.setProductName(productUniqueId);

            orderItemList.add(orderItem);
        }

        Order order = new Order();
        order.setOrderUserId(userId);
        order.setTotalPrice((long) totalPriceOfCartItems);
        order.setOrderItems(orderItemList);

        return orderRepository.save(order);
    }
}
