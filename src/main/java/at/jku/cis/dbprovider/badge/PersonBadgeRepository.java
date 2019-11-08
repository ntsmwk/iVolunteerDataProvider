package at.jku.cis.dbprovider.badge;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonBadgeRepository extends MongoRepository<PersonBadge, String> {

}
