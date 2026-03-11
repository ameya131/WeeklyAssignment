import java.util.*;

public class weekly{

    static HashMap<String,Integer> views=new HashMap<>();
    static HashMap<String,Set<String>> visitors=new HashMap<>();

    static void process(String url,String user){
        views.put(url,views.getOrDefault(url,0)+1);
        visitors.putIfAbsent(url,new HashSet<>());
        visitors.get(url).add(user);
    }

    public static void main(String[] args){
        process("/news","u1");
        process("/news","u2");
        process("/sports","u3");

        views.entrySet().stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .limit(2)
                .forEach(System.out::println);
    }
}