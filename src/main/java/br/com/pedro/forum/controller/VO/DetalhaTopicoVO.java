package br.com.pedro.forum.controller.VO;

import br.com.pedro.forum.model.StatusTopico;
import br.com.pedro.forum.model.Topico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalhaTopicoVO {

       private Long id;
       private String titulo;
       private String mensagem;
       private LocalDateTime dataCriacao;
       private String nomeAutor;
       private StatusTopico status;
       private List<RespostaVO> resposta;

    public DetalhaTopicoVO(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.resposta = new ArrayList<>();
        this.resposta.addAll(topico.getRespostas().stream().map(RespostaVO::new).collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public StatusTopico getStatus() {
        return status;
    }

    public List<RespostaVO> getResposta() {
        return resposta;
    }
}
