package br.com.pedro.forum.controller.VO;

import br.com.pedro.forum.model.CallBackLista;
import br.com.pedro.forum.model.Resposta;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CallBackListaVO {

    private LocalDateTime horaCriacao;
    private String classificacao;
    private String nomeCliente;
    private String cpf;
    private String transacTipo;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataAgendamento;
    private double valor;
    private String status;


    public CallBackListaVO(CallBackLista callBackLista) {
        this.horaCriacao = callBackLista.getHoraCriacao();
        this.classificacao = callBackLista.getClassificacao();
        this.nomeCliente = callBackLista.getNomeCliente();
        this.cpf = callBackLista.getCpf();
        this.transacTipo = callBackLista.getTransacTipo();
        this.dataAbertura = callBackLista.getDataAbertura();
        this.dataAgendamento = callBackLista.getDataAgendamento();
        this.valor = callBackLista.getValor();
        this.status = callBackLista.getStatus();

    }

    public LocalDateTime getHoraCriacao() {
        return horaCriacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTransacTipo() {
        return transacTipo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    List<CallBackListaVO> listaCallBack = new ArrayList<>();


    public static Page<CallBackListaVO> converterCallBack(Page<CallBackLista> callback) {

        return callback.map(CallBackListaVO::new);
    }


}
