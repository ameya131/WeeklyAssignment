import java.util.*;

class Bucket{
    int tokens=5;
    long last=System.currentTimeMillis();
}

public class weekly{

    static HashMap<String,Bucket> map=new HashMap<>();

    static boolean allow(String client){
        Bucket b=map.computeIfAbsent(client,k->new Bucket());
        if(b.tokens>0){
            b.tokens--;
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        for(int i=0;i<7;i++)
            System.out.println(allow("abc"));
    }
}