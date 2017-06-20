package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Person;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Person personBean;
	
	@Override
	public String execute() throws Exception {
		if (personBean == null) {
			return NONE;
		}
		
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		if (personBean != null) {
			if (personBean.getFirstName().length() == 0) {
				addFieldError("personBean.firstName", "Required First Name.");
			}
			if (personBean.getAge() <= 18) {
				addFieldError("personBean.age", "User's age must more than 18.");
			}
		}
	}
	
	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	
	public Person getPersonBean() {
		return personBean;
	}
}
