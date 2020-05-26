package nl.marcenschede.tests.advanceliquibase;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}
