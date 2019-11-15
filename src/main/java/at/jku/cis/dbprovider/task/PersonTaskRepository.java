package at.jku.cis.dbprovider.task;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonTaskRepository extends MongoRepository<PersonTask, String> {

	List<PersonTask> findByPersonID(String personID);

}
