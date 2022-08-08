package one.digitalinovation.gof.subsistema1.crm;

import one.digitalinovation.gof.facade.Facade;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
