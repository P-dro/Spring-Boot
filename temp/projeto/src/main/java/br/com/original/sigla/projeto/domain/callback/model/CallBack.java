package br.com.pedro.trampo.domain.callback.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CallBack {
    //Costumer
    private String accountType;
    private String customer;
    private String nickName;
    private String documentNumberCostumer;
    private String email;
    private String motherName;
    private LocalDate birthDate;
    private String phone;
    private String segment;
    private String campaign;
    private String agent;
    //Transaction
    private String transaction;
    private String classification;
    private String channel;
    private String status;
    private LocalDateTime transacDateTime;
    //Source Account
    private String bankSource;
    private String agencySource;
    private String account;
    private LocalDateTime scheduleDate;
    private String documentNumberSourceAccount;
    //Destination Account
    private String payeeName;
    private String documentNumberDestinationAccount;
    private String registered;
    private String bankDestination;
    private String agencyDestination;
    private String accountNumber;
    private String finality;
    private Long value;


    //Costumers Getters and Setters

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDocumentNumberCostumer() {
        return documentNumberCostumer;
    }

    public void setDocumentNumberCostumer(String documentNumberCostumer) {
        this.documentNumberCostumer = documentNumberCostumer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }


    //Transaction Getters and Setters

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTransacDateTime() {
        return transacDateTime;
    }

    public void setTransacDateTime(LocalDateTime transacDateTime) {
        this.transacDateTime = transacDateTime;
    }


    //Source Account Getters and Setters

    public String getBankSource() {
        return bankSource;
    }

    public void setBankSource(String bankSource) {
        this.bankSource = bankSource;
    }

    public String getAgencySource() {
        return agencySource;
    }

    public void setAgencySource(String agencySource) {
        this.agencySource = agencySource;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public LocalDateTime getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDateTime scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getDocumentNumberSourceAccount() {
        return documentNumberSourceAccount;
    }

    public void setDocumentNumberSourceAccount(String documentNumberSourceAccount) {
        this.documentNumberSourceAccount = documentNumberSourceAccount;
    }


    //Destination Account Getters and Setters

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getDocumentNumberDestinationAccount() {
        return documentNumberDestinationAccount;
    }

    public void setDocumentNumberDestinationAccount(String documentNumberDestinationAccount) {
        this.documentNumberDestinationAccount = documentNumberDestinationAccount;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getBankDestination() {
        return bankDestination;
    }

    public void setBankDestination(String bankDestination) {
        this.bankDestination = bankDestination;
    }

    public String getAgencyDestination() {
        return agencyDestination;
    }

    public void setAgencyDestination(String agencyDestination) {
        this.agencyDestination = agencyDestination;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFinality() {
        return finality;
    }

    public void setFinality(String finality) {
        this.finality = finality;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
