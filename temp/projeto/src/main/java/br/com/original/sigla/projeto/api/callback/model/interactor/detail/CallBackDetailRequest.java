package br.com.pedro.trampo.api.callback.model.interactor.detail;

import br.com.pedro.trampo.domain.callback.model.CallBackDetail;

public class CallBackDetailRequest {

    private Long id;
    private CallBackDetail callBackDetail;


    public CallBackDetailRequest(CallBackDetail callBackDetail) {
        this.callBackDetail = callBackDetail;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CallBackDetail getCallBackDetail() {
        return callBackDetail;
    }

    public void setCallBackDetail(CallBackDetail callBackDetail) {
        this.callBackDetail = callBackDetail;
    }
}
