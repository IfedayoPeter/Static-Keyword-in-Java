package statickey;

public class Student {

	static {
		System.out.println("STUDENT PROFILE");
//		the is a static code block
	}

	String name;
	int age;
	String address;
	static String college = "Oxford High school";
	static int count = 1;

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count++;
	}

}
