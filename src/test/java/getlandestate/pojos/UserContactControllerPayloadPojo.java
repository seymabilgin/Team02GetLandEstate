package getlandestate.pojos;

import java.io.Serializable;

public class UserContactControllerPayloadPojo implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private String message;
	private boolean status;

	public UserContactControllerPayloadPojo() {
	}

	public UserContactControllerPayloadPojo(String firstName, String lastName, String email, String message, boolean status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.message = message;
		this.status = status;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"UserContactMessagePayloadPojo{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",email = '" + email + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}