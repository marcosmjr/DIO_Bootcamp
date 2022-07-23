package banco.conta;

import banco.Operacoes.Movimentacao;

public class ContaCorrente extends Conta {
    private String digito;
    private Double saldoCorrente = 0.0;

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public Double getSaldoCorrente() {
        return saldoCorrente;
    }

    public void setSaldoCorrente(Double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }



}
