package basics;
class Student{  
	int rollno;  
	String name,course;  
	private String dob;
	float fee;  
	Student(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	Student(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//C.T.Error  
		this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);} 
	
	public int getAge() {
		return 123;
	}
	
	public void setDob(String sDob) {
		this.dob = sDob;
	}
}  


class TestThis8{  
	public static void main(String args[]){  
		Student s1=new Student(111,"ankit","java");  
		Student s2=new Student(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
	}}  