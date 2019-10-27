package br.com.pedro.trampo.domain.config.mocks;

import br.com.pedro.trampo.api.callback.model.CallBackRequest;
import br.com.pedro.trampo.domain.callback.interactor.list.CallBackList;

import java.time.LocalDateTime;
import java.util.List;

public abstract class CallBackListMock {

    public static void listaMock(List lista) {
        CallBackList callBackList = new CallBackList();
        callBackList.setClassification("Callback de Segurança");
        callBackList.getSourceDateTime();
        callBackList.setStatus("pendente");
        callBackList.setType("TED");

        callBackList.setCreationDate(LocalDateTime.now());
        callBackList.setScheduleDate(LocalDateTime.now());
        callBackList.setValue((long) 2500);

        callBackList.setIdentification("56225898487");
        callBackList.setName("Silvano Pereira");

        for (int i = 0; i < 50; i++) {
            CallBackRequest request = new CallBackRequest(callBackList);
            request.setId((long) i);
            lista.add(request);
        }
    }
}
