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
	    System.out.println("enter any  number vor printing diamond");
	    Scanner sc = new Scanner(System.in);
	    int lines = sc.nextInt();
	    int mid= (lines+1)/2;
	    for(int i=1; i<=mid; i++)
	    {
	        for(int s=1; s<(mid-i); s++)
	        {
	          System.out.print(" ");
	        }
	        
	         for(int j=0; j<(2*i)-1; j++)
	        {
	          System.out.print("*");
	        }
	        
	         System.out.println();
	    }
	    
	     for(int i=1; i<=mid-1; i++)
	    {
	          for(int s=1 ; s<i; s++)
	        {
	          System.out.print(" ");
	        }
	        
	         for(int j=0; j<(2*(mid-i)-1); j++)
	        {
	          System.out.print("*");
	        }
	        
	        System.out.println(); 
	    }
	        
	        
	 
	    
	}
}
