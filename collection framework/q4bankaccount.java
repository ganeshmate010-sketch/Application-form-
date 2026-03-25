/* Q4. Create BankAccount POJO with accountNo, holderName, balance.
Store accounts in a Vector.
Perform:
Deposit amount to an account
Withdraw amount if balance is sufficient
Display accounts with balance < 5000
Sample Output :- 
Deposit Successful
Withdrawal Successful
Low Balance Accounts: Ramesh
Explanation
Search account using account number
Update balance for deposit/withdraw
Check balance condition while withdrawing
Filter low-balance accounts */ 

import java.util.*;
class BankAccount
{
	private int accountNo;
	private String holderName;
	private double balance;
	
	public BankAccount(int accountNo,String holderName,double balance)
	{
		this.accountNo=accountNo;
		this.holderName=holderName;
		this.balance=balance;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public String getHolderName()
	{
		return holderName;
	}
	public double getBalance()
	{
		return balance;
	}
	
	
	
}
public class q4bankaccount
{
	public static void main(String x[])
	{
		Vector<BankAccount> v=new Vector();
		v.add(new BankAccount(1,"Ganesh",1000));
		v.add(new BankAccount(2,"Harshd",2000));
		v.add(new BankAccount(3,"Vinod",4000));
		
		
		//all display 
	  for(BankAccount b:v)
	  {
		  System.out.println(b.getAccountNo()+"\t"+b.getBalance()+"\t"+b.getHolderName());
	  }
	  System.out.println("Enter Account number and deposit amount");
	  for(BankAccount b:v)
		  {
			if(b.getAccountNo()==b.getAccountNo())
			{
				
			}
		  }
	}
}

	
				System.out.println("Enter Accont Number and deposit amount");
				int ano=sc.nextInt();
				int damt=sc.nextInt();
				for(BankAccount obj:v)
				{	if(ano==obj.getAcno())
					obj.setBalance(obj.getBal()+damt);
				}
				break;
				case 4:
				System.out.println("Enter Accont number and amount");
				ano=sc.nextInt();
				int wamt=sc.nextInt();
				for(BankAccount obj:v)
				{	if(ano==obj.getAcno())
					obj.setBalance(obj.getBal()-wamt);
				}
				break;
				case 5:
				System.out.println("Balance < 5000");
				System.out.println("--------------------");
				System.out.println("AcNO\tName\tBalance");
				for(BankAccount obj:v)
				{	if(obj.getBal()<5000)
					{	System.out.println(obj.getAcno()+"\t"+obj.getName()+"\t"+obj.getBal());	
					}
				}
				System.out.println("--------------------");
				break;
			}
		}while(true);
	}
	
}