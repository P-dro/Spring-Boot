package br.com.pedro.forum.controller;

import br.com.pedro.forum.config.validacao.BasicHttpErrorMessage;
import br.com.pedro.forum.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/callback")
public class CallBackListaController {

    @GetMapping("/listar")
    public ResponseEntity<Object> lista(@RequestParam(required = false) Integer pagina, @RequestParam(required = false) Integer qtd) throws BasicHttpErrorMessage {

        java.util.List lista = new ArrayList();
        java.util.List listaPag = new ArrayList();

        int fromIndex = ((pagina - 1) * qtd);

        CallBackList callBackList = new CallBackList();
        callBackList.setClassification("Callback de Segurança");
        callBackList.getSourceDateTime();
        callBackList.setStatus("pendente");
        callBackList.setType("TED");

        CallBackTransaction transaction = new CallBackTransaction();
        transaction.setCreationDate(LocalDateTime.now());
        transaction.setScheduleDate(LocalDateTime.now());
        transaction.setValue(2.500);

        CallBackCustomer mockCustomer = new CallBackCustomer();
        mockCustomer.setIdentification("56225898487");
        mockCustomer.setName("Silvano Pereira");

        for (int i = 0; i < 50; i++) {
            CallBackListRequest request = new CallBackListRequest(callBackList, transaction, mockCustomer);
            request.setId(i);
            lista.add(request);
        }

        double qtdDouble = qtd;
        double tamanho = Math.ceil(lista.size()/qtdDouble);

        if (qtd == null || pagina == null) {

            return ResponseEntity.ok().body(lista);
        }

        if (pagina * qtd > lista.size()){
            BasicHttpErrorMessage erro = new BasicHttpErrorMessage();
            erro.setMessage("Quantidade de paginas ou quantidade de itens inválida");
            erro.getTimestamp();
            erro.getStatus();
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }

        CallBackListResponse paginacao = new CallBackListResponse();
        paginacao.setNumberPage((int) tamanho);
        paginacao.setNumberRecords(lista.size());
        paginacao.setListaCallbacks(lista, fromIndex, qtd);
        return ResponseEntity.ok().body(paginacao);
    }

}






