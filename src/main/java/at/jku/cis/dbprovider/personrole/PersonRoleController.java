package at.jku.cis.dbprovider.personrole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.jku.cis.dbprovider.person.Person;

@RestController
@RequestMapping("/iVolunteer/PersonRoles")
public class PersonRoleController {

	@Autowired
	private PersonRoleRepository personRoleRepository;

	@GetMapping("/{ID}")
	public List<PersonRole> get(@PathVariable String ID) {
		return personRoleRepository.findByPersonID(ID);
	}

}
