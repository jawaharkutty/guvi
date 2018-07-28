import java.util.*;
class guvi7
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="Hello";
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
            System.out.println(str);
            else
            System.out.print(str);
        }
    }
}
