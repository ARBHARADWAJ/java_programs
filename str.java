import java.util.*;
class str{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<Integer>();
		while(sc.hasNextLong()){
			long a,b,c,sum=0,n=sc.nextLong();
		 if(n==2){sum=n;}
		 else{
			a=n/2;
			b=n/3;
			c=n/4;
		    sum=a+b+c; 
			}                        
            System.out.println(sum);			
		}
	}
}
		