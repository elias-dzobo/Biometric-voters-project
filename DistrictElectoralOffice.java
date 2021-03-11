
public class DistrictElectoralOffice {
	private int districtID;
	private String districtName;
	private String region;
	
	// constructor
	public DistrictElectoralOffice(int districtID, String districtName, String region) {
		this.districtID = districtID;
		this.districtName = districtName;
		this.region = region;
	}
	
	// accessor method
	public int getdistrictID() {
		return this.districtID;
	}
	
	public String getdistrictName() {
		return this.districtName;
	}

	public String getRegion(){
		return this.region;
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

	@SuppressWarnings("unused")
	private void setRegion(String r){
		this.region = r;
	}
	
	// toString
	public String toString() {
		return "Name: " + this.getdistrictName() +"| " + "ID: " + this.getdistrictID();
	}

}
