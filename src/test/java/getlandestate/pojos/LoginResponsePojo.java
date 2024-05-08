package getlandestate.pojos;

import java.io.Serializable;

public class LoginResponsePojo implements Serializable {
	private String token;
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String role;
	private Object profilePhoto;

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
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

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setProfilePhoto(Object profilePhoto){
		this.profilePhoto = profilePhoto;
	}

	public Object getProfilePhoto(){
		return profilePhoto;
	}

	@Override
 	public String toString(){
		return 
			"LoginResponsePojo{" + 
			"token = '" + token + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",phone = '" + phone + '\'' + 
			",role = '" + role + '\'' + 
			",profilePhoto = '" + profilePhoto + '\'' + 
			"}";
		}
}