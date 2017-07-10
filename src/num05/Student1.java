package num05;

public class Student1 implements Comparable<Student1>{
	private String name;
	private int age;
	
	public Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return "Student [name = " + name + ", age = " + age + "]";
	}
	@Override
	public int compareTo(Student1 o){
		return o.age - this.age;
	}
}
