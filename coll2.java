 import java.util.*;
public class ArrayListLoopExample {
    public static void main(String args[]) {
        // initialize ArrayList  
        
		int n,temp,sum=0,t2=0;
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(0);
		for(int i=1;i<=n;i++){
			temp=sc.nextInt();
			al.add(temp);
			
		}
      
		
		for(int i=1;i<al.size();i++){
			t2=al.get(i);
			
			if(i%2==0){
				if(t2%2!=0)
					sum+=al.get(i);
			}
			
			if(i%2!=0){
				if(t2%2==0)
					sum+=al.get(i);
			}
		}
        System.out.println(sum);   
        
}}