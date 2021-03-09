class Person {

    // instance variables
    String name;
    int age;

    // default constuctor
    Person() {

    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * @return int
     */
    public int getAge(){
        return this.age;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @param age
     */
    public void setAge(int age) {
        // people must be 18 years and above
        if (age < 18 ) {
            System.out.println("User is inelligebile and must be over the age of 18");
        } else {
            this.age = age;
        }
        
    }



    public static void main(String[] args) {

        // first voter
        Voter patrick = new Voter(21100, "Kwabenya");
        patrick.setAge(19);

        
        ElectoralOfficer plange = new ElectoralOfficer("Acp", "Ga West");

        Candidate nana = new Candidate("NPP", "presidency", 1);

        Voter Eric = new Voter(12300, "Airpot Hills");
        Eric.setAge(19);

        Eric.vote();

        patrick.vote();

        patrick.ballotCount();  // expected count should be 2 since two people have voted

        // 3rd voter
        Voter Ivy = new Voter(202023, "Taifa");
        Ivy.setAge(22);

        Ivy.vote();

        // vote should be invalid since patrick has already voted
        patrick.vote();

        // Output should be 3 sinve ivy voted and patricks second vote was invalid
        System.out.println(Ivy.ballotCount());

    }


}