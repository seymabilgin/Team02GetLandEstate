package getlandestate.pojos;

import java.io.Serializable;

public class UsersPatchResponsePojo implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String role;
	private Object profilePhoto;

	public UsersPatchResponsePojo() {
	}

	public UsersPatchResponsePojo(int id, String firstName, String lastName, String email, String phone, String role, Object profilePhoto) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.profilePhoto = profilePhoto;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"UsersPatchResponsePojo{" + 
			"id = '" + id + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",email = '" + email + '\'' + 
			",phone = '" + phone + '\'' + 
			",role = '" + role + '\'' + 
			",profilePhoto = '" + profilePhoto + '\'' + 
			"}";
		}
}