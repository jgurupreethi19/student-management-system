import java.util.*;
public class StudentManagement{
		ArrayList<Student> students=new ArrayList<>();
		public void addStudent(int id,String name,int std,int age,int marks){
				Student s1=new Student(id,name,std,age,marks);
				students.add(s1);
				System.out.println("Student added Successfully!");
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
		public void searchStudent(int id){
			Iterator<Student> i=students.iterator();
			boolean find=false;
			while(i.hasNext()){
				Student s=i.next();
				
				if(s.getId()==id){
					find=true;
					System.out.println("Student Found");
					System.out.println("Student Details "+id);
					System.out.println("Name: "+s.getName());
					System.out.println("Std: "+s.getStd());
					System.out.println("Age: "+s.getAge());
					System.out.println("Marks: "+s.getMarks());
					break;

				}
			}
				if(find==false)
				{
					System.out.println("Student not found");
				}
			
		}
           public void updateStudent(int id,String name,int std,int age,int marks){
           				Iterator<Student> i=students.iterator();
           				boolean find=false;
			            while(i.hasNext()){
				            Student s=i.next();
				            if(s.getId()==id){
				            	find=true;
				            	System.out.println("Student Details before update");
				            	System.out.println("Id: "+s.getId());
				            	System.out.println("Name: "+s.getName());
				            	System.out.println("Std: "+s.getStd());
				            	System.out.println("Age: "+s.getAge());
				            	System.out.println("Markks: "+s.getMarks());
				            	s.setName(name);
				            	s.setStd(std);
				            	s.setAge(age);
				            	s.setMarks(marks);
				            	System.out.println("Student Details Updated!");
				            	System.out.println("Id: "+s.getId());
				            	System.out.println("Name: "+s.getName());
				            	System.out.println("Std: "+s.getStd());
				            	System.out.println("Age: "+s.getAge());
				            	System.out.println("Marks: "+s.getMarks());
				            	break;
				            }
				           }
				            if(find==false){
				            	System.out.println("Student not found");
				            }

                        
       }
				
			
			public void deleteStudent(int id){
				Iterator<Student> i=students.iterator();
			    while(i.hasNext()){
				     Student s=i.next();
				      if(s.getId()==id){
				      	i.remove();
				      	System.out.println("Student deleted Successfully!");
				      }

			}
		}










}

