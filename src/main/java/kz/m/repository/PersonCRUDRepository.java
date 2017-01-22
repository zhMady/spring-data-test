package kz.m.repository;

import kz.m.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pc on 22.01.2017.
 */

public interface PersonCrudRepository extends CrudRepository<Person, Long> {

}
