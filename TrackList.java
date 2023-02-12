import java.util.HashMap;
import java.util.Set;
public class TrackList {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        trackList.put("Bohemian Rhapsody: ", "Queen");
        trackList.put("Whole Lotta Love: ", "Led Zeppelin");
        trackList.put("Born To Run: ", "Bruce Springsteen");
        trackList.put("Hotel California: ", "Eagles");

        //Prompt: "PULL OUT ONE OF THE SONGS BY TRACK TITLE"
        /*String name = trackList.get("Bohemian Rhapsody");
        System.out.println(name);*/

        //Prompt: "PRINT OUT ALL OF THE TRACK NAMES AND LYRICS IN 'TRACK: LYRICS" FORMAT.

        Set<String> songKeys = trackList.keySet();
        for(String key : songKeys){
            System.out.println(key +  trackList.get(key));
            //System.out.println(trackList.get(key));
        }


    }
}