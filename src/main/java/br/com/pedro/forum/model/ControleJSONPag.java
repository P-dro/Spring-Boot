package br.com.pedro.forum.model;

import java.util.ArrayList;
import java.util.List;

public class ControleJSONPag {
    private int quantidadePaginas;
    private int quantidadeRegistros;
    private List listaCallbacks;


    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public int getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setQuantidadeRegistros(int quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public void setListaCallbacks(List listaCallbacks, Integer fromIndex, Integer qtd) {
        this.listaCallbacks = listaCallbacks.subList(fromIndex, Math.min(fromIndex + qtd, listaCallbacks.size()));
    }

    public List getListaCallbacks() {
        return listaCallbacks;
    }
}

