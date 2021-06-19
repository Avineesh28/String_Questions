package Practical;
import java.util.*;
public class Paragraph
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sentences");
        int n=3;
        if(n<1 && n>4)
            System.out.println("Invalid");
        System.out.println("Enter paragraph");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str,"?!.");
        String s[]=str.split(" ,.?!");
        int p=st.countTokens();
        while(st.countTokens()>0)
        {
            StringTokenizer st1=new StringTokenizer(st.nextToken());
            System.out.println("Sentence-"+(p-st.countTokens())+"\t"+st1.countTokens());
        }
    }
}