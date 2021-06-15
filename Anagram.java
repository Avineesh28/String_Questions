import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       String t1=s1.toLowerCase();
       String t2=s2.toLowerCase();
       //form arrays
       String a1[]=t1.split(" ");
       String a2[]=t2.split(" ");
       char c1[]=new char[t1.length()-a1.length+1];
       char c2[]=new char[t2.length()-a2.length+1];
       int k=0;
       for(int i=0;i<a1.length;i++)
       {
           for(int j=0;j<a1[i].length();j++)
               c1[k++]=a1[i].charAt(j);
       }
       k=0;
       for(int i=0;i<a2.length;i++)
       {
           for(int j=0;j<a2[i].length();j++)
               c2[k++]=a2[i].charAt(j); 
       }
       Arrays.sort(c1);
       Arrays.sort(c2);
       boolean flag=true;
       for(int i=0;i<k;i++)
            if(c1[i]!=c2[i])
                flag=false;
       System.out.print("The words \""+s1+"\" and \""+s2+"\"");
       if(flag)
            System.out.println(" are Anagrams");
       else
            System.out.println(" are not Anagrams");
    }
}
