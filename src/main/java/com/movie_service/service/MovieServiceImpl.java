package com.movie_service.service;

import com.movie_service.dto.MovieDto;
import com.movie_service.enumconstant.Genre;
import com.movie_service.mapper.EntityDtoMapper;
import com.movie_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{


    @Autowired
    private MovieRepository movieRepository;




    @Override
    public List<MovieDto> findAll() {
        return this.movieRepository.findAll()
            .stream()
            .map(EntityDtoMapper::toDto)
            .toList();
    }

    @Override
    public List<MovieDto> findAllByGenre(String genre) {
        return this.movieRepository.findByGenre(Enum.valueOf(Genre.class,genre))
            .stream()
            .map(EntityDtoMapper::toDto)
            .toList();
    }
}
