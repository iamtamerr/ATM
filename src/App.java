import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an id(0-9): ");
        int userid = input.nextInt();

        double[] moneyUsers = {100,100,100,100,100,100,100,100,100,100};

        User user = new User(userid, moneyUsers[userid]);

        
        
        while(true){
            
            System.out.println("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    user.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter an amount the withdraw: ");
                    int amountWithdraw = input.nextInt();
                    moneyUsers[userid] = user.withdraw(amountWithdraw);
                    break;
                case 3:
                    System.out.print("Enter an amount the deposit: ");
                    int amountDeposit = input.nextInt();
                    moneyUsers[userid] = user.deposit(amountDeposit);
                    break;
                case 4:    
                    
                    System.out.print("Enter an id(0-9): ");
                    userid = input.nextInt();    
                    user = new User(userid, moneyUsers[userid]);
                    break;
    
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    break;
            }
            System.out.println();
        }
    }
}

