package basics;

public class Student1 {
	
	String name; //partition -- instance variable
	int age;
	int phno;
	
	
	Student1(String name, int age, int phno){
		this();
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	
	void display(){
		System.out.println("student details are---"+ name);
		printStudent(this);
	}
	
	void printStudent(Student1 mStudent) {
		System.out.println("\n name-age-phno"+mStudent.name +"-"+mStudent.age);
	}
	
	Student1(){System.out.println("default constructor");}


}
