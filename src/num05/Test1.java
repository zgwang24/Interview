package num05;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	public static void main(String[] args) {
		/*Set<Student1> set = new TreeSet<Student1>();
		set.add(new Student1("zgwang", 26));
		set.add(new Student1("zjwang", 27));
		set.add(new Student1("zywang", 30));
		for(Student1 stu : set){
			System.out.println(stu);
		}*/
		Account1 account = new Account1();
		ExecutorService service = Executors.newFixedThreadPool(100);
		for(int i = 1; i <= 100; i++){
			service.execute(new AddMoney1(account, 1));
		}
		service.shutdown();
		while(!service.isTerminated()){
			System.out.println("Óà¶î£º " + account.getBalance());
		}
	}
}	
