# Banking Management System

The **Banking Management System** is a software application designed to manage essential banking operations such as account management, transactions, balance inquiries, and withdrawals. This system aims to streamline banking services and improve user convenience.

## Features

- **Account Management:** Create, delete, and update account details.
- **Transaction Management:** Handle deposits, withdrawals, fast cash transactions, and provide mini statements.
- **User Authentication:** Supports user login, signup, and PIN management for secure access.

## Project Structure:

banking-management-system/ │ ├── src/ │ ├── IAccountManagement.java │ ├── ITransactionManagement.java │ ├── IAuthentication.java │ ├── Account.java │ ├── Transaction.java │ ├── Login.java │ ├── Signup.java │ ├── SignupStep2.java │ ├── SignupStep3.java │ ├── BalanceEnquiry.java │ ├── Deposit.java │ ├── FastCash.java │ ├── Withdrawal.java │ ├── Conn.java │ ├── PinManagement.java │ ├── MiniStatement.java │ └── Main.java ├── README.md └── .gitignore



## System Design

### Interfaces

1. **IAccountManagement**
    - `createAccount(Account account)`
    - `deleteAccount(int accountId)`
    - `updateAccountDetails(Account account)`
    - `getAccountDetails(int accountId)`

2. **ITransactionManagement**
    - `deposit(int accountId, double amount)`
    - `withdraw(int accountId, double amount)`
    - `getBalance(int accountId)`
    - `fastCash(int accountId, double amount)`
    - `generateMiniStatement(int accountId)`

3. **IAuthentication**
    - `login(String username, String password)`
    - `signup(Account account)`
    - `managePin(int accountId, String newPin)`

### Classes

- **Account**
  - **Attributes:** accountId, accountHolderName, accountType, balance, contactDetails
  - **Methods:** `getAccountDetails()`, `updateAccountDetails()`

- **Transaction**
  - **Attributes:** transactionId, accountId, transactionType, amount, transactionDate
  - **Methods:** `recordTransaction()`, `getTransactionDetails()`

- **Login**
  - **Methods:** `loginUser(String username, String password)`

- **Signup**
  - **Methods:** `createAccountStep1()`

- **SignupStep2** (extends Signup)
  - **Methods:** `createAccountStep2()`

- **SignupStep3** (extends SignupStep2)
  - **Methods:** `createAccountStep3()`

- **BalanceEnquiry**
  - **Methods:** `checkBalance(int accountId)`

- **Deposit**
  - **Methods:** `depositAmount(int accountId, double amount)`

- **FastCash**
  - **Methods:** `fastCashWithdrawal(int accountId, double amount)`

- **Withdrawal**
  - **Methods:** `withdrawAmount(int accountId, double amount)`

- **Conn**
  - **Purpose:** Establishes and manages database connections.

- **PinManagement**
  - **Methods:** `updatePin(int accountId, String newPin)`

- **MiniStatement**
  - **Methods:** `generateMiniStatement(int accountId)`

## Installation

To set up the Banking Management System:

1. Clone the repository:
   ```bash
   git clone https://github.com/falconx-55/cseku_apl_24_230208/tree/main/task2/Banking_Management_System




