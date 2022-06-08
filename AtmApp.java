import java.util.Scanner;



public class AtmApp {
public static void main(String[] args) {
{
int balance = 0, withdraw, deposit;
int A,B,C,D = 0;



Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("Automated Teller Machine");
System.out.println("Choose 1 for Withdraw");
System.out.println("Choose 2 for Deposit");
System.out.println("Choose 3 for Check Balance");
System.out.println("Choose 4 for EXIT");
System.out.print("Choose the operation you want to perform:");
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter money to be withdrawn:");
withdraw = sc.nextInt();
if (balance >= withdraw & withdraw % 100 == 0) {
balance = balance - withdraw;
A = withdraw/2000;
withdraw -= A*2000;
B = withdraw/500;
withdraw -= B*500;
C = withdraw/200;
withdraw -= C*200;
D= withdraw/100;
withdraw -= D*100;
System.out.println("Please collect your money");
System.out.println("2000: "+A);
System.out.println("500: "+B);
System.out.println("200: "+C);
System.out.println("100: "+D);
}
else {
System.out.println("Insufficient Balance or Enter amount in multiples of 100's");
}
System.out.println("");
break;



case 2:
System.out.print("Enter number of 2000 notes:");
A = sc.nextInt();
System.out.print("Enter number of 500 notes:");
B = sc.nextInt();
System.out.print("Enter number of 200 notes:");
C = sc.nextInt();
System.out.print("Enter number of 100 notes:");
D = sc.nextInt();
deposit = A*2000 + B*500 + C*200 + D*100;
balance = balance + deposit;
System.out.println("Your Money has been successfully depsited");
System.out.println("");
break;



case 3:
System.out.println("Balance : " + balance);
System.out.println("");
break;



case 4:
System.exit(0);
}
}
}
}
}