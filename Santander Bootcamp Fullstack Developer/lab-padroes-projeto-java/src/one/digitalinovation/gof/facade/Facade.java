package one.digitalinovation.gof.facade;

import one.digitalinovation.gof.subsistema1.crm.CrmService;
import one.digitalinovation.gof.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome , String cep) {

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep , cidade , estado);
    }
}
