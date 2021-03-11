import java.util.*;

public class National  {
    String NationName;

    HashMap<regionalElectoralOffice, Integer> votes = new HashMap<regionalElectoralOffice, Integer> ();

        National (String NationName){
            this.NationName=NationName;

        }

        public String getNationName(){
            return NationName;
        }
// Getter and Setter methods

public String getNationName(){
    return this.NationName;
}

public void setNationName(String NationName) {
    this.NationName = NationName;
}

    public void maxCount() {
        int maxValue = (Collections.max(votes.values()));

        int maxValueInMap=(Collections.max(votes.values()));  // This will return max value in the Hashmap
        regionalElectoralOffice winner = new regionalElectoralOffice();
        for (Map.Entry<regionalElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                winner = entry.getKey();     // Print the key with max value
            }
        }
        System.out.println("Winner: " + winner.ge + ":" + votes.get(winner) + " votes");

    }

        public void minCount() {
            int minValue = (Collections.max(votes.values()));
    
            int minValueInMap=(Collections.min(votes.values()));  // This will return max value in the Hashmap
            regionalElectoralOffice last = new regionalElectoralOffice();
            for (Map.Entry<regionalElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
                if (entry.getValue()==minValueInMap) {
                    last = entry.getKey();     // Print the key with max value
                }
            }
    
            System.out.println("Last place: " + last.getRegionName" votes");
    
        }



}