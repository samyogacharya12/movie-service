package com.movie_service.entity;

import com.movie_service.enumconstant.Genre;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movie")
public class Movie {


    @Id
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "release")
    private Integer releaseYear;

    @Enumerated(EnumType.STRING)
    private Genre genre;



}
