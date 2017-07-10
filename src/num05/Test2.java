package num05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<Student2>();
		list.add(new Student2("zgwang", 26));
		list.add(new Student2("ztwang", 24));
		list.add(new Student2("zkwang", 25));
		
		Collections.sort(list, new Comparator<Student2>(){
			@Override
			public int compare(Student2 o1, Student2 o2){
				return o1.getAge().compareTo(o2.getAge());
			}
		});
		
		for(Student2 stu : list){
			System.out.println(stu);
		}
	}
}
