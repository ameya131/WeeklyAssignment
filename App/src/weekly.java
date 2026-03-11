import java.util.*;

public class weekly {

    static HashMap<String,Integer> stock = new HashMap<>();
    static Queue<Integer> waiting = new LinkedList<>();

    static synchronized void purchase(String product,int user){
        int s = stock.getOrDefault(product,0);
        if(s>0){
            stock.put(product,s-1);
            System.out.println("Success, remaining "+(s-1));
        }else{
            waiting.add(user);
            System.out.println("Added to waiting list position "+waiting.size());
        }
    }

    public static void main(String[] args){
        stock.put("IPHONE15",2);
        purchase("IPHONE15",101);
        purchase("IPHONE15",102);
        purchase("IPHONE15",103);
    }
}