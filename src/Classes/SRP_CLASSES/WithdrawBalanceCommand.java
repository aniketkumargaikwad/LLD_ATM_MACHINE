package Classes.SRP_CLASSES;

import Classes.User;
import Interfaces.Command;

import java.util.Scanner;

public class WithdrawBalanceCommand implements Command {
    public void execute(User user){
        System.out.println("Entre amount to withdraw");
        Scanner sc = new Scanner(System.in);
        int amountToWithdraw = sc.nextInt();
        int newBalance = user.withdrawAmount(amountToWithdraw);
        System.out.println("Your new balance is : "+newBalance);
        System.out.println("----------------------------------------");
    }
}
