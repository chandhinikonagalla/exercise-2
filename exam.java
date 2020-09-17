/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int overs,checkover;
System.out.println("Enter no of overs");
Scanner sct = new Scanner(System.in);   //User inputs two numbers
overs = sct.nextInt();
try{
	int[] vars = new int[overs];
 System.out.println("Enter the number of runs for each over: ");
for(int i = 0; i < vars.length; i++) {
  vars[i] = sct.nextInt();
}
System.out.println("Enter the over number: ");
checkover=sct.nextInt();
try{
	System.out.println("Runs scored in this over: "+vars[checkover-1]);
}
catch(Exception e){
	System.out.println("Entered over is not available");
	
}
}
catch(Exception e ){
	System.out.println("overs cannot be negative");
	
}
	}
}
