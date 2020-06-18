package com.wisezone.dao;

import com.wisezone.bean.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {

    @Value("${server.port}")
    private String port;

    public Movie getMovie(){
        Movie movie = new Movie();
        movie.setId(1);
        movie.setName("哪吒---"+ port);


        return movie;
    }


}
