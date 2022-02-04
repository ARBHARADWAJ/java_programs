import java.util.*;
class ss{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> li=new ArrayList<String>();
		li.add("bharadwaj");
		li.add("ARBHARADWAJ");
		li.add("Sravya");
		System.out.println(li);
	    System.out.println("Enter the numbers you wanted to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		   li.add(sc.next());
		}
		System.out.print(li);
		
	
	}
	
}
		