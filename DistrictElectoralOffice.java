
public class DistrictElectoralOffice {
	private int districtID;
	private String districtName;
	
	// constructor
	public DistrictElectoralOffice(int districtID, String districtName) {
		this.districtID = districtID;
		this.districtName = districtName;
	}
	
	// accessor method
	public int getdistrictID() {
		return this.districtID;
	}
	
	public String getdistrictName() {
		return this.districtName;
	}
	
	// mutator method
	@SuppressWarnings("unused")
	private void setdistrictID(int pdistrictID){
		this.districtID = pdistrictID;
		}
	@SuppressWarnings("unused")
	private void setdistrictName(String pdistrictName){
		this.districtName = pdistrictName;
		}
	
	// toString
	public String toString() {
		return "Name: " + this.getdistrictName() +"| " + "ID: " + this.getdistrictID();
	}

}
