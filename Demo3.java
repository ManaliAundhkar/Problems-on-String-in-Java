//Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.

//Demo3.java
import java.util.*;

class Line2
{
	public int CalcDiff(String input)
	{
		int Freq1=0,Freq2=0;
		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i)>='A')&&(input.charAt(i)<='Z'))
			{
				Freq1++;
			}
			if((input.charAt(i)>='a')&&(input.charAt(i)<='z'))
			{
				Freq2++;
			}
		}
		return (Freq2-Freq1);
	}
}

class Demo3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line2 lobj=new Line2();
		
		int iRet=0;
		
		iRet=lobj.CalcDiff(str);
		
		System.out.println("Difference is "+iRet);
		
	}
}