package br.com.pedro.forum.repository;

import br.com.pedro.forum.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public interface CallBackDetailMock {


    java.util.List<CallBackDetailRequest> lista = mockLista();

    public static List mockLista() {

        CallBackDetailCustomer customerMock = new CallBackDetailCustomer();
        customerMock.setAccountType("R");
        customerMock.setCustomer("Ayrton Oliveira Junior");
        customerMock.setNickName("Sr. Ayrton");
        customerMock.setIdentification("40439304905");
        customerMock.setEmail("ayrton.junior@empresa.com.br");
        customerMock.setMotherName("Maria Oliveira");
        customerMock.setBirthDate(LocalDate.of(2019, Month.JULY, 18));
        customerMock.setPhone("11912341234");
        customerMock.setSegment("Varejo02");
        customerMock.setCampaign("PicPay");
        customerMock.setAgent("Clecia Wenceslau dos Santos");

        CallBackDetailTransaction transactionMock = new CallBackDetailTransaction();
        transactionMock.setTransaction("TED - para outro banco");
        transactionMock.setClassification("Callback de Segurança");
        transactionMock.setChannel("mobile");
        transactionMock.setStatus("Pendente");
        transactionMock.setTransacDateTime(LocalDateTime.now());

        CallBackDetailSouceAccount mockSouceAccount = new CallBackDetailSouceAccount();
        mockSouceAccount.setBank("Original");
        mockSouceAccount.setAgency("00001");
        mockSouceAccount.setAccount("12345678");
        mockSouceAccount.setScheduleDate(LocalDateTime.of(2019, Month.JUNE, 21, 10, 30));
        mockSouceAccount.setIdentification("Original");

        CallBackDetailDestinationAccount mockDestinationAccount = new CallBackDetailDestinationAccount();
        mockDestinationAccount.setPayeeName("Priscilla Dantas da Silva");
        mockDestinationAccount.setIdentification("95581114131");
        mockDestinationAccount.setRegistered("Não");
        mockDestinationAccount.setBank("Itaú Unibanco S.A.");
        mockDestinationAccount.setAgency("1626");
        mockDestinationAccount.setAccountNumber("12345678");
        mockDestinationAccount.setFinality("Crédito em Conta");
        mockDestinationAccount.setValue((long) 1000);

        for (int i = 0; i < 50; i++) {
            CallBackDetailRequest request = new CallBackDetailRequest(customerMock, transactionMock, mockSouceAccount, mockDestinationAccount);
            request.setId((long) i);
            lista.add(request);
        }
        return lista;
    }
}