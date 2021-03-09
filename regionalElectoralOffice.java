

/**
 * @author Michael Ofori(Group 5)
 * Regional Electoral Office Class.
 */

public class regionalElectoralOffice {
    private int regionalElectoralOfficeID;
    private String regionName;
    
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
     * @param regionalElectoralOfficeID
     * @param regionName
     */
    public regionalElectoralOffice(int regionalElectoralOfficeID, String regionName) {
        this.regionalElectoralOfficeID = regionalElectoralOfficeID;
        this.regionName = regionName;
    }
    
}
