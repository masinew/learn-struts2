package action;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;
import model.Person;

public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	private static int helloCount = 0;
	private String userName;
	private Person personBean;
	
	@Override
	public String execute() throws Exception {
		messageStore = new MessageStore();
		helloCount++;
		
		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + "=> " + userName);
		}
		
		return SUCCESS;
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public int getHelloCount() {
	    return helloCount;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	
	public Person getPersonBean() {
		return personBean;
	}
}
