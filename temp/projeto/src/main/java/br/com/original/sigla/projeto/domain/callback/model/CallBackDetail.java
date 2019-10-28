package br.com.original.sigla.projeto.domain.callback.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CallBackDetail {
    //Costumer
    private String accountType;
    private String customer;
    private String nickName;
    private String identification;
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
    private String bankSourceAccount;
    private String agencySourceAccount;
    private String account;
    private LocalDateTime scheduleDate;
    private String identificationSourceAccount;
    //Destination Account
    private String payeeName;
    private String identificationDestinationAccount;
    private String registered;
    private String bankDestinationAccount;
    private String agencyDestinationAccount;
    private String accountNumber;
    private String finality;
    private Long value;

    //Costumer

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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
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


    //Transaction


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


    //Source Account


    public String getBankSourceAccount() {
        return bankSourceAccount;
    }

    public void setBankSourceAccount(String bankSourceAccount) {
        this.bankSourceAccount = bankSourceAccount;
    }

    public String getAgencySourceAccount() {
        return agencySourceAccount;
    }

    public void setAgencySourceAccount(String agencySourceAccount) {
        this.agencySourceAccount = agencySourceAccount;
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

    public String getIdentificationSourceAccount() {
        return identificationSourceAccount;
    }

    public void setIdentificationSourceAccount(String identificationSourceAccount) {
        this.identificationSourceAccount = identificationSourceAccount;
    }


    //Destination Account


    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getIdentificationDestinationAccount() {
        return identificationDestinationAccount;
    }

    public void setIdentificationDestinationAccount(String identificationDestinationAccount) {
        this.identificationDestinationAccount = identificationDestinationAccount;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getBankDestinationAccount() {
        return bankDestinationAccount;
    }

    public void setBankDestinationAccount(String bankDestinationAccount) {
        this.bankDestinationAccount = bankDestinationAccount;
    }

    public String getAgencyDestinationAccount() {
        return agencyDestinationAccount;
    }

    public void setAgencyDestinationAccount(String agencyDestinationAccount) {
        this.agencyDestinationAccount = agencyDestinationAccount;
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
