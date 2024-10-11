package Classes;

import Classes.SRP_CLASSES.DepositBalanceCommand;
import Classes.SRP_CLASSES.GetBalanceCommand;
import Classes.SRP_CLASSES.TransferAmountCommand;
import Classes.SRP_CLASSES.WithdrawBalanceCommand;
import Reposiratory.UserRepo;

import java.util.Objects;
import java.util.Scanner;

public class Utility {
    Scanner sc = new Scanner(System.in);
    public void userLogin() {
        while(true){
            UserRepo ur = new UserRepo();
            System.out.println("----------------------------------------");
            System.out.println("Please enter you userId");
            int userId = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter your password");
            String userPassword = sc.nextLine();
            User triedLoggedInUser = ur.autheticateUser(userId, userPassword);
            if(triedLoggedInUser != null){
                System.out.println("logged in successfully");
                System.out.println("----------------------------------------");
                showMenu(triedLoggedInUser);
                break;

            }
            else{
                System.out.println("Incorrect credentials, please try again");
            }


        }
    }

    public void userSignup() {
        System.out.println("----------------------------------------");
        System.out.println("Provide id");
        int newId = sc.nextInt();
        sc.nextLine();
        System.out.println("Provide name");
        String newName= sc.nextLine();
        System.out.println("Provide opening balance");
        int openingBal = sc.nextInt();
        sc.nextLine();
        System.out.println("Provide strong password");
        String newPassword = sc.nextLine();

        User newUser = new User(newId, newName, openingBal, newPassword);
        System.out.println("----------------------------------------");
        System.out.println("Account created successfully");
        showMenu(newUser);
    }

    private void showMenu(User triedLoggedInUser){
        GetBalanceCommand getBalanceCommand = new GetBalanceCommand();
        DepositBalanceCommand depositBalanceCommand = new DepositBalanceCommand();
        WithdrawBalanceCommand withdrawBalanceCommand = new WithdrawBalanceCommand();
        TransferAmountCommand transferAmountCommand = new TransferAmountCommand();

        System.out.println("Press 1 : To check balance");
        System.out.println("Press 2 : To Withdraw money");
        System.out.println("Press 3 : To deposit money");
        System.out.println("Press 4 : To transfer balance");
        System.out.println("press 9 : To Logout");
        System.out.println("Press 0 : To exit");
        System.out.println("----------------------------------------");

        while(true){
            int menuSelection = sc.nextInt();
            if(menuSelection == 1){
                getBalanceCommand.execute(triedLoggedInUser);
            }
            else if(menuSelection == 2){
                withdrawBalanceCommand.execute(triedLoggedInUser);
            }
            else if (menuSelection == 3) {
                depositBalanceCommand.execute(triedLoggedInUser);
            }
            else if (menuSelection == 4) {
                transferAmountCommand.execute(triedLoggedInUser);
            }
            else if (menuSelection == 9) {
                ATM instance = ATM.getInstance();
                instance.start();
            }
            else if(menuSelection == 0) break;
            else{
                System.out.println("invalid input");
            }
        }
    }
}
