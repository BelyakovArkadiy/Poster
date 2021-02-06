package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Poster {
    private int id;
    private int movieId;
    private String movieName;
    private int count;


}
