import java.io.*;
import java.util.Scanner;
class  TeamNameNotFoundException extends Exception{  
 TeamNameNotFoundException (String s){  
  super(s);  
 }  
}
class cricket{
	static void validate(String team,String teams[])throws TeamNameNotFoundException {  
	boolean success=false;
	for(int i=0;i<teams.length;i++)
			 {
			         if(team.equals(teams[i]))
					 {
						success = true; 
						break;
					 }
				        
			 }
     if(!success)
      throw new TeamNameNotFoundException ("Entered team is not a part of IPL Season 4:");    
   }  
           public static void main(String[] args)
		   {
		
		   String[] array = new String[8];    
            array[0] = "Chennai Super Kings"; 
			 array[1] = "Deccan Chargers"; 
			 array[2] = "Delhi Daredevils"; 
			 array[3] = "Kings XI Punjab";
			array[4] = "Kolkata Knight Riders"; 
			 array[5] = "Mumbai Indians"; 
			 array[6]= "Rajasthan Royals"; 
			 array[7] = "Royal Challengers Bangalore"; 
			 String runner,winner;
			  Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the expected winner team of IPL Season 4");
			  winner=sc.nextLine();
			  try{
				  validate(winner,array);
			 System.out.println("Enter the expected runner Team of IPL Season 4");
			 runner=sc.nextLine();
			 try{
				 validate(runner,array);
				 System.out.println("Expected IPL Season 4 winner: " +winner );
			 System.out.println("Expected IPL Season 4 runner: "+runner );
			   }
			   catch(Exception e){
				   System.out.println(e);
			   }
			  }
			 catch (Exception m){
	             System.out.println(m);
	             } 
		   }
		   
}