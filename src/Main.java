import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws IOException{
		StudentManagement sm=new StudentManagement();
		sm.loadStudents();
		Scanner sc=new Scanner(System.in);
		int n;
		while(true){
		  System.out.println("------------Student Management System------------");
		  System.out.println("1.Add Student");
		  System.out.println("2.Display Student");
		  System.out.println("3.Search Student");
		  System.out.println("4.Update Student");
		  System.out.println("5.Delete Student");
		  System.out.println("6.Exit");

		  System.out.println("Enter your choice: ");
		  n=sc.nextInt();
		switch(n){
		case 1:{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			if(id<=0){
				System.out.println("ID should not be lessthan or equal to zero");
				return;
			}
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Std: ");
			int std=sc.nextInt();
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			if(age<3||age>16){
				System.out.println("Age should not be lessthan 3 or greaterthan 16");
				return;
			}
			System.out.println("Enter Marks: ");
			int marks=sc.nextInt();
			sm.addStudent(id,name,std,age,marks);
			sm.saveStudents();
			break;
		}
		case 2:{
			sm.displayStudent();
			break;
		}
		case 3:{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			sm.searchStudent(id);
			break;
		}
		case 4:{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Std: ");
			int std=sc.nextInt();
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			System.out.println("Enter Marks: ");
			int marks=sc.nextInt();
			sm.updateStudent(id,name,std,age,marks);
			sm.saveStudents();
			break;
		}
		case 5:{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			sm.deleteStudent(id);
			sm.saveStudents();
			break;
		}
		case 6:{
			System.out.println("Thank You for using Student Management System!");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("Invalid choice");
		}
	}
}

	}
}
