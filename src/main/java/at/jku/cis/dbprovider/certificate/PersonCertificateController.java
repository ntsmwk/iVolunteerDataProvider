package at.jku.cis.dbprovider.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iVolunteer/PersonCertificates")
public class PersonCertificateController {

	@Autowired
	private PersonCertificateRepository personCertificateRepository;

	@GetMapping("/{ID}")
	public List<PersonCertificate> getPersonCertificates(@PathVariable String ID){
		return personCertificateRepository.findAll();
	}

}
