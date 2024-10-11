package pe.vallegrande.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.vallegrande.workshop.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> {
}
