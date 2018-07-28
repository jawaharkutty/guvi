import java.util.*;
class guvi3
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        String vow="aeiou";
        if(!(Character.isLetter(ch.charAt(0))&&(!(Character.isDigit(ch.charAt(0))))))
        System.out.print("invalid");
        else if(vow.contains(ch))
        System.out.print("Vowel");
        else
        System.out.print("Consonant");
    }
}
