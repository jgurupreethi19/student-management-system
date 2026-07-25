class Student{
	int id;
	String name;
	int std;
	int age;
	int marks;
	
	public Student(int id,String name,int std,int age,int marks){
		this.id=id;
		this.name=name;
		this.std=std;
		this.age=age;
		this.marks=marks;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getStd(){
		return this.std;
	}
	public void setStd(int std){
		this.std=std;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getMarks(){
		return this.marks;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}


}
