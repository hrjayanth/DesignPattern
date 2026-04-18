package com.learn.jay;

public class Client {
    private BankingFacade facade;

    public Client(BankingFacade facade) {
        this.facade = facade;
    }

    public static void main(String args[]) {
        BankingFacade facade = new BankingFacade();
        facade.onlineTransfer(1001L, 1002L, 10000);
        facade.atmWithdrawal(1001L, 1000);
        facade.printStatement(1001L);
    }
}
