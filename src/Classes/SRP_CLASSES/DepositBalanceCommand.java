package Classes.SRP_CLASSES;

import Classes.User;
import Interfaces.Command;

import java.util.Scanner;

public class DepositBalanceCommand implements Command{
    public void execute(User user){
        System.out.println("Entre amount to deposit");
        Scanner sc = new Scanner(System.in);
        int amountToDeposit = sc.nextInt();
        int newBalance = user.depositAmount(amountToDeposit);
        System.out.println("Your new balance is : "+newBalance);
        System.out.println("----------------------------------------");
    }
}
