package br.com.pedro.forum.controller;

import br.com.pedro.forum.config.validacao.BasicHttpErrorMessage;
import br.com.pedro.forum.model.CallBackLista;
import br.com.pedro.forum.model.ControleJSONPag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/callback")
public class CallBackListaController {

    @GetMapping()
    public ResponseEntity<Object> lista(@RequestParam(required = false) Integer pagina, @RequestParam(required = false) Integer qtd) throws BasicHttpErrorMessage {

        List<CallBackLista> lista = new ArrayList();

        for (int i = 0; i < 50; i++) {
            CallBackLista list = new CallBackLista((long)i, "Callback por Suspeita de Fraude" + i, "LARISSA LOPES", "56225898487", "pedente",  2.500, "aberto");
            lista.add(list);
        }

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
        double qtdDouble = qtd;
        double tamanho = Math.ceil(lista.size()/qtdDouble);
        int fromIndex = (int) ((pagina - 1) * qtd);

        if(lista == null || lista.size() < fromIndex){
            return (ResponseEntity<Object>) Collections.emptyList();
        }

        ControleJSONPag paginacao = new ControleJSONPag();
        paginacao.setQuantidadePaginas((int) tamanho);
        paginacao.setQuantidadeRegistros(lista.size());
        paginacao.setListaCallbacks(lista, fromIndex, (int) qtd);
        return ResponseEntity.ok().body(paginacao);
    }
}






