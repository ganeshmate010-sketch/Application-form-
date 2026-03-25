class  BankAccount
{
	private int balance=100;
	//updateBalance(-30);
	public void updateBalance(int amount)
	{
		int temp=balance;
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+"Read Balance\t"+balance);
		temp=temp+amount;
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Error is"+ex);
		}
		balance=temp;
		System.out.println(t.getName()+"Write new balance\t"+balance);
		
	}
	public int getFinalBalance()
	{
		return balance;
	}
	
}

class Dep extends Thread
{
	private BankAccount bc;
	public void setAccount(BankAccount bc)
	{
		this.bc=bc;
		
	}
	public void run()
	{
		bc.updateBalance(50);
	}
	
}

class Wid extends Thread
{
	private BankAccount bc;
	public void setAccount(BankAccount bc)
	{
		this.bc=bc;
		
	}
	public void run()
	{
		bc.updateBalance(-30);
	}
}


public class BnkAccout
{
	public static void main(String x[])  throws InterruptedException
	{
		BankAccount ba=new BankAccount();
		
		Dep d=new Dep();
		d.setName("Deposit Thread\t");
		d.setAccount(ba);
		d.start();
		
		Wid w=new Wid();
		w.setName("Withdraw Thread");
		w.setAccount(ba);
		w.start();
		Thread.sleep(1000);
		System.out.println("Final balance is\t"+ba.getFinalBalance());
		
	}

}
/* output:
D:\JAVA program\MultiTreading>java BnkAccout.java
Withdraw ThreadRead Balance--->100
Deposit ThreadRead Balance--->100
Withdraw ThreadWrite new balance--->70
Deposit ThreadWrite new balance--->150
Final balance is---->150
 */
