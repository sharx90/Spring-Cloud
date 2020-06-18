package com.wisezone.dao;

import com.wisezone.bean.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

   static List<User> users = new ArrayList<>();
   static {
       users.add(new User(1,"张三"));
       users.add(new User(2,"李四"));
       users.add(new User(3,"王五"));
       users.add(new User(4,"赵六"));
   }
    public User getUserById(Integer id){

        return users.get(id);
    }



}
