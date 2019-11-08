package at.jku.cis.dbprovider.certificate;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonCertificateRepository extends MongoRepository<PersonCertificate, String>{

	
}
