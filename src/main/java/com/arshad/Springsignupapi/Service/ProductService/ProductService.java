package com.arshad.Springsignupapi.Service.ProductService;

import com.arshad.Springsignupapi.Entity.Product.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getProductByBrand(String brand);

    List<Product> getProductByCategory(String category);

    Product getProductById(String id);
}
