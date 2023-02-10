package com.arshad.Springsignupapi.Repository.ProductRepo;

import com.arshad.Springsignupapi.Entity.Product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findAllByBrand(String brand);

    List<Product> findAllByCategory(String category);
}
