package br.com.pedro.forum.controller;

import br.com.pedro.forum.config.validacao.BasicHttpErrorMessage;
import br.com.pedro.forum.controller.form.CallBackDetailChangeForm;
import br.com.pedro.forum.controller.form.CallBackLoginForm;
import br.com.pedro.forum.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/callback")
public class CallBackDetailsController {

    private Object target;

    java.util.List<CallBackDetailRequest> lista = new ArrayList<>();

    public List mockLista() {

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

    @GetMapping("/detalhes/{id}")
    public ResponseEntity<Object> destail(@PathVariable int id) {
        target = null;

        mockLista();

        BasicHttpErrorMessage erro = new BasicHttpErrorMessage();
        erro.setMessage("Não existe esse número de ID");
        erro.setTimestamp(LocalDateTime.now().toString());
        erro.setStatus(200);

        lista.forEach(e -> {
            if (e.getId() == id) {
               this.target = e;
            }
        });

        if (target == null) {
            return new ResponseEntity<>(erro, HttpStatus.OK);
        }

        return ResponseEntity.ok().body(target);
    }
    @PatchMapping("/parecer/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody CallBackDetailChangeForm callBackDetailChange) {
        mockLista();
        lista.forEach(e -> {
            if (e.getId() == id) {
                CallBackDetailTransaction updateTransaction =  e.getTransaction();
                updateTransaction.setStatus(callBackDetailChange.getStatus());
                e.setTransaction(updateTransaction);
                this.target = e;
            }
        });
        return ResponseEntity.ok().body(target);
    }


}
