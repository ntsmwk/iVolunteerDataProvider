package at.jku.cis.dbprovider.personrole;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRoleRepository extends MongoRepository<PersonRole, String> {

	List<PersonRole> findByPersonID(String personID);
}
