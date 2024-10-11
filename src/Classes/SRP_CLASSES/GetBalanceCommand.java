package Classes.SRP_CLASSES;

import Classes.User;
import Interfaces.Command;

public class GetBalanceCommand implements Command {

    public void execute(User user) {
        System.out.println(user.getBalance());
        System.out.println("----------------------------------------");
    }
}
