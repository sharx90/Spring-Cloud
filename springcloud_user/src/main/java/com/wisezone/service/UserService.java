package com.wisezone.service;

import com.wisezone.bean.User;
import com.wisezone.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    RestTemplate restTemplate;

    public User getUserByID(Integer id){

        return userDao.getUserById(id);
    }
    public Map buyMovie(Integer id){

        Map map = new HashMap();

        String movie = restTemplate.getForObject("http://MOVIE:movie", String.class);

        map.put("user",userDao.getUserById(id));
        map.put("movie",movie);

        return map;
    }


}
