
```markdown
# ATM Console Application

## UML Diagram
    [ATM] ----> [Command Interface] <---- [CheckBalanceCommand]
                              |            |
                              |            |--> [WithdrawMoneyCommand]
                              |            |--> [DepositMoneyCommand]
                              |            |--> [TransferMoneyCommand]
                              |
                          [UserRepo] ----> [User]
## Overview

This is a simple console-based ATM (Banking) application implemented in **Java**. The application allows users to:
- **Sign up** for a new account
- **Log in** with authentication
- Perform various banking operations such as:
  - Checking account balance
  - Depositing money
  - Withdrawing money
  - Transferring money to another user

The application is designed following **SOLID principles** and utilizes key **Design Patterns** to ensure scalability, maintainability, and clean architecture.

## Table of Contents
1. [Features](#features)
2. [Architecture & Design](#architecture--design)
3. [Design Patterns](#design-patterns)
4. [SOLID Principles](#solid-principles)
5. [Usage](#usage)
6. [Setup](#setup)
7. [Future Improvements](#future-improvements)

## Features

- **Sign Up:** Users can create a new account by providing their user ID, name, password, and initial balance.
- **Login:** Users are authenticated based on their user ID and password.
- **Check Balance:** Users can check their current account balance.
- **Deposit Money:** Users can deposit money into their account.
- **Withdraw Money:** Users can withdraw money, with proper balance validation.
- **Transfer Money:** Users can transfer money to other registered users.

## Architecture & Design

This project has been designed using **Object-Oriented Programming (OOP)** principles, adhering to the following structure:

- `ATM`: The main class (Singleton) controlling the ATM system's lifecycle and managing the user interactions.
- `User`: A class representing the bank account user, with properties like `userId`, `userName`, `password`, and `balance`.
- `UserRepo`: A class responsible for user management, including authentication and user account storage.
- **Command Pattern**: Different operations like `CheckBalance`, `DepositMoney`, `WithdrawMoney`, and `TransferMoney` are handled via separate classes, implementing the `Command` interface.

This separation of concerns ensures a clean and extendable architecture.

## Design Patterns

1. **Singleton Pattern**:
   - Applied to the `ATM` class, ensuring that only a single instance of the ATM system exists throughout the application’s lifecycle. This ensures global access to shared resources and consistency.

2. **Command Pattern**:
   - Each banking operation is encapsulated into a separate class (`CheckBalanceCommand`, `DepositMoneyCommand`, `WithdrawMoneyCommand`, `TransferMoneyCommand`), following the **Command Pattern**. This decouples the operations from the main control flow, making the application more modular, testable, and scalable.

3. **Factory Pattern** (Optional Extension):
   - Can be easily extended in the future to create different types of accounts (e.g., savings, checking) without modifying existing logic, following the **Open/Closed Principle**.

## SOLID Principles

1. **Single Responsibility Principle (SRP)**:
   - Each class in the system has a clear responsibility. For example:
     - `UserService` only handles user authentication and storage.
     - `Command` classes handle specific operations like deposit or withdraw.

2. **Open/Closed Principle (OCP)**:
   - The system is designed to be open for extension but closed for modification. New commands (e.g., `LoanRepaymentCommand`) can be added without changing the core logic of the `ATM` or `UserService` classes.

3. **Liskov Substitution Principle (LSP)**:
   - Objects of subclasses (e.g., any future extended user types) can be substituted without affecting the correctness of the program. The `Command` interface ensures that all operations are interchangeable in the ATM menu.

4. **Interface Segregation Principle (ISP)**:
   - The design promotes small, specific interfaces (like the `Command` interface) that adhere to specific functionalities. This avoids bloated interfaces that force classes to implement methods they don’t use.

5. **Dependency Inversion Principle (DIP)**:
   - The ATM system depends on abstractions rather than concrete classes. The `ATM` class does not depend on specific operations but rather on the `Command` interface, which allows future flexibility.

## Usage

### Sign Up
```
1. Enter User ID
2. Enter Username
3. Enter Password
4. Enter Initial Balance
```
### Login
```
1. Enter User ID
2. Enter Password
```
### Banking Operations
Once logged in, users can perform the following operations:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Exit
### Example Console Interaction:
```
Welcome to the ATM

1. Sign Up
2. Log In
Choose option: 2

Log In:
Enter User ID: 1
Enter Password: password123
Logged in successfully.

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Exit
Choose option: 1

Your balance is: $5000.0
```
## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/username/atm-console-app.git
   ```

2. **Run the Application**:
   Compile and run the `Main` class to start the ATM console application.
   ```bash
   javac Main.java
   java Main
   ```

## Future Improvements

- **Multi-threading Support**: Enable concurrent access for multiple users.
- **Database Integration**: Migrate from in-memory user storage to a persistent database system like MySQL.
- **Account Types**: Introduce different account types such as Savings, Checking, and Joint Accounts, utilizing the Factory Pattern for account creation.
- **Advanced Security**: Implement encryption for user credentials.
- **Transaction History**: Add a feature to store and display users' transaction history.
## Why This Design?
This design demonstrates the **SOLID principles** and **Design Patterns** effectively:
- **Scalability**: The system can easily be extended by adding new operations or features without breaking existing functionality.
- **Maintainability**: The use of small, single-responsibility classes makes the codebase easy to maintain and understand.
- **Testability**: By separating the logic of different operations, each command can be tested independently, improving test coverage and reliability.
This project is structured to reflect a **real-world scalable system**, providing the flexibility to grow and adapt as needed.
```

