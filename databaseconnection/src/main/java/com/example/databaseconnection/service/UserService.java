package com.example.databaseconnection.service;


import com.example.databaseconnection.model.primary.User1;
import com.example.databaseconnection.model.secondary.User2;
import com.example.databaseconnection.repository.primary.User1Repository;
import com.example.databaseconnection.repository.secondary.User2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private User1Repository user1Repository;

    @Autowired
    private User2Repository user2Repository;

    public List<User1> getAllUsersFromDb1() {
        return user1Repository.findAll();
    }

    public List<User2> getAllUsersFromDb2() {
        return user2Repository.findAll();
    }

    public User1 saveUserToDb1(User1 user1) {
        return user1Repository.save(user1);
    }

    public User2 saveUserToDb2(User2 user2) {
        return user2Repository.save(user2);
    }
}
