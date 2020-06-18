package com.wisezone.service;

import com.wisezone.bean.Movie;
import com.wisezone.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Movie getMovie(){
        return movieDao.getMovie();
    }


}
