package pl.pjatk.moviesAPI.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.moviesAPI.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
