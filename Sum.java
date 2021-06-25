import java.util.*;
public class Sum
{
    String str1,str2,str3;
    Sum()
    {
        str1=str2=str3="";
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter numbers");
        str1=sc.nextLine();
        str2=sc.nextLine();
    }

    void sum()
    {
        int carry=0;
        int s=0;
        int m=str1.length();
        int n=str2.length();
        if(m==n)
        {
            for(int i=m-1;i>=0;i--)
            {
                s=(str1.charAt(i)-48)+(str2.charAt(i)-48);
                if(carry!=0)
                    s+=carry;
                carry=s/10;
                s=s%10;
                str3=s+str3;       
            }
            if(carry!=0)
                str3=carry+str3;
        }
        else if(m>n)
        {
            while(n>0)
            {
                s=(str1.charAt(--m)-48)+(str2.charAt(--n)-48);
                if(carry!=0)
                    s+=carry;
                carry=s/10;
                s=s%10;
                str3=s+str3;       
            }
            int a=Integer.parseInt(str1.substring(0,m));
            a+=carry;
            str3=a+str3;
        }
        else
        {
            while(m>0)
            {
                s=(str1.charAt(--m)-48)+(str2.charAt(--n)-48);
                if(carry!=0)
                    s+=carry;
                carry=s/10;
                s=s%10;
                str3=s+str3;       
            }
            int a=Integer.parseInt(str2.substring(0,n));
            a+=carry;
            str3=a+str3;
        }
    }

    void display()
    {
        System.out.println("Sum-"+str3);
    }
    
    public static void main(String args[])
    {
        Sum obj=new Sum();
        obj.input();
        obj.sum();
        obj.display();   
    }
}