package pl.pjatk.moviesAPI.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pjatk.moviesAPI.model.Movie;
import pl.pjatk.moviesAPI.repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
   private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(ObjectId id){
        return movieRepository.findById(id);
    }

}
