import java.util.*;
public class Due_Date
{
    public static void main(String args[])
    {
        //Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start date");
        StringTokenizer st1=new StringTokenizer(sc.nextLine(),"\\/?|]}[{<>,.:;'*&^%$#@!)(_+-=");
        int d1=Integer.parseInt(st1.nextToken());
        int m1=Integer.parseInt(st1.nextToken());
        int y1=Integer.parseInt(st1.nextToken());
        System.out.println("Enter days till deadline");
        int d=sc.nextInt();
        //processing
        int dim[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        while(d>0)
        {
            //First check for leap year
            if(y1%400==0 || y1%100!=0 && y1%4==0)
                dim[2]=29;
            else
                dim[2]=28;
            //If due date within the month    
            if(d1!=1)
            {
                int t=dim[m1]-d1;
                if(t>d)
                {
                    d1+=d;
                    break;
                }
                else
                {
                    d-=(dim[m1]-d1);
                    d1=1;
                    m1++;
                }
            }
            //If not
            if(d>dim[m1])
            {
                d-=dim[m1];
                m1++;
                //Next Year
                if(m1==13)
                {
                    m1=1;
                    y1++;
                }
            }
            else
            {
                d1+=d;
                d=0;
            }
        }
        if(d1>dim[m1])
        {
            d1-=dim[m1];
            m1++;
        }
        if(m1>12)
        {
            m1-=12;
            y1++;
        }
        String str=Integer.toString(d1)+"/"+Integer.toString(m1)+"/"+Integer.toString(y1);
        System.out.println(str);

    }
}