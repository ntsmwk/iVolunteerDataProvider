package at.jku.cis.dbprovider.task;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonTaskRepository extends MongoRepository<PersonTask, String> {

}
