import java.util.*;

/**
 * @author Michael Ofori(Group 5)
 * Regional Electoral Office Class.
 */

public class regionalElectoralOffice {
    private int regionalElectoralOfficeID;
    private String regionName;

    private HashMap<Candidate, Integer> regionResults;
    
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

    public HashMap<Candidate, Integer> getMap() {
        return this.regionResults;
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
     * @param regionalElectoralOfficeID
     * @param regionName
     */
    public regionalElectoralOffice(int regionalElectoralOfficeID, String regionName) {
        this.regionalElectoralOfficeID = regionalElectoralOfficeID;
        this.regionName = regionName;
    }
    
    /**
     * To string method
     * @return the regionID and name.
     */
    public String toString(){
        return "[ Regional Electoral ID: "+getRegionalElectoralOfficeID()+ "Region Name: "+getRegionName()+ "]";  
    }


    public void collateDistrictResults(HashMap<Candidate, Integer> DistrictResults){
        for (Map.Entry<Candidate, Integer> entry: DistrictResults.entrySet()) {
            if (regionResults.containsKey(entry.getKey())) {
                int a = entry.getValue();
                regionResults.replace(entry.getKey(), entry.getValue()+a);
            } else {
                regionResults.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void Counter(){
        System.out.println(this.getMap());
    }

    
    
}
