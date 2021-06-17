/*
 /*Question 3
The names of the teams participating in a competition should be displayed on a
banner vertically, to accommodate as many teams as possible in a single banner.
Design a program to accept the names of N teams, where 2 < N < 9 and display
them in vertical order, side by side with a horizontal tab (i.e. eight spaces).
Test your program for the following data and some random data:
Example 1:
INPUT: N = 3
Team 1: Emus
Team 2: Road Rols
Team 3: Coyote
OUTPUT:

E    R   C
m    o   o
u    a   y
s    d   o
         t
     R   e
     o
     l
     s
Example 2:
INPUT: N = 4
Team 1: Royal
Team 2: Mars
Team 3: De Rose
Team 4: Kings
OUTPUT:

R   M   D   K
o   a   e   i
y   r       n
a   s   R   g
l       o   s
        s
        e

Example 3:
INPUT: N = 10
OUTPUT: INVALID INPUT
----------------------------------------------------------------------------------------------------------------------- */
 package Practical;
import java.util.*;
public class Banner
{
    String s[];
    int n;
    Banner(int n)
    {
        s=new String[n];
        this.n=n;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            System.out.print("Team"+(i+1)+":");
            s[i]=sc.nextLine();
        }
    }
    void send()
    {
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++)
           a[i]=s[i].length();
        Arrays.sort(a);
        for(int j=0;j<a[a.length-1];j++)
        {
            System.out.println();
            print(0,j);
        }
    }
    void print(int i,int j)
    {
        if(i==n)
            return;
        else
        {
            if(j<s[i].length())
                System.out.print(s[i].charAt(j)+"\t");
            else
                System.out.print(" \t");
            print(i+1,j);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of teams");
        Banner obj=new Banner(sc.nextInt());
        obj.input();
        obj.send();
    }
}
