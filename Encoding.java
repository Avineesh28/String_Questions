import java.util.*;
class Encoding
{
	String inputtext;
	String SA[];
	int IA[];
	int max;
	Encoding(String str)
	{
		inputtext=str;
		SA=str.split(" ");
		max=0;
	}
	String sort(Encoding obj[])
	{
		int n=obj.length;
		String str="",t="";
		for(int i=0;i<n;i++)
		{
			str=str+obj[i].inputtext+" ";
			if(max<obj[i].SA.length)
				max=obj[i].SA.length;
		}
		str=str.trim();
		String s[]=str.split(" ");
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-i-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		str="";
		for(int i=0;i<s.length;i++)
		{
			if(t.equalsIgnoreCase(s[i]))
				continue;
			else
			{
				str=str+s[i]+" ";
				t=s[i];
			}
		}	
		return str.trim();
	}
	void encodeText(Encoding obj[], String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<obj.length;i++)
		{
			obj[i].IA=new int[max];
			for(int j=0;j<obj[i].SA.length;j++)
			{
				for(int k=0;k<s.length;k++)				
					if(s[k].equalsIgnoreCase(obj[i].SA[j]))
						obj[i].IA[j]=k;
			}
		}	
	}
	void encodeText(Encoding obj[])
	{
		for(int i=0;i<obj.length;i++)
			for(int j=obj[i].SA.length;j<max;j++)
				obj[i].IA[j]=-1;
	}
	void display(Encoding obj[])
	{
		for(int i=0;i<obj.length;i++)
			System.out.println(Arrays.toString(obj[i].IA));		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of sentences");
		int n=sc.nextInt();
		String t=sc.nextLine();
		Encoding obj[]=new Encoding[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter String no."+(i+1));
			obj[i]=new Encoding(sc.nextLine());
		}
		Encoding Master=new Encoding("");
		t=Master.sort(obj);
		System.out.println("\nSorted String\n\n"+t);
		Master.encodeText(obj,t);
		System.out.println("\nAfter calling first encodeText() Function");
		Master.display(obj);			
		Master.encodeText(obj);
		System.out.println("\nAfter calling first encodeText() Function");
		Master.display(obj);
	}	
}