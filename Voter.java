public class Voter extends Person {

    // instance variables
    private int ID;
    String regCenter;
    public static int count = 0;
    boolean hasVoted;

    // default constructor
    Voter() {

        hasVoted = false;

    }

    Voter(int id, String regCenter){
        super();
        this.ID = id;
        this.regCenter = regCenter;
        hasVoted = false;

    }

    @Override
    public void setAge(int age) {
        if (age < 18) {
            System.out.println("User is inelligible to vote");

        } else {
            this.age = age;
        }
    }

    
    /** 
     * @return int
     */
    public int getId(){
        return this.ID;
    }

    
    /** 
     * @param id
     */
    public void setId(int id){
        this.ID = id;
    }

    
    /** 
     * @return String
     */
    public String getCenter(){
        return this.regCenter;
    }

    
    /** 
     * @param center
     */
    public void setCenter(String center){
        this.regCenter = center;
    }

    // returns the total ballots casted
    public int ballotCount() {

        return count;
    }

    // 
    public void vote() {
        // does not allow users to vote twice
        if (hasVoted) {
            System.out.println("Voters are not allowed to vote more than once");
        } else  {
            // adds users vote to general ballot count variable
            count = count + 1;
            hasVoted = true; // chnages voting status

        }
    }

    

  
    
}
