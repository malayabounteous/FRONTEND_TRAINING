package Day3Assignment;

import java.util.*;

public class RomanToInt {

    public static void main(String[] args) {
        
        Map<Character,Integer>map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        String s="MCMXCIV";
        int n=s.length();
        int ans=map.get(s.charAt(n-1));
        int i=n-2;
        while(i>=0)
        {
           
           char prev=s.charAt(i+1);
           char cur=s.charAt(i);

           if(map.get(prev)>map.get(cur))
           {
            ans-=map.get(cur);
           }
           else
           {
            ans+=map.get(cur);
           }
           i--;
        }
        System.out.println(ans);

        

    }
    
}
