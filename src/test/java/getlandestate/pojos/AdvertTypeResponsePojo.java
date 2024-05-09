package getlandestate.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertTypeResponsePojo implements Serializable {
	private int id;
	private String title;
	private boolean builtIn;

	public AdvertTypeResponsePojo() {
	}

	public AdvertTypeResponsePojo(int id, String title, boolean builtIn) {
		this.id = id;
		this.title = title;
		this.builtIn = builtIn;
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

	public void setBuiltIn(boolean builtIn){
		this.builtIn = builtIn;
	}

	public boolean isBuiltIn(){
		return builtIn;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePOJO{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",builtIn = '" + builtIn + '\'' + 
			"}";
		}
}