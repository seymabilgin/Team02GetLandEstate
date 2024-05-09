package getlandestate.pojos;

import java.io.Serializable;

public class AdvertTypePayloadPojo implements Serializable {
	private String title;

	public AdvertTypePayloadPojo() {
	}

	public AdvertTypePayloadPojo(String title) {
		this.title = title;
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
			"AdvertTypePayloadPojoPOJO{" + 
			"title = '" + title + '\'' + 
			"}";
		}
}