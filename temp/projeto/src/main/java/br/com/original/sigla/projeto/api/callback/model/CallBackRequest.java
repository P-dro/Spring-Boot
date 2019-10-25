package br.com.original.sigla.projeto.api.callback.model;

import br.com.original.sigla.projeto.domain.callback.interactor.list.CallBackList;

public class CallBackRequest {
    private Long id;
    private CallBackList callBackList;
    private java.util.List listaCallbacks;


    public CallBackRequest(CallBackList callBackList) {
        this.callBackList = callBackList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CallBackList getCallBackLista() {
        return callBackList;
    }

    public void setCallBackLista(CallBackList callBackList) {
        this.callBackList = callBackList;
    }


}
