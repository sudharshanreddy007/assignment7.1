package package1;

import java.io.IOException;
import java.util.*;

public class Student {

	 private String name ="Sudharshan Reddy";
	 private int rollno = 7;
	 public void accept ()throws IOException{
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter name: "+name );
		 
		 name=sc.toString();
		 System.out.println("rollno: "+rollno );
		 rollno=sc.nextInt();
	 }
	 }
	 
	/* class Demo{
		 
		 public static void main(String []args) throws IOException{
			 
			 Student s =new Student();
			 s.accept();
			 
		 }*/
		 
