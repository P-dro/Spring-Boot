package br.com.original.sigla.projeto.domain.config.mocks;

import br.com.original.sigla.projeto.api.callback.model.interactor.detail.CallBackDetailRequest;
import br.com.original.sigla.projeto.domain.callback.model.CallBackDetail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public abstract class CallBackDetailMock {

    public static void mockDetail(List lista) {

        CallBackDetail customerMock = new CallBackDetail();
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

        customerMock.setTransaction("TED - para outro banco");
        customerMock.setClassification("Callback de Segurança");
        customerMock.setChannel("mobile");
        customerMock.setStatus("Pendente");
        customerMock.setTransacDateTime(LocalDateTime.now());

        customerMock.setBankSourceAccount("Original");
        customerMock.setAgencySourceAccount("00001");
        customerMock.setAccount("12345678");
        customerMock.setScheduleDate(LocalDateTime.of(2019, Month.JUNE, 21, 10, 30));
        customerMock.setIdentificationSourceAccount("Original");

        customerMock.setPayeeName("Priscilla Dantas da Silva");
        customerMock.setIdentificationDestinationAccount("95581114131");
        customerMock.setRegistered("Não");
        customerMock.setBankDestinationAccount("Itaú Unibanco S.A.");
        customerMock.setAgencyDestinationAccount("1626");
        customerMock.setAccountNumber("12345678");
        customerMock.setFinality("Crédito em Conta");
        customerMock.setValue((long) 1000);

        for (int i = 0; i < 50; i++) {
            CallBackDetailRequest request = new CallBackDetailRequest(customerMock);
            request.setId((long) i);
            lista.add(request);
        }
    }
}
