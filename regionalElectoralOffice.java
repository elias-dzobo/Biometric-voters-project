import java.io.PrintWriter;
import java.util.*;

/**
 * @author Michael Ofori(Group 5)
 * Regional Electoral Office Class.
 */

public class regionalElectoralOffice {
    private int regionalElectoralOfficeID;
     private String regionName;


    // Hashmap Regional Level 
    HashMap<DistrictElectoralOffice, Integer> votes = new HashMap<DistrictElectoralOffice, Integer>();

  

     regionalElectoralOffice(int regionalElectoralOfficeID, String regionName) {
		this.regionalElectoralOfficeID = regionalElectoralOfficeID;
		this.regionName = regionName;
	}
    /**
     * @return regionalElectoralOfficeID
     */
    public int getRegionalElectoralOfficeID() {
        return regionalElectoralOfficeID;
    }
    /**
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }
    /**
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    /**
     * @param regionalElectoralOfficeID
     */
    public void setRegionalElectoralOfficeID(int regionalElectoralOfficeID) {
        this.regionalElectoralOfficeID = regionalElectoralOfficeID;
    }
   
    /**
     * Count method to count the number of votes in the region.
     * @param region
     * @return votes
     */
    public void regionalLevel(DistrictElectoralOffice region) {
        if (votes.containsKey(region)) {
            int curVotes = votes.get(region);
            votes.replace(region, curVotes+1);
        } else {
            votes.put(region, 1);
        }
    }public void Counter(){
     for ( Object e:votes.keySet() ){
         System.out.println(votes.values());
     }

    }

    public void maxCount() {
        int maxValue = (Collections.max(votes.values()));

        int maxValueInMap=(Collections.max(votes.values()));  // This will return max value in the Hashmap
        DistrictElectoralOffice winner = new DistrictElectoralOffice(maxValueInMap, regionName);
        for (Map.Entry<DistrictElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                winner = entry.getKey();     // Print the key with max value
            }
        }

        System.out.println("Winner: " + winner.getdistrictName() + ":" + votes.get(winner) + " votes");

    }
    public void minCount() {
        int minValue = (Collections.max(votes.values()));

        int minValueInMap=(Collections.min(votes.values()));  // This will return max value in the Hashmap
        DistrictElectoralOffice last = new DistrictElectoralOffice(minValueInMap, regionName);
        for (Map.Entry<DistrictElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==minValueInMap) {
                last = entry.getKey();     // Print the key with max value
            }
        }

        System.out.println("Last place: " + last.getdistrictName() + ":" + votes.get(last) + " votes");

    }

    /**
     * To string method
     * @return the regionID and name.
     */
    public String toString(){
        return "[ Regional Electoral ID: "+getRegionalElectoralOfficeID()+ "Region Name: "+getRegionName()+ "]";  
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
