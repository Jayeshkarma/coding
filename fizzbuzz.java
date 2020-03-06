/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for(int i=1;i<100; i++)
		{
		    
		     if((i%3==0) && (i%5==0))
		    {
		      System.out.println("fizzbuzz");
		    }
		    else if(i%5==0)
		    {
		      System.out.println("buzz");
		    }
		    else if(i%3==0)
		    {
		      System.out.println("fizz");
		    }
		    else{
		        System.out.println(i);
		        
		    }
		    
		}
	}
}
