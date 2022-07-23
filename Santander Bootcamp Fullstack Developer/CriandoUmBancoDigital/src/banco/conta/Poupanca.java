package banco.conta;

import banco.Operacoes.Movimentacao;

public class Poupanca extends Conta {
    private String digito;
    private Double saldoPoupanca = 0.0;

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public Double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(Double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

}
