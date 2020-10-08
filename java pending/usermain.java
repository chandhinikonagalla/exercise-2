import java.util.Scanner;
class UserMainCode{
public static Boolean validateDate(String ted){
	Boolean edu= ted.contains("-");
if(edu==true)
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
return true;
}
}
public class MainCode{
public static void main(String args[]){
String arr;
Scanner s= new Scanner(System.in);
UserMainCode u= new UserMainCode();
arr= s.nextLine();
u.validateDate(arr);
}
}