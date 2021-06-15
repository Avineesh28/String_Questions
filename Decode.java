import java.util.*;
public class Decode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ënter string");
        String str=sc.nextLine();
        String decode="";
        int m=0;
        String w;
        for(int i=str.length()-1;i>=0;i--)
        {
            w="";
            char c=str.charAt(i);
            if(c=='[')
            {
                m=str.charAt(i-1)-48;
                int j=i+1;
                while(Character.isLetter(str.charAt(j)))
                {
                    w=w+str.charAt(j);
                        j++;
                }
                decode=w+decode;
                for(int k=1;k<m;k++)
                    decode=decode+decode;
            }
        }
        if(str.indexOf('[')!=0)
            decode=str.substring(0,str.indexOf('[')-1)+decode;
        System.out.println(decode);
    }
}
        