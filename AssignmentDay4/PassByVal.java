package AssignmentDay4;

public class PassByVal {

    private void modifyPrimitive(int x)
    {
        x=100;
    }
    private void modifyNonprimitive(int[]arr)
    {
        arr[0]=100;
    }
    public static void main(String[] args) {
        PassByVal obj=new PassByVal();
        int x=50;
        int[]arr={1,2,3};
        obj.modifyPrimitive(x);
        obj.modifyNonprimitive(arr);

        System.out.println(x);
        System.out.println(arr[0]);

    }
}
