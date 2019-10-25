package br.com.original.sigla.projeto.api.callback;


import br.com.original.sigla.projeto.api.callback.model.CallBackResponse;
import br.com.original.sigla.projeto.domain.callback.service.BasicHttpErrorMessage;
import br.com.original.sigla.projeto.domain.config.mocks.CallBackListMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/callback")
public class CallBackController {


    @GetMapping("/listar")
    public ResponseEntity<Object> lista(@RequestParam(required = false) Integer pagina, @RequestParam(required = false) Integer qtd) {

        CallBackListMock callBackListMock = new CallBackListMock();


//        java.util.List lista = new ArrayList();

        int fromIndex = ((pagina - 1) * qtd);

//        CallBackList callBackList = new CallBackList();
//        callBackList.setClassification("Callback de Segurança");
//        callBackList.getSourceDateTime();
//        callBackList.setStatus("pendente");
//        callBackList.setType("TED");
//
//        callBackList.setCreationDate(LocalDateTime.now());
//        callBackList.setScheduleDate(LocalDateTime.now());
//        callBackList.setValue((long) 2500);
//
//        callBackList.setIdentification("56225898487");
//        callBackList.setName("Silvano Pereira");
//
//        for (int i = 0; i < 50; i++) {
//            CallBackRequest request = new CallBackRequest(callBackList);
//            request.setId((long) i);
//            lista.add(request);
//        }

        double qtdDouble = qtd;
        double tamanho = Math.ceil(callBackListMock.listMock().size()/qtdDouble);

        if (qtd == null || pagina == null) {

            return ResponseEntity.ok().body(callBackListMock.listMock());
        }

        if (pagina * qtd > callBackListMock.listMock().size()){
            BasicHttpErrorMessage erro = new BasicHttpErrorMessage();
            erro.setMessage("Quantidade de paginas ou quantidade de itens inválida");
            erro.setTimestamp(LocalDateTime.now().toString());
            erro.setStatus(200);
            return new ResponseEntity<>(erro, HttpStatus.OK);
        }

        CallBackResponse paginacao = new CallBackResponse();
        paginacao.setNumberPage((int) tamanho);
        paginacao.setNumberRecords(callBackListMock.listMock().size());
        paginacao.setListaCallbacks(callBackListMock.listMock(), fromIndex, qtd);
        return ResponseEntity.ok().body(paginacao);
    }

}
