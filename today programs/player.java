import java.util.*;
class player 
{
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
String name;
String country;
String skill;
System.out.println("enter the Player name");
System.out.println("enter the country name");
System.out.println("enter the skill");
name=r.next();
country =r.next();
skill=r.next();
System.out.println("PLAYER DETAILS");
System.out.println("  player name:"+name);
System.out.println("country name :"+country);
System.out.println("player skill:"+skill);
}
}