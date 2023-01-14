import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, password,balance to create account");

        String name =sc.nextLine();
        String password= sc.next();
        double balance =sc.nextDouble();
        SBIUser user =new SBIUser(name,balance,password);

        //add amount
        String message =user.addMoney(10000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter money you want to withdraw");
        int money= sc.nextInt();
        System.out.println("Enter your Password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        System.out.println(user.calculateIntrest(10));
    }
}