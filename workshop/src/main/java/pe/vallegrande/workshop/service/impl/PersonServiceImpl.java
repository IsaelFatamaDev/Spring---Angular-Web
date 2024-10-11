package pe.vallegrande.workshop.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.vallegrande.workshop.model.Person;
import pe.vallegrande.workshop.repository.PersonRepository;
import pe.vallegrande.workshop.service.PersonService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(String id, Person person) {
        return personRepository.findById(id)
                .map(res -> {
                    res.setName(person.getName());
                    res.setLastname(person.getLastname());
                    res.setBirthday(person.getBirthday());
                    res.setGender(person.getGender());
                    return personRepository.save(res);
                }).orElseThrow();
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void delete(String id) {
        personRepository.findById(id)
                .ifPresent(personRepository::delete);
    }
}