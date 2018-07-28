import java.util.*;
class guvi1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        if(z<0)
        System.out.print("Negative");
        else if(z>0)
        System.out.print("Positive");
        else
        System.out.print("Zero");
    }
}
