package com.arshad.Springsignupapi.Service.ProductService;

import com.arshad.Springsignupapi.Entity.Product.Product;
import com.arshad.Springsignupapi.Repository.ProductRepo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getProductByBrand(String brand) {
        return productRepository.findAllByBrand(brand);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.findAllByCategory(category);
    }
}
