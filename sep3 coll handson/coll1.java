import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Mainnn{
public static void main(String args[]){
int n;
Scanner s= new Scanner(System.in);
n = s.nextInt();
ArrayList<Integer> v= new ArrayList<>();
for(int i=0;i<n;i++)
{
int run= s.nextInt();
v.add(run);
System.out.println(v);
}
Collections.sort(v);
for(int j=0;j<n;j++)
{
System.out.println(v.get(j));
}
}
}