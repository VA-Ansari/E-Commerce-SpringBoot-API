package com.arshad.Springsignupapi.Repository.UserRepo;

import com.arshad.Springsignupapi.Entity.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findOneByUserUniqueIdAndPassword(String userName, String password);

    User findByUserUniqueId(String userName);

    User findByFullName(String fullName);

//    User findByUserNameAndPassword(String userName, String password);
}
