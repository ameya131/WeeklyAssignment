import java.util.*;

public class weekly {

    static HashMap<String,Integer> users = new HashMap<>();
    static HashMap<String,Integer> attempts = new HashMap<>();

    static boolean checkAvailability(String username){
        attempts.put(username, attempts.getOrDefault(username,0)+1);
        return !users.containsKey(username);
    }

    static List<String> suggest(String username){
        List<String> list = new ArrayList<>();
        list.add(username+"1");
        list.add(username+"2");
        list.add(username.replace("_","."));
        return list;
    }

    static String getMostAttempted(){
        return Collections.max(attempts.entrySet(),Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args){
        users.put("john_doe",1);

        System.out.println(checkAvailability("john_doe"));
        System.out.println(checkAvailability("jane_smith"));
        System.out.println(suggest("john_doe"));
    }
}