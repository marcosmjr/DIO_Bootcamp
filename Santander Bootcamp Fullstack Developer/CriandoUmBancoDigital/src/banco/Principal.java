package banco;


import banco.Operacoes.Movimentacao;
import banco.cadastro.Cadastro;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.Poupanca;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        Poupanca poupanca = new Poupanca();
        Movimentacao movimentacao = new Movimentacao();
        Cadastro correntista = new Cadastro();


        movimentacao.setPoupanca(poupanca);  // O tipo poupanca da classe Movimentacao recebe o
                                             // endereço do objeto popança da classe principal
        movimentacao.setContaCorrente(contaCorrente); // O tipo contaCorrente da classe Movimentacao recebe o
                                                      // endereço do objeto contaCorrente da classe principal

        //Menu de servicos
        int servico;
        do {
            System.out.println("---------------------- Escolha o serviço ------------------------");
            System.out.println("1 - Saque da conta corrente");
            System.out.println("2 - Saque da poupança");
            System.out.println("3 - Deposito em conta corrente");
            System.out.println("4 - Deposito em poupança");
            System.out.println("5 - Transferencia da conta corrente para poupança");
            System.out.println("6 - Transferencia da poupanca para conta corrente");
            System.out.println("7 - Saldo da conta corrente");
            System.out.println("8 - Saldo da poupança");
            System.out.println("9 - Realizar cadastro de novo correntista");
            System.out.println("0 - Encerrar seção");

            servico = -1;
            double valor = 0;
            int statusConta = 0;
            Scanner escolhaServico = new Scanner(System.in);
            Scanner entradaValor = new Scanner(System.in);
            System.out.print("Digite o numero do serviço -> ");

            try {
                servico = escolhaServico.nextInt();
            }catch (InputMismatchException e) {
                servico = 10;
                JOptionPane.showMessageDialog(null, "Valor inválido, digite um número!");
            }

                switch (servico) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Agradecemos a preferência");
                        break;
                    case 1:
                        System.out.print("Digite o valor a sacar da conta corrente -> ");
                        valor = entradaValor.nextDouble();
                        statusConta = movimentacao.saqueContaCorrente(valor);
                        if (statusConta == -1) {
                            JOptionPane.showMessageDialog(null,
                                    correntista.getNome() + "seu saldo é insuficiente\n" +
                                            "você tem diponível: " +
                                    new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Saldo diponível -> " + new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                        break;

                    case 2:
                        System.out.print("Digite o valor a sacar da poupança -> R$ ");
                        valor = entradaValor.nextDouble();
                        statusConta = movimentacao.saqueContaPoupanca(valor);
                        if (statusConta == -1) {
                            JOptionPane.showMessageDialog(null, correntista.getNome() + "seu saldo é insuficiente\n" +
                                    "você tem diponível: " +
                                    new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Saldo diponível -> " + new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                        break;

                    case 3:
                        System.out.print("Digite o valor a depositar na conta corrente -> R$ ");
                        valor = entradaValor.nextDouble();
                        movimentacao.depositoContaCorrente(valor);
                        JOptionPane.showMessageDialog(null, "Saldo diponível -> " + new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                        break;

                    case 4:
                        System.out.print("Digite o valor a depositar na poupança -> R$ ");
                        valor = entradaValor.nextDouble();
                        movimentacao.depositoPoupanca(valor);
                        JOptionPane.showMessageDialog(null, "Saldo diponível -> " + new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                        break;

                    case 5:
                        System.out.print("Digite o valor a transferir da conta corrente para poupança -> R$ ");
                        valor = entradaValor.nextDouble();
                        statusConta = movimentacao.transferenciaContaCorrentePoupanca(valor);
                        if (statusConta == -1) {
                            JOptionPane.showMessageDialog(null, correntista.getNome() + " seu saldo é insuficiente\n" +
                                    "Saldo da conta corrente: " +
                                    new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Saldo diponível na poupança: " + new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                        break;

                    case 6:
                        System.out.print("Digite o valor a transferir da poupança para conta corrente -> R$ ");
                        valor = entradaValor.nextDouble();
                        statusConta = movimentacao.transferenciaContaPoupancaCorrente(valor);
                        if (statusConta == -1) {
                            JOptionPane.showMessageDialog(null, correntista.getNome() + " seu saldo é insuficiente\n" +
                                    "Saldo da conta corrente: " +
                                    new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                            break;
                        }
                        JOptionPane.showMessageDialog(null, "Saldo diponível na conta corrente: " + new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Saldo diponível na conta corrente-> " + new DecimalFormat("R$ #,##0.00").format(contaCorrente.getSaldoCorrente()));
                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Saldo diponível na poupança-> " + new DecimalFormat("R$ #,##0.00").format(poupanca.getSaldoPoupanca()));
                        break;
                    case 9:
                        Cadastro cadastro = new Cadastro();
                        cadastrar(correntista, contaCorrente, poupanca);
                        break;
                    case 10:

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inexistente, escolha novamente");
                }

        } while (servico != 0);

    }

    public static void cadastrar(Cadastro cadastro, ContaCorrente contaCorrente, Poupanca poupanca) {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Digite os dados para cadastro");
        System.out.print("Nome: ");
        cadastro.setNome(entradaUsuario.next());
        System.out.print("CPF: ");
        cadastro.setCpf(entradaUsuario.next());
        System.out.print("Endereço: ");
        cadastro.setEndereco(entradaUsuario.next());
        System.out.print("Telefone: ");
        cadastro.setTelefone(entradaUsuario.next());
        System.out.print("Agencia: ");
        contaCorrente.setAgencia(entradaUsuario.next());
        System.out.print("Número da conta: ");
        contaCorrente.setNumeroConta(entradaUsuario.next());
        System.out.print("Digito da conta corrente: ");
        contaCorrente.setDigito(entradaUsuario.next());
        System.out.print("Digito da poupança: ");
        poupanca.setDigito(entradaUsuario.next());

    }
}
