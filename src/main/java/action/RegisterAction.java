package action;

import com.opensymphony.xwork2.ActionSupport;

import model.PersonOld;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private PersonOld personOldBean;
	
	@Override
	public String execute() throws Exception {
		if (personOldBean == null) {
			return NONE;
		}
		
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		if (personOldBean != null) {
			if (personOldBean.getFirstName().length() == 0) {
				addFieldError("personBean.firstName", "Required First Name.");
			}
			if (personOldBean.getAge() <= 18) {
				addFieldError("personBean.age", "User's age must more than 18.");
			}
		}
	}
	
	public void setPersonOldBean(PersonOld personBean) {
		this.personOldBean = personBean;
	}
	
	public PersonOld getPersonOldBean() {
		return personOldBean;
	}
}
