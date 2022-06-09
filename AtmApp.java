import java.util.HashMap;
import java.util.Scanner;


public class AtmApp {
		
 public static void main(String args[]) {
	

		HashMap<Integer, Integer> balan = new HashMap<Integer, Integer>();
		balan.put(2000,0);
		balan.put(500, 0);
		balan.put(200, 0);
		balan.put(100, 0);
	    
		System.out.println("Welcome to ATM");
		System.out.println("1 for Deposit Money to your account");
		System.out.println("2 for Withdraw Money from your account");
		System.out.println("3 for Check Current Balance");
		System.out.println("4 for Exit");     
	
	 Scanner sc = new Scanner(System.in); 
	int choose;
	System.out.println("Enter your choice operation you want to perform: ");
	choose=sc.nextInt();
	
	while(choose!=0) {
		
		if(choose==1)deposit(balan,sc);
		else if(choose==2)withdraw(balan,sc);
		else if(choose==3)currentbalance(balan);
		System.out.println("Welcome to ATM");
		System.out.println("1. Deposit Money to your account");
		System.out.println("2. Withdraw Money from your account");
		System.out.println("3. Check Current Balance");
		System.out.println("4. Exit");
		System.out.println("Enter your Choice: ");
		choose=sc.nextInt();
		
	}
 	}

private static void withdraw(HashMap<Integer, Integer> balance, Scanner sc) {
	int withdra2000=0,withdra500=0,withdra200=0,withdra100=0;
	int currbal=currentbalance(balance);
	int amount;
	System.out.println("How much amount you want to withdraw?");
	amount = sc.nextInt();
	if(amount>currbal || amount<=0) {
		System.out.println("Incorrect or insufficient Balance");
	} 
	else {
		while(balance.get(2000)!=0 && 2000<=amount) {
            withdra2000++;
            balance.replace(2000, balance.get(2000)-1);
            amount-=2000;
        }
        
		while(balance.get(500)!=0 && 500<=amount) {
            withdra500++;
            balance.replace(500, balance.get(500)-1);
            amount-=500;
        }
		while(balance.get(200)!=0 && 200<=amount) {
            withdra200++;
            balance.replace(200, balance.get(200)-1);
            amount-=200;
        }
		while(balance.get(100)!=0 && 100<=amount) {
            withdra100++;
            balance.replace(100, balance.get(100)-1);
            amount-=100;
        }        
      System.out.println("Dispensed: 2000s="+withdra2000+",500s="+withdra500+",200s="+withdra200+",100s="+withdra100);
        
        System.out.println("Balance: 2000s="+balance.get(2000)+",500s="+balance.get(500)+",200s="+balance.get(200)+",100s="+balance.get(100)+", Total="+currentbalance(balance));
 
		
		}
}

private static int currentbalance(HashMap<Integer,Integer> balance) {
	
	
	return (2000*balance.get(2000)+500*balance.get(500)+200*balance.get(200)+100*balance.get(100));
}

public static void deposit(HashMap<Integer,Integer> balance,Scanner sc) {
	int depos2000,depos500,depos200,depos100;
	
	System.out.println("Enter number of 2000 Notes:");
	depos2000=sc.nextInt();
	System.out.println("Enter number of 500 Notes:");
	depos500=sc.nextInt();
	
	System.out.println("Enter number of 200 Notes:");
	depos200=sc.nextInt();
	
	System.out.println("Enter number of 100 Notes:");
	depos100=sc.nextInt();
	
	if(depos2000<0 || depos500<0 || depos200<0 || depos100<0) {
		System.out.println("Incorrect deposit amount");
		return;
	}
	else if(depos2000==0 && depos500==0 && depos200==0 && depos100==0)
	{
		System.out.println("Deposit amount cannot be zero");
		return;
	}
	else {
	balance.replace(2000, depos2000);
	balance.replace(500, depos500);
	balance.replace(200, depos200);
	balance.replace(100, depos100);
	}
	
	System.out.println("Balance: 2000s="+balance.get(2000)+",500s="+balance.get(500)+",200s="+balance.get(200)+",100s="+balance.get(100)+", Total="+currentbalance(balance));
    	 
}
 
}
