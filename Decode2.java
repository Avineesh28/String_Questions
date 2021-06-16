import java.util.*;
public class Decode2
{
    String str;
    Decode2()
    {
        str="";
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter encrypted String");
        str=sc.nextLine();
    }
    void processing ()
    {
        int c=0;
        int m=0;
        String s="";
        while(c<=str.length()-1)
        { 
            char d=str.charAt(c);
            m=m*10;
            m=m+(d-48);
            if(m<=90 && m>=65 || m<=122 && m>=97)
            {
                s=s+(char)(m);
                m=0;
                c++;
            }
            else if((char)(m)==' ')
            { 
                s=s+(char)(m);
                m=0;
                c++;
            }
            else
                c++;
        }
        display(s);
    }
    void remove_space()
    {
        String s="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            continue;
            else
            s=s+str.charAt(i);
        }
        str=s;
    }
    void display(String s)
    {
        char c='"';
        System.out.println(c+s+c);
    }
    public static void main(String args[])
    {
        Decode2 obj=new Decode2();
        obj.input();
        obj.remove_space();
        obj.processing();
    }
}



