package num05;

public class Student2 {
	private String name;
	private int age;
	
	public Student2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	@Override
	public String toString(){
		return "Student [name = " + name + ", age = " + age + "]";
	}
}

