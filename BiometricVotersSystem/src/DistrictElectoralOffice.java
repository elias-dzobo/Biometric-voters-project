import java.util.*;


public class DistrictElectoralOffice {
	private int districtID;
	private String districtName;
	private String region;

	public HashMap<Candidate, Integer> results;
	
	// constructor
	public DistrictElectoralOffice(int districtID, String districtName, String region) {
		this.districtID = districtID;
		this.districtName = districtName;
		this.region = region;
	}

	public DistrictElectoralOffice(){
		
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

	public void collateResults(HashMap<Candidate, Integer> votes){
        for (Map.Entry<Candidate, Integer> entry: votes.entrySet()) {
            if (results.containsKey(entry.getKey())) {
                int a = entry.getValue();
                results.replace(entry.getKey(), entry.getValue()+a);
            } else {
                results.put(entry.getKey(), entry.getValue());
            }
        }
    }

	public void forwardDistrictResults(regionalElectoralOffice r1){
		r1.collateDistrictResults(results);
	}

}
