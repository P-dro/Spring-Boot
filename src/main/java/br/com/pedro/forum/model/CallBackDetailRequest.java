package br.com.pedro.forum.model;

public class CallBackDetailRequest {

    private Long id;
    private CallBackDetailCustomer customer;
    private CallBackDetailTransaction transaction;
    private CallBackDetailSouceAccount soucerAccount;
    private CallBackDetailDestinationAccount destinationAccount;

    public CallBackDetailRequest(CallBackDetailCustomer customer, CallBackDetailTransaction transaction, CallBackDetailSouceAccount soucerAccount, CallBackDetailDestinationAccount destinationAccount) {
        this.customer = customer;
        this.transaction = transaction;
        this.soucerAccount = soucerAccount;
        this.destinationAccount = destinationAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CallBackDetailCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(CallBackDetailCustomer customer) {
        this.customer = customer;
    }

    public CallBackDetailTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(CallBackDetailTransaction transaction) {
        this.transaction = transaction;
    }

    public CallBackDetailSouceAccount getSoucerAccount() {
        return soucerAccount;
    }

    public void setSoucerAccount(CallBackDetailSouceAccount soucerAccount) {
        this.soucerAccount = soucerAccount;
    }

    public CallBackDetailDestinationAccount getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(CallBackDetailDestinationAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
