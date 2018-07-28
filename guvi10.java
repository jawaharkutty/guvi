import java.util.*;
class guvi10
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int no=0;
        int n=0;
        while(N>0)
        {
            no=N%10;
            N=N/10;
            n++;
        }
        System.out.print(n);
    }
}
