package Classes;

import Enums.Status;
import Interfaces.Users;

public class User implements Users {
    private int id;
    private String name;
    private int balance;
    private String password;

    public User(){

    }
    public User(int id, String name, int balance, String password){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }


    @Override
    public int getBalance() {
        return this.balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int depositAmount(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int withdrawAmount(int amountToWithdraw) {
        this.balance -= amountToWithdraw;
        return this.balance;
    }
}
