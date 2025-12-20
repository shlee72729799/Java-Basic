package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000); //출금
        account.withdraw(2000); //잔액부

        System.out.println("잔고: " + account.balance); //잔고 확인
    }
}