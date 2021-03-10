import java.util.*;

class PollingStation {

    int pollingID;
    String District;
    String name;

    // hashmap votes
    HashMap<Candidate, Integer> votes = new HashMap<Candidate, Integer>();


    PollingStation(){

    }

    PollingStation(int id, String district, String name) {
        this.pollingID = id;
        this.District = district;
        this.name = name;
    }

    // Getter and Setter methods

    public int getID(){
        return this.pollingID;
    }

    public String getDistrict(){
        return this.District;
    }


    public String getName(){
        return this.name;
    }

    public void registerVote(Candidate prez) {
        if (votes.containsKey(prez)) {
            int curVotes = votes.get(prez);
            votes.replace(prez, curVotes+1);
        } else {
            votes.put(prez, 1);
        }
    }

    public void Counter(){
        System.out.println(votes);
    }


    public void maxCount() {
        int maxValue = (Collections.max(votes.values()));

        int maxValueInMap=(Collections.max(votes.values()));  // This will return max value in the Hashmap
        Candidate winner = new Candidate();
        for (Map.Entry<Candidate, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                winner = entry.getKey();     // Print the key with max value
            }
        }

        System.out.println("Winner: " + winner.getName() + ":" + votes.get(winner) + " votes");

    }


    public void minCount() {
        int maxValue = (Collections.max(votes.values()));

        int maxValueInMap=(Collections.min(votes.values()));  // This will return max value in the Hashmap
        Candidate winner = new Candidate();
        for (Map.Entry<Candidate, Integer> entry : votes.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                winner = entry.getKey();     // Print the key with max value
            }
        }

        System.out.println("Last place: " + winner.getName() + ":" + votes.get(winner) + " votes");

    }
}