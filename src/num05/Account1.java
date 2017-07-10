package num05;

public class Account1 {
	
	private double balance;
	
	public synchronized void deposit(double money){
		double newBalance = balance + money;
		try{
			Thread.sleep(10);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		balance = newBalance;
	}
	
	public double getBalance(){
		return balance;
	}
}
