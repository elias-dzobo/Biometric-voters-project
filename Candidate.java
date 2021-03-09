public class Candidate extends Person{
    
    String politicalParty;
    String position;
    int id;  // position on ballot slip


    Candidate(String party, String position, int id){
        super();
        this.politicalParty = party;
        this.position = position;
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getParty(){
        return this.politicalParty;
    }

    
    /** 
     * @return String
     */
    public String getPosition(){
        return this.position;
    }

    
    /** 
     * @param party
     */
    public void setParty(String party) {
        this.politicalParty = party;
    }

    
    /** 
     * @param position
     */
    public void setPosition(String position){
        this.position = position;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
