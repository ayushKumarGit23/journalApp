package JournalApp.repositry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import JournalApp.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,ObjectId> {

}
