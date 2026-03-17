package Assignment3;
import java.util.*;
// You have a list of departments, each containing a list of employees. 
import java.util.stream.Collectors;

// Combine all employees from the departments  
// into a single list. 

// Identify employees whose names begin with a specified letter. 

// Arrange these employees' names in alphabetical order. 

// Gather the sorted names into a list for each starting letter. 

// Create five Sports team with each team containing randomized employees 

// Merge the five Sports stream into three divisions 

 
public class Qn1 {
     

   private  List<String>combine (List<List<String>>names)
    {
          List<String >ans=new ArrayList<>();
         ans=names.stream().flatMap(x->x.stream()).toList();
          return ans;
    }
    

    private List<String> identify(List<String>names,char ch)
    {
        List<String>ans=new ArrayList<>();
        ans=names.stream().filter((String name)->name.charAt(0)==ch).toList();
        return ans;
    }

    private List<String > arrange(List<String>names)
    {
        Collections.sort(names);
        return names;
    }
    
    Map<Character,List<String>> gather(List<String>names)
    {
        Map<Character,List<String>>ans=new HashMap<>();

        ans=names.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
        return ans;
    }
    public static void main(String[] args) {
        
        Integer[]arr=new Integer[5];
        arr[0]=10;
        arr[1]=23;
        arr[2]=34;
        arr[3]=49;
        arr[4]=80;

        Integer ans=Arrays.stream(arr).reduce(0,(a,b)->a-b);
        System.out.println(ans);


        String s="malayasahudelhiuniversity";

        Map<Character,Long>mpp=new HashMap<>();

        mpp=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(mpp);
    }
}
