package pl.pjatk.moviesAPI.services;

import org.springframework.stereotype.Service;
import pl.pjatk.moviesAPI.model.Review;

@Service
public class ReviewService {

    public Review createReview(String reviewBody, String imdbId){
        Review review = new Review(reviewBody);
    }
}
