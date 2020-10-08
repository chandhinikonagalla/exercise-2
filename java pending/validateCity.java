import java.util.Scanner;
class Usermaincode{
public static Boolean validateCity(String ted){
int n= ted.length();
char c= ted.charAt(0);
char d= ted.charAt(1);
char e= ted.charAt(n-2);
char f= ted.charAt(n-1);
if((c!='')&&(d!='')&&(e!='')&&(f!='')){
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
return true;
}
}
public class Maincodee{
public static void main(String args[]){
String arr;
Scanner s= new Scanner(System.in);
Usermaincode u= new Usermaincode();
arr= s.nextLine();
u.validateCity(arr);
}
}