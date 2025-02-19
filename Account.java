package GuviTaskJava3;

public class Account {
	
	
	public Account() {
		System.out.println("Welcome to your Acoount");
		
	}
	
	public Account(int a) {
		System.out.println("Total amount in your account is "+a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Account();
		
		int TotalAmount = 10000;
		
		new Account(TotalAmount);
		
		System.out.println();
		
//		String ActionType1="Credit";
		
		System.out.println( "Balance after Deposit is " + BalanceAmount(TotalAmount, 2000, "Credit" ));
		
		String ActionType2="Debit";
		
		System.out.println( "Balance after Withdraw is " + BalanceAmount(TotalAmount, 500, ActionType2 ));
		
		
	}
	
	
	public static void DepositMoney(int DepositAmount) {
		System.out.println("Amount " +DepositAmount+" Credited");
	}
	
	
	
	public static void WithdrawMoney(int WithdrawAmount) {
		System.out.println("Amount "+WithdrawAmount+" debited");
	}
	
	
	
	public static int BalanceAmount(int Total,int newAmount ,String typeOfAction) {
		int Balance;
		if(typeOfAction == "Credit") {
			Balance = Total+newAmount;
		}
		else {
			Balance = Total-newAmount;
		}
		return Balance;
	}

	
}
