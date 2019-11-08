package at.jku.cis.dbprovider;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.jku.cis.dbprovider.person.ContactDetail;
import at.jku.cis.dbprovider.person.Person;
import at.jku.cis.dbprovider.person.PersonRepository;

@SpringBootApplication
public class Application {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void init() {
		Person person = new Person("asdf", "asfdasfd", "asdfasdf", "asdfasdf", "asdf", new ContactDetail[] {new ContactDetail()}, "asdfasf");
		personRepository.save(person);
	}
}
