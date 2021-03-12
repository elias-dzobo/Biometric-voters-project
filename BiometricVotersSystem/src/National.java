package BiometricVotersSystem.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class National extends regionalElectoralOffice {
    public String NationName;
    
    File votenum= new File("votecount.txt");

    HashMap<regionalElectoralOffice, Integer> votes = new HashMap<regionalElectoralOffice, Integer> ();

    National (String NationName){
        super(0 , " " );
        this.NationName=NationName;

    }


        public String getNationName(){
            return NationName;
        }
        public void setNationName(String NationName) {
            this.NationName = NationName;
        }
        


    public void maxCount() {
        int maxValue = (Collections.max(votes.values()));

        int maxValueInMap=(Collections.max(votes.values()));  // This will return max value in the Hashmap
        regionalElectoralOffice winner = new regionalElectoralOffice(0," ");
        for (Map.Entry<regionalElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                winner = entry.getKey();     // Print the key with max value
            }
        }
        System.out.println("Winner: " + winner.getRegionName() + ":" + votes.get(winner) + " votes");
    }

        public void minCount() {
            int minValue = (Collections.max(votes.values()));
    
            int minValueInMap=(Collections.min(votes.values()));  // This will return max value in the Hashmap
            regionalElectoralOffice last = new regionalElectoralOffice(0," ");
            for (Map.Entry<regionalElectoralOffice, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
                if (entry.getValue()==minValueInMap) {
                    last = entry.getKey();     // Print the key with max value
                }
            }
    
            System.out.println("Last place: " + last.getRegionName() + ":" + votes.get(last) + " votes");
    
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