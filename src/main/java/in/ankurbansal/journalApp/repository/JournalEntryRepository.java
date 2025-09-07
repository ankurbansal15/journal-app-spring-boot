package in.ankurbansal.journalApp.repository;

import in.ankurbansal.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
    
}
