package Day3Assignment;

public class AnagramCheck {
    public static void main(String[] args) {
        String s="malayasahu";
        String t="husalayama";
        if(s.length()!=t.length())
        {
            System.out.println("String are not anagram");
            return;
        }
        int[]map1=new int[26];
        int[]map2=new int[26];
        int n=s.length();
        for(int i=0;i<n;++i)
        {
           map1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;++i)
        {
           map2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;++i)
        {
            if(map1[i]!=map2[i])
            {
                System.out.println("String are not anagram");
                return;
            }
        }
        
        System.out.println("String are anagram");
    }
}
