package com.movie.server;

import com.movie.server.models.Movie;
import com.movie.server.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "/allMovies", method = RequestMethod.GET)
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    @RequestMapping(value = "/Movie/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable("id") ObjectId id) {
        return movieRepository.findBy_id(id);
    }

    @RequestMapping(value = "/addMovie", method = RequestMethod.POST)
    public @Valid Movie createMovie(@Valid @RequestBody Movie movie) {
        movie.set_id(ObjectId.get());
        movieRepository.save(movie);
        return movie;
    }
    @RequestMapping(value = "/Movie/{id}", method = RequestMethod.DELETE)
    public void deleteMovie(@PathVariable ObjectId id) {
        movieRepository.delete(movieRepository.findBy_id(id));
    }

    @RequestMapping(value = "/Movie/{id}", method = RequestMethod.PUT)
    public void modifyMovieById(@PathVariable("id") ObjectId id, @Valid @RequestBody Movie movie) {
        movie.set_id(id);
        movieRepository.save(movie);
    }




}
