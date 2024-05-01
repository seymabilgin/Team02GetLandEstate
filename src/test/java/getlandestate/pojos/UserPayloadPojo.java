package getlandestate.pojos;

import java.io.Serializable;

public class UserPayloadPojo implements Serializable {
	private String firstName;
	private String lastName;
	private String phone;
	private String password;
	private String email;

	public UserPayloadPojo() {
	}

	public UserPayloadPojo(String firstName, String lastName, String phone, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
		this.email = email;
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

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"UserPayloadPojo{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",phone = '" + phone + '\'' + 
			",password = '" + password + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}