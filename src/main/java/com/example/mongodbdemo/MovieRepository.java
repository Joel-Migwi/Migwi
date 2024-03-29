package com.example.mongodbdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository <Movie, String>{

    Movie findMovieById(String movieId);
}
