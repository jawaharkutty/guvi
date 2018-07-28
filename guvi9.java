import java.util.*;
class guvi9
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[N];
        int no=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<K;k++)
        {
            no+=arr[k];
        }
        System.out.print(no);
    }
}
