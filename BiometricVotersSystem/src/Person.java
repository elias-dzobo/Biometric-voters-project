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

       Person p1 = new Person();

    }


}