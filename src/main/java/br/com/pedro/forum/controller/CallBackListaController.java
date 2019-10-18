package br.com.pedro.forum.controller;


import br.com.pedro.forum.model.CallBackLista;
import br.com.pedro.forum.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/callback")
public class CallBackListaController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping()
     //public Page<CallBackLista> lista(@RequestParam(required = false) String nomeCurso, @PageableDefault(sort="id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao)
        public List lista(@RequestParam int pagina, @RequestParam int qtd) {

        Pageable paginacao = PageRequest.of(pagina, qtd);

        List<CallBackLista> lista = new ArrayList();
        CallBackLista list1 = new CallBackLista((long)1, "Callback por Suspeita de Fraude", "LARISSA LOPES", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list2 = new CallBackLista((long)2,"Callback de Segurança", "MARCELO ALVES SILVA", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list3 = new CallBackLista((long)3, "Callback por Suspeita de Fraude", "AGATHA ELISA ISIS DA ROSA", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list4 = new CallBackLista((long)4, "Callback de Segurança", "MANOEL ISAAC BENEDITO BARROS", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list5 = new CallBackLista((long)5, "Callback de Segurança", "AUGUSTO THOMAS CESAR CARDOSO", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list6 = new CallBackLista((long)6, "Callback por Suspeita de Fraude", "JOÃO DE OLIVEIRA", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list7 = new CallBackLista((long)7, "Callback por Suspeita de Fraude", "ALEX CRUZ", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list8 = new CallBackLista((long)8, "Callback de Segurança", "CARLOS MOURA", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list9 = new CallBackLista((long)9, "Callback por Suspeita de Fraude", "RAQUEL CORTÊS", "56225898487", "pedente",  2.500, "aberto");
        CallBackLista list10 = new CallBackLista((long)10, "Callback por Suspeita de Fraude", "LUIZ GAROFALO BODO", "56225898487", "pedente",  2.500, "aberto");
        lista.add(list1);
        lista.add(list2);
        lista.add(list3);
        lista.add(list4);
        lista.add(list5);
        lista.add(list6);
        lista.add(list7);
        lista.add(list8);
        lista.add(list9);
        lista.add(list10);



        return lista.subList(pagina, qtd);
    }
}






