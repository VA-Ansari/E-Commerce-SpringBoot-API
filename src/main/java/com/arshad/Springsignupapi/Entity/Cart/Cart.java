package com.arshad.Springsignupapi.Entity.Cart;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cart {
    @Id
    private Long cartId;

    private String userUniqueId;

    private List<CartItem> cartItemList;

}
