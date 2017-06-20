package service;

import model.Person;

/**
 * Created by champ on 6/20/2017 AD.
 */
public class EditServiceInMemory implements EditService {
    private static Person person;
    static {
        person = new Person();
        person.setFirstName("Champ FirstName");
        person.setLastName("Champ LastName");
        person.setEmail("champ@champ.com");
        person.setGender("male");
        person.setResidency("TH");
        person.setCarModels(new String[]{"Nissan", "Mazda"});
        person.setOver21(true);
        person.setSport("basketball");
    }
    public Person getPerson() {
        return EditServiceInMemory.person;
    }

    public void savePerson(Person person) {
        EditServiceInMemory.person.setFirstName(person.getFirstName());
        EditServiceInMemory.person.setLastName(person.getLastName());
        EditServiceInMemory.person.setEmail(person.getEmail());
        EditServiceInMemory.person.setGender(person.getGender());
        EditServiceInMemory.person.setResidency(person.getResidency());
        EditServiceInMemory.person.setCarModels(person.getCarModels());
        EditServiceInMemory.person.setOver21(person.isOver21());
        EditServiceInMemory.person.setSport(person.getSport());
    }

}
