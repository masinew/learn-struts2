package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Person;
import model.State;
import service.EditService;
import service.EditServiceInMemory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditAction extends ActionSupport{
    private Person personBean;
    private EditService editService = new EditServiceInMemory();
    private String [] sports = {"football", "baseball", "basketball" };

    private String [] genders = {"male", "female", "not sure" };

    private List<State> states ;

    private String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan", "Mazda"};

    @Override
    public String execute() throws Exception {
        editService.savePerson(getPersonBean());
        return SUCCESS;
    }

    @Override
    public String input() throws Exception {
        setPersonBean(editService.getPerson());
        return INPUT;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    public List<String> getSports() {
        return Arrays.asList(sports);
    }

    public List<String> getGenders() {

        return Arrays.asList(genders);

    }



    public List<State> getStates() {

        states = new ArrayList<State>();
        states.add( new State("AZ", "Arizona") );
        states.add( new State("TH", "Thailand") );
        states.add( new State("CA", "California") );
        states.add( new State("FL", "Florida") );
        states.add( new State("KS", "Kansas") );
        states.add( new State("NY", "New York") );

        return states;
    }



    public String [] getCarModelsAvailable() {
        return carModelsAvailable;
    }


}
