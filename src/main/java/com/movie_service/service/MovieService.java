package com.movie_service.service;

import com.movie_service.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    List<MovieDto> findAllByGenre(String genre);



}
