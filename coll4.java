import java.util.*;  
class Player
{

    private String name,tname,skill;
    

    public Player( String name, String tname, String skill )
    {
        super();
        this.name = name;
        this.tname = tname;
        this.skill = skill;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String gettname()
    {
        return tname;
    }

    public void settname( String tname )
    {
        this.tname = tname;
    }

    public String getskill()
    {
        return skill;
    }

    public void setskill( String skill )
    {
        this.skill = skill;
    }

    @Override
    public String toString()
    {
        return  name + "--" + tname + "--" + skill;
    }

}
public class TreeMap1{  

 public static void main(String args[]){  
   TreeMap<String,Player> map=new TreeMap<String,Player>();  
 
	int n;
	String num,name,tname,skill;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();sc.nextLine();
	Player[] player = new Player[n];
	for(int i=0;i<n;i++){
		num=sc.nextLine();
		name=sc.nextLine();
		tname=sc.nextLine();
		skill=sc.nextLine();
		player[i]=new Player(name,tname,skill);
		map.put(num,player[i]);
	}
    Set<Map.Entry<String, Player>> set = map.entrySet();

      //map.put(102,"Ravi");    
      //map.put(101,"Vijay");    
      //map.put(103,"Rahul");    
        
       for( Map.Entry<String, Player> entry : set )
        {
            String cap = entry.getKey();
            Player p = entry.getValue();
            System.out.println(cap + "--" + p);
        }

}}