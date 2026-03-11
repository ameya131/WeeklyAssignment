import java.util.*;

public class weekly{

    static LinkedHashMap<String,String> L1=
            new LinkedHashMap<>(10,0.75f,true){
                protected boolean removeEldestEntry(Map.Entry e){
                    return size()>3;
                }
            };

    static HashMap<String,String> DB=new HashMap<>();

    static String get(String id){
        if(L1.containsKey(id)) return "L1 HIT";
        if(DB.containsKey(id)){
            L1.put(id,DB.get(id));
            return "DB HIT → moved to L1";
        }
        return "NOT FOUND";
    }

    public static void main(String[] args){
        DB.put("v1","video1");
        System.out.println(get("v1"));
        System.out.println(get("v1"));
    }
}