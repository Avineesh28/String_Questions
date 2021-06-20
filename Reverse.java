package Practical;
import java.util.*;
public class Reverse
{
    String s;
    Reverse()
    {
        s="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        s=sc.nextLine();
    }
    String reverse(String s)
    {
        if(s.length()==0)
            return "";
        else
            return reverse(s.substring(1))+s.charAt(0);
    }
    void display()
    {
        System.out.println(s);
        System.out.println(reverse(s));
    }
    public static void main(String args[])
    {
        Reverse obj=new Reverse();
        obj.input();
        obj.display();
    }
}