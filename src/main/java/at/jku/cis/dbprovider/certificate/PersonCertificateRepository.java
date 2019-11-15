package at.jku.cis.dbprovider.certificate;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonCertificateRepository extends MongoRepository<PersonCertificate, String>{

	List<PersonCertificate> findByPersonID(String personID);
}
