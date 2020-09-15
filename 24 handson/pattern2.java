import java.io.*;
import java.util.*;
public class Pattern_horiz {
	public static void main(String... args)
	{
int i,n,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.print("* ");
	}
	for(int s = 1; s< n - i; ++s)
    {
        System.out.print("  ");
    }
    for(j = 0; j <= i; j++)
    {
        System.out.printf(" * ");
    }
	System.out.println();
}
}
}