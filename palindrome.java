import java.util.*;
import java.lang.*;
public class palindrome {
    public static void main(String[] arg){
 
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // String start = n1+"000000";
        // String end = n2+"235959";
        int count =0;
        for(int i=n1;i<=n2;i++){
            for(int hh=0;hh<24;hh++){
                for(int mm=0;mm<60;mm++){
                    for(int ss=0;ss<60;ss++){
                        String s = i+ret_(hh)+ret_(mm)+ret_(ss);
                        // if(i==1 && hh==23 && ss==59 && mm==59)
                        //     System.out.println(s);
                        if(isPallindrome(s.trim())){
                            // System.out.println(s);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    static String ret_(int val){
        if(val<=9)
            return "0"+val;
        else return val +"";
    }

    static boolean isPallindrome(String s){
        return new String(new StringBuffer(s).reverse()).equals(s);
    }
}