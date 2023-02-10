package com.arshad.Springsignupapi.Entity.Product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    private String productUniqueId;

    private String title;
    private Double price;
    private Double rating;
    private String category;
    private String brand;
}
