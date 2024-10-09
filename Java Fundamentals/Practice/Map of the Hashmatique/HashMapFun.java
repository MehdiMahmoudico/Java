import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Uprising", "Paranoia is in bloom, The PR transmissions will resume...");
        userMap.put("Starlight", "Far away, this ship is taking me far away...");
        userMap.put("Supermassive Black Hole", "Oh baby, don't you know I suffer? Oh baby, can you hear me moan?");
        userMap.put("Knights of Cydonia", "Come ride with me through the veins of history...");
        String songTitle = "Uprising";
        System.out.println("Song Title: " + songTitle + " : " + userMap.get(songTitle));
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}

