package com.cricket.ipl2020.prediction.repository;

import com.cricket.ipl2020.prediction.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

    @Query(value = "Select * from users where user_name=:username and password= :password",nativeQuery = true)
    List<Users> loginUser(@Param("username") String username, @Param("password") String password);
}
