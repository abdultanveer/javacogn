package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddArraylistToLL {
	static List<Student> sList;
	
	
	public static void main(String[] args) {
		createData();
		
		List<Student> studentsLL = new LinkedList<Student>();
		studentsLL = new ArrayList<Student>();
		studentsLL.add(new Student(10,"aaq",101));
		studentsLL.add(new Student(20,"bbq",202));
		studentsLL.add(new Student(30,"ccq",303));
		studentsLL.add(new Student(40,"ddq",404));
		
		studentsLL.addAll(sList);
		for(Student s : studentsLL) {
			System.out.println(s.toString());
		}
		
	}
	
	
	private static void createData() {
		sList = new ArrayList<Student>();
		sList.add(new Student(1,"aa",11));
		sList.add(new Student(2,"bb",22));
		sList.add(new Student(3,"cc",33));
		sList.add(new Student(4,"dd",44));

		
	}

}
