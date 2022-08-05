package br.com.erudio.services;

import br.com.erudio.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("[LOG SERVICE] - Finding all people!");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id) {
        logger.info("[LOG SERVICE] - Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Gustavo");
        person.setLastName("Moraes");
        person.setAddress("São Paulo - SP");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person) {
        logger.info("[LOG SERVICE] - Creating one person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("[LOG SERVICE] - Updating one person!");
        return person;
    }

    public void delete(String id) {
        logger.info("[LOG SERVICE] - Deleting one person!");
    }


    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name: " +i);
        person.setLastName("Last name: " +i);
        person.setAddress("Some address in brazil " +i);
        person.setGender("Gender: " +i);

        return person;
    }
}
