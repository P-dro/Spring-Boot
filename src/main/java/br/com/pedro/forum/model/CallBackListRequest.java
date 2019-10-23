package br.com.pedro.forum.model;

public class CallBackListRequest {
    private int id;
    private CallBackList callBackList;
    private CallBackTransaction transaction;
    private CallBackCustomer customer;
    private java.util.List listaCallbacks;


    public CallBackListRequest(CallBackList callBackList, CallBackTransaction transaction, CallBackCustomer customer) {
        this.callBackList = callBackList;
        this.transaction = transaction;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CallBackList getCallBackLista() {
        return callBackList;
    }

    public void setCallBackLista(CallBackList callBackList) {
        this.callBackList = callBackList;
    }

    public CallBackCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(CallBackCustomer customer) {
        this.customer = customer;
    }

    public CallBackTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(CallBackTransaction transaction) {
        this.transaction = transaction;
    }

}

