import java.util.*;

public class weekly{

    static HashMap<String,Integer> freq=new HashMap<>();

    static List<String> search(String prefix){
        List<String> res=new ArrayList<>();
        for(String q:freq.keySet())
            if(q.startsWith(prefix)) res.add(q);

        res.sort((a,b)->freq.get(b)-freq.get(a));
        return res.subList(0,Math.min(3,res.size()));
    }

    public static void main(String[] args){
        freq.put("java tutorial",100);
        freq.put("javascript",80);
        freq.put("java download",60);

        System.out.println(search("jav"));
    }
}