import java.util.*;
class guvi2
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int abc=sc.nextInt();
        if(abc<0)
        System.out.print("invalid");
        else if(abc>=0)
        {
            if(abc%2==0||abc==0)
            System.out.print("Even");
            else
            System.out.print("Odd");
        }
    }
}
