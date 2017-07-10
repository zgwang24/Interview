package num05;

public class AddMoney1 implements Runnable{
	private Account1 account;
	private double money;
	
	public AddMoney1(Account1 account, double money){
		this.account = account;
		this.money = money;
	}
	
	@Override
	public void run() {
		synchronized(account){
			account.deposit(money);
		}	
	}

}
