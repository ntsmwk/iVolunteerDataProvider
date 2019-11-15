package at.jku.cis.dbprovider;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.jku.cis.dbprovider.task.GeoInformation;
import at.jku.cis.dbprovider.task.PersonTask;
import at.jku.cis.dbprovider.task.PersonTaskRepository;

@SpringBootApplication
public class Application {

	@Autowired
	private PersonTaskRepository personTaskRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
