package nl.marcenschede.tests.advanceliquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private PersonRepository repo;

    @GetMapping
    public Iterable<Person> persons() {
        return repo.findAll();
    }
}
