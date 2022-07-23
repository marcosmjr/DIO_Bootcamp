package banco.conta;

import banco.Operacoes.Movimentacao;

public class Conta {
    private String agencia = " ";
    private String numeroConta = " ";

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

}
