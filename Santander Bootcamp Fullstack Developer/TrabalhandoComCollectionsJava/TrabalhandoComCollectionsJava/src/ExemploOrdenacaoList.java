import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
            add(new Gato("Jon", 10, "amarelo"));

        }};
        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("---\tOrdem aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem natural\t---");
        //Implementando Comparable à classe Gato
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //Comparator
        System.out.println("---\tOrdem idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
//        System.out.println("Com Colletions.sort(meusGatos, new ComparatorIdade());");
//        System.out.println(meusGatos);
        meusGatos.sort(new ComparatorIdade());
        System.out.println("Com meusGatos.sort(new ComparatorIdade());");
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
//        System.out.println("Com Colletions.sort(meusGatos, new ComparatorCor());");
//        System.out.println(meusGatos);
        meusGatos.sort(new ComparatorCor());
        System.out.println("Com meusGatos.sort(new ComparatorCor());");
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por nome/cor/idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getIdade().compareTo(g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        int idade = g1.getIdade().compareTo(g2.getIdade());
        return idade;
    }
}

