package getlandestate.pojos;

import java.io.Serializable;

public class LoginPayloadPojo implements Serializable {
	private String email;
	private String password;

	public LoginPayloadPojo() {
	}

	public LoginPayloadPojo(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	@Override
 	public String toString(){
		return 
			"LoginPayloadPojo{" + 
			"email = '" + email + '\'' + 
			",password = '" + password + '\'' + 
			"}";
		}
}