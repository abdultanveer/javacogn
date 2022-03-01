package collections;
class Student{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno +name+age;
	}
}  