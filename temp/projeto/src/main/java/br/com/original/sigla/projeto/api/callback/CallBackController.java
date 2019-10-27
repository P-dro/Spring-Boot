package br.com.pedro.trampo.api.callback;


import br.com.pedro.trampo.api.callback.model.CallBackResponse;
import br.com.pedro.trampo.api.callback.model.interactor.detail.CallBackDetailRequest;
import br.com.pedro.trampo.api.callback.model.interactor.form.CallBackDetailForm;
import br.com.pedro.trampo.domain.callback.model.CallBackDetail;
import br.com.pedro.trampo.domain.callback.service.BasicHttpErrorMessage;
import br.com.pedro.trampo.domain.config.mocks.CallBackDetailMock;
import br.com.pedro.trampo.domain.config.mocks.CallBackListMock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/callback")
public class CallBackController {

    java.util.List<CallBackDetailRequest> listDetail = new ArrayList<>();
    private Object target;

    @GetMapping("/listar")
    public ResponseEntity<Object> lista(@RequestParam(required = false) Integer pagina, @RequestParam(required = false) Integer qtd) {

        java.util.List lista = new ArrayList();

        int fromIndex = ((pagina - 1) * qtd);

        CallBackListMock.listaMock(lista);

        double qtdDouble = qtd;
        double tamanho = Math.ceil(lista.size()/qtdDouble);

        if (pagina * qtd > lista.size()){
            BasicHttpErrorMessage erro = new BasicHttpErrorMessage();
            erro.setMessage("Quantidade de paginas ou quantidade de itens inválida");
            erro.setTimestamp(LocalDateTime.now().toString());
            erro.setStatus(200);
            return new ResponseEntity<>(erro, HttpStatus.OK);
        }

        CallBackResponse paginacao = new CallBackResponse();
        paginacao.setNumberPage((int) tamanho);
        paginacao.setNumberRecords(lista.size());
        paginacao.setListaCallbacks(lista, fromIndex, qtd);
        return ResponseEntity.ok().body(paginacao);
    }

    @GetMapping("/detalhes/{id}")
    public ResponseEntity<Object> destail(@PathVariable int id) {
        target = null;

        CallBackDetailMock.mockDetail(listDetail);

        BasicHttpErrorMessage erro = new BasicHttpErrorMessage();
        erro.setMessage("Não existe esse número de ID");
        erro.setTimestamp(LocalDateTime.now().toString());
        erro.setStatus(200);

        listDetail.forEach(e -> {
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
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody CallBackDetailForm callBackDetailForm) {

        CallBackDetailMock.mockDetail(listDetail);

        listDetail.forEach(e -> {
            if (e.getId().equals(id)) {
                CallBackDetail updateTransaction =  e.getCallBackDetail();
                updateTransaction.setStatus(callBackDetailForm.getStatus());
                e.setCallBackDetail(updateTransaction);
                this.target = e;
            }
        });
        return ResponseEntity.ok().body(target);
    }

    @GetMapping("/atribuir")
    public ResponseEntity<Object> atribuir(@NotNull @RequestParam String user) {
        String userDefault = "felipe.ono";
        if(userDefault.equals(user)){
            return ResponseEntity.ok().body(true);
        } else {
            return ResponseEntity.status(403).body(null);
        }
    }

}
