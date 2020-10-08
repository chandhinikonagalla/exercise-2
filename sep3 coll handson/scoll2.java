import java.util.Scanner;
import java.util.ArrayList;
class Mainn{
public static void main(String args[]){
 int n;
 Scanner s= new Scanner(System.in);
 n= s.nextInt();
 ArrayList<Integer> v= new ArrayList<>();
 for(int i=0;i<n;i++)
 {
 int score= s.nextInt();
 v.add(score);
 System.out.println(v);
 }
 int total=0;
 for(int j=0;j<n;j++)
 {
 total = total+v.get(j);
 }
 System.out.println(total);
 double d= total/n;
 System.out.println(d);
 }
}