import java.util.*;

public class weekly {

    static Set<String> ngrams(String text,int n){
        String[] w=text.split(" ");
        Set<String> set=new HashSet<>();
        for(int i=0;i<=w.length-n;i++){
            String g="";
            for(int j=0;j<n;j++) g+=w[i+j]+" ";
            set.add(g.trim());
        }
        return set;
    }

    static double similarity(String a,String b){
        Set<String> s1=ngrams(a,3);
        Set<String> s2=ngrams(b,3);
        s1.retainAll(s2);
        return s1.size()*100.0/Math.max(1,s2.size());
    }

    public static void main(String[] args){
        String d1="java is a programming language used worldwide";
        String d2="java is a programming language used in many systems";
        System.out.println("Similarity "+similarity(d1,d2)+"%");
    }
}