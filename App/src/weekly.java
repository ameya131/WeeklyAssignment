import java.util.*;

class Entry{
    String ip;
    long expiry;
    Entry(String ip,long ttl){
        this.ip=ip;
        this.expiry=System.currentTimeMillis()+ttl;
    }
}

public class weekly{

    static HashMap<String,Entry> cache=new HashMap<>();

    static String resolve(String domain){
        Entry e=cache.get(domain);
        if(e!=null && System.currentTimeMillis()<e.expiry){
            return "Cache HIT "+e.ip;
        }
        String ip="172.1.1."+new Random().nextInt(255);
        cache.put(domain,new Entry(ip,5000));
        return "Cache MISS "+ip;
    }

    public static void main(String[] args){
        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));
    }
}