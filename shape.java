abstract class areashape{
	double a,b;
	abstract void  printarea();		
}
class circle extends areashape{
void printarea(){
	System.out.println(a+b);
}
}
class triangle extends areashape{

void printarea(){
  System.out.println(a*b);
}

}

public class shape{
	public static void main(String args[]){
    circle c1=new circle();
    triangle t1=new triangle();
	c1.a=2;
	c1.b=33;
	t1.a=23;
	t1.b=33;
	c1.printarea();
	t1.printarea();
 
	}
}	