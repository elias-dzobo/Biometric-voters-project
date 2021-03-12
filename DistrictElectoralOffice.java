import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;

public class DistrictElectoralOffice {
	private int districtID;
	private String districtName;
	private String region;
	
	HashMap<PollingStation, Integer> votes = new HashMap<PollingStation, Integer> ();
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
	
	/*
	 * the count methods
	 */
	
	public void districtLevel(PollingStation district) {
        if (votes.containsKey(district)) {
            int curVotes = votes.get(district);
            votes.replace(district, curVotes+1);
        } else {
            votes.put(district, 1);
        }
    }public void Counter(){
     for ( Object e:votes.keySet() ){
         System.out.println(votes.values());
     }

    }

    public void maxCount() {
        int maxValue = (Collections.max(votes.values()));
        // Return max value in the Hashmap
        int maxValueInMap=(Collections.max(votes.values()));  
        PollingStation winner = new PollingStation(); 
        // Iterate through hashmap
        for (Map.Entry<PollingStation, Integer> entry : votes.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
            	
            	// Print the key with max value
                winner = entry.getKey();    
            }
        }

        System.out.println("Winner: " + winner.getName() + ":" + votes.get(winner) + " votes");

    }
    public void minCount() {
        int minValue = (Collections.max(votes.values()));
        // Return min value in the Hashmap
        int minValueInMap=(Collections.min(votes.values()));  
        PollingStation last = new PollingStation(); 
        // Iterate through hashmap
        for (Map.Entry<PollingStation, Integer> entry : votes.entrySet()) {  
            if (entry.getValue()==minValueInMap) {
            	// Print the key with min value
                last = entry.getKey();     
            }
        }

        System.out.println("Last place: " + last.getName() + ":" + votes.get(last) + " votes");

    }
	
	// toString
	public String toString() {
		return "Name: " + this.getdistrictName() +"| " + "ID: " + this.getdistrictID();
	}
	public void writeFile(){
        PrintWriter pw=null;
        try{
            pw =  new PrintWriter("votes.txt");
            for(Object e : votes.values()){
                pw.println();
            }
            pw.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
         System.out.println("Printing completed");
        }

}
