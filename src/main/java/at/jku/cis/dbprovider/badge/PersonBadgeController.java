package at.jku.cis.dbprovider.badge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iVolunteer/PersonBadges")
public class PersonBadgeController {

	@Autowired
	private PersonBadgeRepository personBadgeRepository;

	@GetMapping()
	public List<PersonBadge> get() {
		return personBadgeRepository.findAll();
	}
	
	@GetMapping("/{ID}")
	public List<PersonBadge> get(@PathVariable String ID) {
		return personBadgeRepository.findByPersonID(ID);
	}

}
