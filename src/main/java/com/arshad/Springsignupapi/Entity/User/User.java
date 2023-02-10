package com.arshad.Springsignupapi.Entity.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    private String userUniqueId;

    private String password;
    private String fullName;
    private String age;
    private String city;

}
