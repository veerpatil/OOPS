package com.realworld;

class Account
{
	int acc_no;
	String name;
	float amount;
	
	void CreateAccount(int a, String n, float amt)
	{
		this.acc_no=a;
		this.name=n;
		this.amount=amt;
	}
	void Deposit(float amt)
	{
		amount= amount+ amt;
		System.out.println("The amount deposited is:" + amt);
	}
	void Withdraw(float amt)
	{
		if(amount< amt)
		{
			System.out.println("Insufficient balance");
		}
		else 
		{
		amount= amount -amt;
		System.out.println("The amount withdrawl is: "+ amt);
		}
	}
	void CheckBalance()
	{
		System.out.println("Acc balance is: "+ amount);
	}
	
	void Display()
	{
		System.out.println("Acc Number:"+ acc_no + "Name:" + name + "Amount:" + amount);
	}
}
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		a1.CreateAccount(1001, "veer", 5000);
		a1.Display();
		a1.Deposit(4000);
		a1.Display();
		a1.Withdraw(2000);
		a1.Display();
		a1.Withdraw(8000);

	}

}
