//Write a java program which accept string from user and count number of small characters.

//Demo1.java
import java.util.*;

class Line
{
	public int CountSmall(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i)>='a')&&(input.charAt(i)<='z'))
			{
				count++;
			}
		}
		return count;
	}
}

class Demo1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line lobj=new Line();
		
		int iRet=0;
		
		iRet=lobj.CountSmall(str);
		
		System.out.println("Small Character Count is "+iRet);
		
	}
}