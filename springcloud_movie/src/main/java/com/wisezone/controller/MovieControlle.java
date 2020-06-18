package com.wisezone.controller;

import com.wisezone.bean.Movie;
import com.wisezone.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieControlle {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movie")
    public Movie getMovie(){

        return movieService.getMovie();
    }

}
