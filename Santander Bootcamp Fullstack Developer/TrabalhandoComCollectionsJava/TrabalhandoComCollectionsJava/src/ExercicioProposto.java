import java.util.*;
import java.util.function.Function;

public class ExercicioProposto {
    public static void main(String[] args) {

        System.out.println( "**** Ordem Aleatoria ****");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Mini", 876));
            put(2, new Contato("Felix", 654));
            put(3, new Contato("Pluto", 777));
            put(4, new Contato("Pateta", 123));
        }};

        for (Map.Entry<Integer, Contato> contato : agenda.entrySet()){
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println( "**** Ordem de inserção ****");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Mini", 876));
            put(2, new Contato("Felix", 654));
            put(3, new Contato("Pluto", 777));
            put(4, new Contato("Pateta", 123));
        }};

        Set<Map.Entry<Integer, Contato>> agendado = agenda1.entrySet();
        for (Map.Entry<Integer, Contato> contato1 : agendado){
            System.out.println(contato1.getKey() + " - " + contato1.getValue().getNome() + " - " + contato1.getValue().getNumero());
        }

        System.out.println("**** Ordenar por id ****");
        Map<Integer, Contato> agendaId = new TreeMap<>(agenda1);
        for (Map.Entry<Integer, Contato> contatoId : agendaId.entrySet()){
            System.out.println(contatoId.getKey() + " - " + contatoId.getValue().getNome() + " - " + contatoId.getValue().getNumero());
        }

        System.out.println("**** Ordenar pelo numero de telefone ****");
        Set<Map.Entry<Integer, Contato>> agenda2 = new TreeSet<>(new ComparatorNumeroTelefone());
        agenda2.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato2 : agenda2){
            System.out.println(contato2.getKey() + " - " + contato2.getValue().getNome() + " - " + contato2.getValue().getNumero());

        }

        System.out.println("**** Ordenar por nome ****");
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new ComparatorNome());
        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato3 : agenda3){
            System.out.println(contato3.getKey() + " - " + contato3.getValue().getNome() + " - " + contato3.getValue().getNumero());

        }

    }
}
class Contato{
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
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
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}

class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
        return contato1.getValue().getNumero().compareTo(contato2.getValue().getNumero());
    }
}

class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
        return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
    }
}