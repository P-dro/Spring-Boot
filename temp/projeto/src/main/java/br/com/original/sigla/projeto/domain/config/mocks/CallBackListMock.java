package br.com.original.sigla.projeto.domain.config.mocks;

import br.com.original.sigla.projeto.api.callback.model.CallBackRequest;
import br.com.original.sigla.projeto.domain.callback.interactor.list.CallBackList;

import java.time.LocalDateTime;

public class CallBackListMock {

    java.util.List list;

    public java.util.List listMock() {
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
            list.add(request);
        }

        System.out.println(list.size());
        return list;
    }
}
