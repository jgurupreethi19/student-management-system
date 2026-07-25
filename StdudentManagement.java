import java.util.*;
public class StudentManagement{
		ArrayList<Student> students=new ArrayList<>();
		public void addStudent(int id,String name,int std,int age,int marks){
				Student s1=new Student(id,name,std,age,marks);
				students.add(s1);
		}
		public void displayStudent(){
			Iterator<Student> i=students.iterator();
			while(i.hasNext()){
				Student s=i.next();
				System.out.println("ID: "+s.getId());
				System.out.println("Name: "+s.getName());
				System.out.println("Std: "+s.getStd());
				System.out.println("Age: "+s.getAge());
				System.out.println("Marks: "+s.getMarks());

			}

		}
}