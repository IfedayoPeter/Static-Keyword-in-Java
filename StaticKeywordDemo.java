package statickey;

public class StaticKeywordDemo {

	public static void main(String[] args) {

		Student student = new Student("John", 13, "london, UK");
		System.out.println("student name is " + student.getName());
		System.out.println("student age is " + student.getAge());
		System.out.println("student address is " + student.getAddress());
		System.out.println(Student.college);
		System.out.println(Student.count);

		Student student2 = new Student("Thomas", 12, "london, UK");
		System.out.println("student name is " + student2.getName());
		System.out.println("student age is " + student2.getAge());
		System.out.println("student address is " + student2.getAddress());
		System.out.println(Student.college);
		System.out.println(Student.count);
	}

}
