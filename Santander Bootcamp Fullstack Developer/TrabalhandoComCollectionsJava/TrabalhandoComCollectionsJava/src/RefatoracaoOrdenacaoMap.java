import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println( "**** Ordem Aleatoria ****");
        Map<Integer, Contato1> agenda = new HashMap<>(){{
            put(1, new Contato1("Mini", 876));
            put(2, new Contato1("Felix", 654));
            put(3, new Contato1("Pluto", 777));
            put(4, new Contato1("Pateta", 123));
        }};

        for (Map.Entry<Integer, Contato1> contato : agenda.entrySet()){
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println( "**** Ordem de inserção ****");
        Map<Integer, Contato1> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato1("Mini", 876));
            put(2, new Contato1("Felix", 654));
            put(3, new Contato1("Pluto", 777));
            put(4, new Contato1("Pateta", 123));
        }};

        Set<Map.Entry<Integer, Contato1>> agendado = agenda1.entrySet();
        for (Map.Entry<Integer, Contato1> contato1 : agendado){
            System.out.println(contato1.getKey() + " - " + contato1.getValue().getNome() + " - " + contato1.getValue().getNumero());
        }

        System.out.println("**** Ordenar por id ****");
        Map<Integer, Contato1> agendaId = new TreeMap<>(agenda1);
        for (Map.Entry<Integer, Contato1> contatoId : agendaId.entrySet()){
            System.out.println(contatoId.getKey() + " - " + contatoId.getValue().getNome() + " - " + contatoId.getValue().getNumero());
        }

        System.out.println("**** Ordenar pelo numero de telefone ****");
        // Comparando com classe anônima
       /* Set<Map.Entry<Integer, Contato1>> agenda2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato1>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato1> cont1, Map.Entry<Integer, Contato1> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/
        //Comparando com Functional Interface
       /* Set<Map.Entry<Integer, Contato1>> agenda2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer,Contato1>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato1> cont) {
                return cont.getValue().getNumero();
            }
        }));*/

        //Comparando usando função lambda
        Set<Map.Entry<Integer, Contato1>> agenda2 = new TreeSet<>(Comparator.comparing(cont->cont.getValue().getNumero()));

        agenda2.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato1> contato2 : agenda2){
            System.out.println(contato2.getKey() + " - " + contato2.getValue().getNome() + " - " + contato2.getValue().getNumero());

        }

        System.out.println("**** Ordenar por nome ****");
        //Set<Map.Entry<Integer, Contato1>> agenda3 = new TreeSet<>(new ComparatorNome1());

        // Comparando usaqndo classe anônima
       /* Set<Map.Entry<Integer, Contato1>> agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato1>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato1> contato1, Map.Entry<Integer, Contato1> contato2) {
                return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
            }
        });*/

        // Comparando usando Functional Interface
        /*Set<Map.Entry<Integer, Contato1>> agenda3 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer,Contato1>, String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato1> contato) {
                return contato.getValue().getNome();
            }
        }));*/

        // Comparando utilizando a função lambda
        Set<Map.Entry<Integer, Contato1>> agenda3 = new TreeSet<>(Comparator.comparing(contato -> contato.getValue().getNome()));
        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato1> contato3 : agenda3){
            System.out.println(contato3.getKey() + " - " + contato3.getValue().getNome() + " - " + contato3.getValue().getNumero());

        }

    }
}
class Contato1{
    private String nome;
    private Integer numero;

    public Contato1(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato1 contato = (Contato1) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}

/*class ComparatorNumeroTelefone1 implements Comparator<Map.Entry<Integer, Contato1>> {

    @Override
    public int compare(Map.Entry<Integer, Contato1> contato1, Map.Entry<Integer, Contato1> contato2) {
        return contato1.getValue().getNumero().compareTo(contato2.getValue().getNumero());
    }
}*/

/*class ComparatorNome1 implements Comparator<Map.Entry<Integer, Contato1>> {

    @Override
    public int compare(Map.Entry<Integer, Contato1> contato1, Map.Entry<Integer, Contato1> contato2) {
        return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
    }
}*/