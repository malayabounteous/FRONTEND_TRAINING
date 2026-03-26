package AssignmentDay4;

public class BInarySearchRecursive {


    private int find(int[]arr,int target,int left,int right)
    {
        if(left>right)
            return -1;

        int mid=(left+right)/2;

        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>target)
            return find(arr,target,left,mid-1);
        else 
            return find(arr,target,mid+1,right);
    }
    public static void main(String[] args) {
        
        BInarySearchRecursive obj=new BInarySearchRecursive();
         int[]arr={4,7,10,34,56,78,145};
         System.out.println(obj.find(arr, 70, 0, arr.length-1));
        System.out.println(obj.find(arr, 78, 0, arr.length-1));

    }
}
