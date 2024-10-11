package pe.vallegrande.workshop.service;

import org.springframework.stereotype.Service;
import pe.vallegrande.workshop.model.Person;

import java.util.List;

public interface PersonService {
    Person save(Person person);
    Person update(String id, Person person);
    List<Person> findAll();
    void delete(String id);
}
