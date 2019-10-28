package br.com.pedro.trampo.api.callback.model;

import java.util.List;

public class CallBackResponse {

    private int numberPage;
    private int numberRecords;
    private List callBackList;


    public int getNumberPage() {
        return numberPage;
    }

    public int getNumberRecords() {
        return numberRecords;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public void setNumberRecords(int numberRecords) {
        this.numberRecords = numberRecords;
    }

    public void setListaCallbacks(List listaCallbacks, Integer fromIndex, Integer qtd) {
        this.callBackList = listaCallbacks.subList(fromIndex, Math.min(fromIndex + qtd, listaCallbacks.size()));
    }

    public List getCallBackList() {
        return callBackList;
    }
}

