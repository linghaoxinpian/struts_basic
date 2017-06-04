package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Person;

public class RegisterAction extends ActionSupport {

	private Person personBean;

	public String execute() throws Exception {
		// call Service class to store personBean's state in database
		// .....
		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}
	
	//表单验证
	public void validate(){
	    if (personBean.getFirstName().length() == 0) {
	        addFieldError("personBean.firstName", "First name is required.");
	    }

	    if (personBean.getEmail().length() == 0) {
	        addFieldError("personBean.email", "Email is required.");
	    }

	    if (personBean.getAge() < 18) {
	        addFieldError("personBean.age", "Age is required and must be 18 or older");
	    }
	}
}
