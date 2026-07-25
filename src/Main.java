import java.util.*;
class Main{
	public static void main(String[] args) {
		StudentManagement sm=new StudentManagement();
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
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter Std: ");
			int std=sc.nextInt();
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			System.out.println("Enter Marks: ");
			int marks=sc.nextInt();
			sm.addStudent(id,name,std,age,marks);
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
			break;
		}
		case 5:{
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			sm.deleteStudent(id);
			break;
		}
		case 6:{
			System.out.println("Thank You!");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("Invalid choice");
		}
	}
}

		/*sm.addStudent(1,"hima",5,9,500);
		sm.addStudent(2,"riya",6,12,450);
		sm.displayStudent();
		sm.searchStudent(1);
		sm.updateStudent(3,"hima J",5,9,550);
		sm.deleteStudent(2);
		sm.displayStudent();*/
	}
}
