//To form two arrays of Keys and Values from a Python syntax for declaring a dictionary
import java.util.*;
class Python
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Command");
		String str=sc.nextLine();
		int a1=0,a2=0,p1=0,p2=0;
		int n=0;
		int t=0;
		t=str.indexOf(':');
		while(t!=-1)
		{
			n++;
			t=str.indexOf(':',t+1);
		}			

		String key[]=new String[n];
		int sumVal[]=new int[n];

		a1=str.indexOf('\'');
		a2=str.indexOf('\'',a1+1);
		p1=str.indexOf('(');
		p2=str.indexOf(')');
		t=0;
		while(a1!=-1 && a2!=-1 && p1!=-1 && p2!=-1)
		{
			int sum=0;
			key[t]=str.substring(a1+1,a2);
			String w[]=str.substring(p1+1,p2).split(",");
			for(int i=0;i<w.length;i++)
				sum+=Integer.parseInt(w[i]);	
			sumVal[t++]=sum;
			a1=str.indexOf('\'',a2+1);
			a2=str.indexOf('\'',a1+1);
			p1=str.indexOf('(',p1+1);
			p2=str.indexOf(')',p2+1);		
		}
		
		System.out.print("\nArray 1 = [");
		int i;
		for(i=0;i<n-1;i++)
			System.out.print("\""+key[i]+"\", ");
		System.out.println("\""+key[i]+"\"]");

		System.out.print("\nArray 2 = [");
		for(i=0;i<n-1;i++)
			System.out.print(sumVal[i]+", ");
		System.out.println(sumVal[i]+"]");
	}
}
