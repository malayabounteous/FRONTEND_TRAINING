package Assignment2_DSA;

public class MaximumSumK {
    
    public static void main(String[] args) {
        
        int[] arr={2,4,10,21,5,6,3,1,16,5};
        int k=3;

        int left=0;
        int sum=0;
        int maxSum=0;

        for(int i=0;i<k;++i)
        {
            sum+=arr[i];
        }
        maxSum=sum;

        for(int i=k;i<arr.length;++i)
        {
           sum+=arr[i]-arr[left++];
           maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
    
}
