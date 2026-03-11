import java.util.*;

public class weekly{

    static void twoSum(int[] a,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int c=target-a[i];
            if(map.containsKey(c))
                System.out.println(map.get(c)+" "+i);
            map.put(a[i],i);
        }
    }

    public static void main(String[] args){
        int[] t={500,300,200};
        twoSum(t,500);
    }
}