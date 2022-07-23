import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {


        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Halking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o Século 21", 432));
        }};

        Set<Map.Entry<String, Livros>> livros = meusLivros.entrySet();
        for (Map.Entry<String, Livros> livro : livros){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Halking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o Século 21", 432));
        }};

        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética dos autores\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);

        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new comparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livros> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem por número de paginas\t--");
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new comparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livros> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

    }
}

class Livros{
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class comparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class comparatorPaginas implements Comparator<Map.Entry<String, Livros>>{

@Override
public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
        }
        }
