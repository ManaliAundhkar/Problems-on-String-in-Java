//Write a java program which accept string from user and check whether it contains vowels in it or not.

//Demo4.java
import java.util.*;

class Line3
{
	public boolean ChkVowel(String input)
	{
		int i=0;
		for(i=0;i<input.length();i++)
		{
			if((input.charAt(i)=='A')||(input.charAt(i)=='E')||(input.charAt(i)=='I')||(input.charAt(i)=='O')||(input.charAt(i)=='U')||(input.charAt(i)=='a')||(input.charAt(i)=='e')||(input.charAt(i)=='i')||(input.charAt(i)=='o')||(input.charAt(i)=='u'))
			{
				break;
			}
			
		}
		if((input.length())== i)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
}

class Demo4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line3 lobj=new Line3();
		
		boolean bRet=false;
		
		bRet=lobj.ChkVowel(str);
		
		if(bRet==true)
		{
			System.out.println("String contains a Vowel");
		}
		else
		{
			System.out.println("String does not contain a Vowel");
		}
	}
}