import java.util.*;
class guvi5
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[3];
        for(int i=0;i<3;i++)
        {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        System.out.print(num[2]);
    }
}
