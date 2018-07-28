import java.util.*;
class guvipro
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int n=Integer.parseInt(s[1]);
        System.out.print(s[0].substring(n));
    }
}
