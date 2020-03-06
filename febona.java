/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int i;
	  int array[]=new int[11];
	  array[0]=-1;
	  array[1]=1;
	  for(i=2;i<array.length;i++)
	  {
	      array[i]=array[i-2]+array[i-1];
	        System.out.println(array[i]);
	  }
	  
	
	}
}
