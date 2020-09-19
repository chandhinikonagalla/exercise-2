import java.util.Scanner;
class CustomException  extends Exception{  
 CustomException (String s){  
  super(s);  
 }  
}  
 class AgeExcDemo {
	  static void validate(int age)throws CustomException {  
     if(age<19 || age>40)  
      throw new CustomException ("InvalidAgeRangeException");    
   }  
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter players name : ");
  String name = s.nextLine();
  System.out.println("Enter players age : ");
  int age = s.nextInt();
  try{ 
       validate(age);
	   System.out.println(" players name : "+name);
    System.out.println(" players age : "+age);	  
  }
  
 catch (Exception m){
	 System.out.println(m);
	 } 
 }
 }
