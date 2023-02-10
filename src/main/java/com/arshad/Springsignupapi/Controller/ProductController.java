package com.arshad.Springsignupapi.Controller;

import com.arshad.Springsignupapi.Entity.Product.Product;
import com.arshad.Springsignupapi.Service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") String id){
        return productService.getProductById(id);
    }

    @GetMapping("/product/brand/{brand}")
    public List<Product> getProductByBrand(@PathVariable("brand") String brand){
        return productService.getProductByBrand(brand);
    }

    @GetMapping("/product/category/{category}")
    public List<Product> getProductByCategory(@PathVariable("category") String category){
        return productService.getProductByCategory(category);
    }


}
