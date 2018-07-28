import java.util.*;
class guvi4
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        if(Character.isLetter(ch.charAt(0)))
        System.out.print("Alphabet");
        else
        System.out.print("No");
    }
}
