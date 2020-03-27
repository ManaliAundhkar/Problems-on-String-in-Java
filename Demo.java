//Write a Java program which accept string from user and count number of capital characters.

//Demo.java
import java.util.*;

class Line
{
	public int CountCapital(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i)>='A')&&(input.charAt(i)<='Z'))
			{
				count++;
			}
		}
		return count;
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line lobj=new Line();
		
		int iRet=0;
		
		iRet=lobj.CountCapital(str);
		
		System.out.println("Capital Count is "+iRet);
		
	}
}