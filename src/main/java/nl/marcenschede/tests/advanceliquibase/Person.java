package nl.marcenschede.tests.advanceliquibase;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customers")
public class Person {

    @Id
    private String id;

    private String name;
}
