package model;

public class MessageStore {
	private String message;
	
	public MessageStore() {
		message = "Hello World from MessageStore Object!!";
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
	    return message + " (from toString)";
	}
}
