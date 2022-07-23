package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException1 {
    public static void main(String[] args) {
        String nomeArquivo = "lorem.txt";

        imprimirArquivoNoConsole(nomeArquivo);

        System.out.println("Programa continuando ...");
    }

    public static void imprimirArquivoNoConsole(String nomeArquivo){
        File file = new File(nomeArquivo);

        try{
            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while(line != null);
            bw.flush();
            br.close();

        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Reviso o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
            // e.printStackTrace();
        }finally {
            System.out.println("Chegou no finally!");
        }

    }


}
