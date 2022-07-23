package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLoop = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;
            } catch (NumberFormatException e) {
                //throw new RuntimeException(e); // mostra o finally, mostra a exception a para o programa
                e.printStackTrace(); // mostra a exception, mostra o finally e continua o programa
                JOptionPane.showMessageDialog(null, "Entrada Invalida, informe um número inteiro " + e.getMessage());

            } catch (ArithmeticException e) {
                e.printStackTrace(); // mostra a exception, mostra o finally e continua o programa
                JOptionPane.showMessageDialog(null, "Impossivel dividir um numeor por 0. ");

            } finally {
                System.out.println("Chegou no finally!");
            }
        }while (continueLoop);
        System.out.println("O codico continua...");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
