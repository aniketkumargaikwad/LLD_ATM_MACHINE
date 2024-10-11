package Classes.SRP_CLASSES;

import Classes.User;
import Interfaces.Command;
import Reposiratory.UserRepo;

import java.util.Scanner;

public class TransferAmountCommand implements Command {
    public void execute(User user){
        UserRepo ur = new UserRepo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Recipient's Id");
        int recipientId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter amount to be transferred");
        int amountToTransfer = sc.nextInt();
        if(amountToTransfer > user.getBalance()){
            System.out.println("Insufficient amount");
        }
        else{
            User userToBeTransferred = ur.autheticateUser(recipientId);
            if(userToBeTransferred != null){
                userToBeTransferred.depositAmount(amountToTransfer);
                user.withdrawAmount(amountToTransfer);
                System.out.println("Your new balance is : "+user.getBalance());
            }
            else{
                System.out.println("Invalid Recipient");
            }

        }
        System.out.println("----------------------------------------");
    }
}
