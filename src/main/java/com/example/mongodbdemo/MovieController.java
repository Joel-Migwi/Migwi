package com.example.mongodbdemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Node;

import java.util.List;
import java.util.logging.Logger;


@RestController
public class MovieController {
//private Logger logger= (Logger) LoggerFactory.getLogger(MovieController.class);
@Autowired
private MovieRepository movieRepository;

@GetMapping(value = "/")
public List<Movie> getAllMovies() {
    //logger.info("Getting All Movies" );
    return movieRepository.findAll();
}
@GetMapping(value="/{movieId}")
public Movie getMovieById(@PathVariable String movieId){
    //logger.info("Getting Movie with ID:");
    return  movieRepository.findMovieById(movieId);
}
@PostMapping(value="/create")
    public Movie addMovie(@RequestBody Movie movie) {
    //logger.info("saving movie");
    return movieRepository.save(movie);
}
@PutMapping(value="/update/{movieId}")
    public Movie updateMovie(@PathVariable String movieId, @RequestBody Movie movie) {
   // logger.info("Updating Movie with id ");
    return movieRepository.save(movie);
}
@DeleteMapping(value = "/delete/{movieId}")
    public void deleteMovie(@PathVariable String movieId){
//    logger.info("Deleting movie");
    movieRepository.deleteById(movieId);
}

}
