package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "lorem.txt";
        try{
            imprimirArquivoNoConsole(nomeArquivo);

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

        System.out.println("Programa continuando ...");

    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

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
    }


}
