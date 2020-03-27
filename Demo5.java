//Write a java program which accept string from user and display it in reverse order.

//Demo5.java
import java.util.*;
import java.lang.*;


class Line4
{
	public String ReverseX(String strr)
	{
		
		char temp;
		String reverse = "";
        
        
        for(int i = strr.length() - 1; i >= 0; i--)
        {
            reverse = reverse + strr.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
		
		return (reverse);
				
	}
}

class Demo5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line4 lobj=new Line4();
		
		String rev = "";
		
		rev=lobj.ReverseX(str);
		
		
			System.out.println("String is"+rev);
		
	}
}