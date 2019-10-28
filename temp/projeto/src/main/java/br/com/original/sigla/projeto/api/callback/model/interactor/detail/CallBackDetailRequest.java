<<<<<<< HEAD
package br.com.original.sigla.projeto.api.callback.model.interactor.detail;

import br.com.original.sigla.projeto.domain.callback.model.CallBackDetail;
=======
package br.com.pedro.trampo.api.callback.model.interactor.detail;

import br.com.pedro.trampo.domain.callback.model.CallBackDetail;
>>>>>>> 1199a2162e8f2d0556ea73954866e1e9ec5674c5

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
