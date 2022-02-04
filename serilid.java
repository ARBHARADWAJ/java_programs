import java.io.*;
class Student implements java.io.Serializable{
	public int id;
	public String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class serilid{
	public static void main(String args[])
	{
		Student s1=new Student(509,"cherry");
		String ss="busy.txt";
		try{
		FileOutputStream fout = new FileOutputStream(ss);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.close();
		fout.close();
		System.out.print("Student object successfully");
	}
	catch(IOException e){
	  System.out.print("exception");
	}
	
	}
}
