package model;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String sport;
    private String residency; 
    private boolean over21;
    private String carModel;
    private String gender;
    
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

	public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + 
        " Email:      " + getEmail() + " Age:      " + getAge() ;
    }
       
    public String getSport(){
    	return "football";
    }

    public void setSport(String sport) {
		this.sport = sport;
	}
    
    public String getResidency() {
		return "zh";
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public boolean isOver21() {
		return true;
	}

	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	public String getCarModel() {
		return "Ford";
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}