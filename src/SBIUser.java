import java.util.Objects;
import java.util.UUID;

public class SBIUser implements  Bankinterface{

    //atrributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfIntrest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfIntrest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());

    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "your balance"+amount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "sorry insufficient balance";
            }else {
                balance=balance-amount;
                return "paise nikal gaye"+balance;
            }
        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateIntrest(int years) {
        return (balance*years*rateOfIntrest)/100;
    }
}
