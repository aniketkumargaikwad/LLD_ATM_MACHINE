package Classes;

import java.util.Scanner;

public class ATM {
    public static ATM instance;
    public static ATM getInstance(){
        if(instance == null) return new ATM();
        return instance;
    }
    public void start(){
        System.out.println("Welcome to the Money management system!");
        System.out.println("----------------------------------------");
        System.out.println("Press 1 : SignUp");
        System.out.println("Press 2 : Login");
        System.out.println("----------------------------------------");
        Scanner sc= new Scanner(System.in);
        int userTpe = sc.nextInt();
        if(userTpe == 1){
            redirectToSignUp();
        }
        else{
            redirectToLogin();
        }
    }
    private void redirectToLogin() {
        Utility ul = new Utility();
        ul.userLogin();

    }
    private void redirectToSignUp() {
        Utility ul = new Utility();
        ul.userSignup();
    }
}
