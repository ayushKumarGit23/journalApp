package JournalApp.repositry;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


import JournalApp.entity.User;
import java.util.List;


public interface UserRepository extends MongoRepository<User,ObjectId> {

    User findByUserName(String username);
}
