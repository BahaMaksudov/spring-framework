package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genreList") //if we dont put mappedBy it will create 2 join tables
    private List<Movie> movieList;


    public Genre(String name) {
        this.name = name;
    }
}
