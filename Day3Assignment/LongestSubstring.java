package Day3Assignment;

import java.util.*;

public class LongestSubstring {
    
    public static void main(String[] args) {
        
        String s="malytwsracstahtdjkjdkjk";

        Set<Character>set=new HashSet<>();
        int n=s.length();
        int left=0;
        int start=0,end=0;
        int maxLen=0;
        for(int i=0;i<n;++i)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            if(maxLen<(i-left+1))
            {
                start=left;
                end=i;
                maxLen=(i-left+1);
            }
            set.add(s.charAt(i));
        }

        System.out.println(
            s.substring(start,end+1)
        );

    }
}
