package banco.Operacoes;

import banco.conta.ContaCorrente;
import banco.conta.Poupanca;

public class Movimentacao {

    private ContaCorrente contaCorrente;
    private Poupanca poupanca;

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Poupanca getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(Poupanca poupanca) {
        this.poupanca = poupanca;
    }

    public int transferenciaContaCorrentePoupanca(Double valorTransferir) {
        Double saldoContaCorrente = contaCorrente.getSaldoCorrente();
        if (saldoContaCorrente >= 0 && (saldoContaCorrente - valorTransferir) >= 0) {
            contaCorrente.setSaldoCorrente(saldoContaCorrente - valorTransferir);
            poupanca.setSaldoPoupanca(poupanca.getSaldoPoupanca() + valorTransferir);
            return 0;
        }
        return -1;

    }

    public int transferenciaContaPoupancaCorrente(Double valorTransferir) {
        Double saldoPoupanca = poupanca.getSaldoPoupanca();
        if (saldoPoupanca >= 0 && (saldoPoupanca - valorTransferir) >= 0) {
            contaCorrente.setSaldoCorrente(contaCorrente.getSaldoCorrente() + valorTransferir);
            poupanca.setSaldoPoupanca(saldoPoupanca - valorTransferir);
            return 0;
        }
        return -1;
    }

    public int saqueContaCorrente(Double valorSaque) {
        Double saldoContaCorrente = contaCorrente.getSaldoCorrente();
        if (saldoContaCorrente >= 0 && (saldoContaCorrente - valorSaque) >= 0) {
            contaCorrente.setSaldoCorrente(saldoContaCorrente - valorSaque);
            return 0;
        }
        return -1;
    }

    public int saqueContaPoupanca(Double valorSaque){
        Double saldoPoupanca = poupanca.getSaldoPoupanca();
        if(saldoPoupanca >= 0 && (saldoPoupanca - valorSaque) >= 0) {
            poupanca.setSaldoPoupanca(saldoPoupanca - valorSaque);
            return 0;
        }
        return -1;

    }

    public void depositoContaCorrente(Double valordeposito){
        contaCorrente.setSaldoCorrente(contaCorrente.getSaldoCorrente() + valordeposito);
    }

    public void depositoPoupanca(Double valordeposito){
        poupanca.setSaldoPoupanca(poupanca.getSaldoPoupanca() + valordeposito);
    }



}
