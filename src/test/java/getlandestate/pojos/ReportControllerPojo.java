package getlandestate.pojos;

import java.io.Serializable;

public class ReportControllerPojo implements Serializable {
	private int totalAdverts;
	private int totalUsers;
	private int totalAdvertTypes;
	private int totalTourRequests;
	private int totalCategories;

	public ReportControllerPojo() {
	}

	public ReportControllerPojo(int totalAdverts, int totalUsers, int totalAdvertTypes, int totalTourRequests, int totalCategories) {
		this.totalAdverts = totalAdverts;
		this.totalUsers = totalUsers;
		this.totalAdvertTypes = totalAdvertTypes;
		this.totalTourRequests = totalTourRequests;
		this.totalCategories = totalCategories;
	}

	public void setTotalAdverts(int totalAdverts){
		this.totalAdverts = totalAdverts;
	}

	public int getTotalAdverts(){
		return totalAdverts;
	}

	public void setTotalUsers(int totalUsers){
		this.totalUsers = totalUsers;
	}

	public int getTotalUsers(){
		return totalUsers;
	}

	public void setTotalAdvertTypes(int totalAdvertTypes){
		this.totalAdvertTypes = totalAdvertTypes;
	}

	public int getTotalAdvertTypes(){
		return totalAdvertTypes;
	}

	public void setTotalTourRequests(int totalTourRequests){
		this.totalTourRequests = totalTourRequests;
	}

	public int getTotalTourRequests(){
		return totalTourRequests;
	}

	public void setTotalCategories(int totalCategories){
		this.totalCategories = totalCategories;
	}

	public int getTotalCategories(){
		return totalCategories;
	}

	@Override
 	public String toString(){
		return 
			"ReportControllerPojo{" + 
			"totalAdverts = '" + totalAdverts + '\'' + 
			",totalUsers = '" + totalUsers + '\'' + 
			",totalAdvertTypes = '" + totalAdvertTypes + '\'' + 
			",totalTourRequests = '" + totalTourRequests + '\'' + 
			",totalCategories = '" + totalCategories + '\'' + 
			"}";
		}
}