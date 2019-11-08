package at.jku.cis.dbprovider.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iVolunteer/Person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping
	public List<Person> get() {
		return personRepository.findAll();
	}

	@GetMapping("/{ID}")
	public Person get(@PathVariable String ID) {
		return personRepository.findOne(ID);
	}

}
