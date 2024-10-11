import Classes.ATM;
import Classes.Utility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atmInstance = ATM.getInstance();
        atmInstance.start();
    }
}