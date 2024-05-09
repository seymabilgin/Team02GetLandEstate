package getlandestate.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertTypeResponsePojo implements Serializable {
	private int id;
	private String title;

	public AdvertTypeResponsePojo() {
	}

	public AdvertTypeResponsePojo(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}



	@Override
 	public String toString(){
		return 
			"ResponsePOJO{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' +
			"}";
		}
}