package com.learn.jay;

public class BankingFacade {

    AccountTransfer accountTransfer = new AccountTransfer();
    WithdrawCash withdrawCash = new WithdrawCash();
    StatementIssuer statementIssuer = new StatementIssuer();

    public String onlineTransfer(Long fromAcc, Long toAcc, Integer amount) {

        // Some Complex operations and business logic checking the available balance, ledger balance
        return accountTransfer.onlineTransfer(fromAcc, toAcc, amount);
    }

    public void atmWithdrawal(Long fromAcc, Integer amount) {
        // Some Complex operations and business logic checking the available balance, ledger balance
        withdrawCash.atmWithdrawal(fromAcc, amount);
    }

    public String printStatement(Long fromAcc) {
        return statementIssuer.printStatement(fromAcc);
    }
}
