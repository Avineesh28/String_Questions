/*Question 3:
*	Write a C program to build password with following restrictions
*		a. Password should not contain more than one no(0-9) continuously
*			i. ABC11- not valid ABC1j0 valid
*		b. Password should contain atleast one special character
*		c. Password should contain characters between 6 to 8
*		d. Password should contain atleast one capital letter
*/
#include <stdio.h>
#include <ctype.h>
#include <string.h>
int main()
{
	char pass[50];
	printf("Enter the Password\n");
	scanf("%s",&pass);
	int a=1,b=0,c=1,d=0; //default true states
	if(strlen(pass)>=6 && strlen(pass)<=8)
	{
		int n=strlen(pass);
		int i;
		for(i=0;i<n-1;i++)
		{
			if(isdigit(pass[i])!=0 && isdigit(pass[i+1])!=0)
				a=0;
			if(pass[i]<='Z' && pass[i]>='A')
				d=1;
			if(isalnum(pass[i])==0)
				b=1;
		}
		if(pass[n-1]<='Z' && pass[n-1]>='A')
			d=1;
		if(isalnum(pass[n-1])==0)
			b=1;
	}
	else	
		c=0;
	if(a==1 && b==1 && c==1 && d==1)
		printf("Password is Valid");
	else
		printf("Password is Invalid");
	return 1;
}
