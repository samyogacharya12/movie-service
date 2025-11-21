package com.movie_service.dto;

import com.movie_service.enumconstant.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
