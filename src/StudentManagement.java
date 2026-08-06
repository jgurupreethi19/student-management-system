import java.util.*;
import java.io.*;
public class StudentManagement{
		ArrayList<Student> students=new ArrayList<>();
		
		public void saveStudents(){
			try{
			  FileWriter f=new FileWriter("students.txt");
			  Iterator<Student> i=students.iterator();
			  while(i.hasNext()){
				Student s=i.next();
				int id=s.getId();
				String name=s.getName();
				int std=s.getStd();
				int age=s.getAge();
				int marks=s.getMarks();
				String sentence=id+","+name+","+std+","+age+","+marks;
				f.write(sentence);
				f.write("\n");
			}
			f.close();
			catch(IOException e){
				System.out.println("Error Occured");
			}
		}
	}
		public void loadStudents() throws IOException{
			try{
			File f=new File("students.txt");
			if(!f.exists()){
				return;
			}
			Scanner s=new Scanner(f);
			while(s.hasNextLine()){
				String line=s.nextLine();
				String[] arr=line.split(",");
				int id=Integer.parseInt(arr[0]);
				String name=arr[1];
				int std=Integer.parseInt(arr[2]);
				int age=Integer.parseInt(arr[3]);
				int marks=Integer.parseInt(arr[4]);
				Student s1=new Student(id,name,std,age,marks);
			    students.add(s1);
			}		
			s.close();
		}
		catch(IOException e){
			System.out.println("Error Occured while loading data");
		}
	}
		public void addStudent(int id,String name,int std,int age,int marks){
				Student s1=new Student(id,name,std,age,marks);
				students.add(s1);
				System.out.println("Student added Successfully!");
		}
		public void displayStudent(){
			Iterator<Student> i=students.iterator();
			while(i.hasNext()){
				Student s=i.next();
				System.out.println("----ALL STUDENT DETAILS----");
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
				            	System.out.println("Marks: "+s.getMarks());
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

