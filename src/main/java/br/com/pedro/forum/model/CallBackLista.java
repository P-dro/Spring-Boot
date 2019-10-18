package br.com.pedro.forum.model;

import java.time.LocalDateTime;

public class CallBackLista {

    private Long id;
    private LocalDateTime horaCriacao;
    private String classificacao;
    private String nomeCliente;
    private String cpf;
    private String transacTipo;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataAgendamento;
    private double valor;
    private String status;

    public CallBackLista () {

    }
    public CallBackLista (Long id, String classificacao, String nomeCliente, String cpf, String transacTipo,  double valor, String status ) {
        this.id = id;
        this.horaCriacao = LocalDateTime.now();
        this.classificacao = classificacao;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.transacTipo = transacTipo;
        this.dataAbertura = LocalDateTime.now();
        this.dataAgendamento = LocalDateTime.now();
        this.valor = valor;
        this.status = status;

    }

    public Long getId() {return id;}

    public LocalDateTime getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(LocalDateTime horaCriacao) {
        this.horaCriacao = horaCriacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTransacTipo() {
        return transacTipo;
    }

    public void setTransacTipo(String transacTipo) {
        this.transacTipo = transacTipo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
