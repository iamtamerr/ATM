import java.util.Scanner;

public class User {
    public int id;
    public double money=100;

    User(int id,double money){
        this.id = id;
        this.money = money;
    }
    
    Scanner input = new Scanner(System.in);

    public void checkBalance(){
        System.out.println("The balance is " + this.money);
    }

    public double withdraw(int amountWithdraw){
        if(amountWithdraw>this.money){
            System.out.println("Withdraw amount is too large.\nYou are redirected to deposit menu");
            System.out.print("Enter an amount the deposit: ");
            int amountDeposit = input.nextInt();
            return this.deposit(amountDeposit);  
        }
        else{
            return this.money -= amountWithdraw;
        }
    }
    public double deposit(int amountDeposit){
        return this.money+=amountDeposit;
    }
}
