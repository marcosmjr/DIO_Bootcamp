import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        //Formas de inicializar o Set
        Set notas0 = new HashSet();//Antes do Java 5
        HashSet<Double> notas00 = new HashSet<>();
        Set<Double> notas000 = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        Set<Double> notas0000 = Set.of(8.5, 9.3, 5.0, 7d, 0.0, 3.6); //Valor duplicado causa erro

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7d, 0.0, 3.6));
        System.out.println(notas);

        //Não é possível fazer busca por posição usando a interface Set ou outro trabalho que exija posição
        // não existe indice
        // Não é possivel substituir valores

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exibir a soma dos valores:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exibir a média das notas: " + soma/notas.size());

        System.out.println("remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("removas as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double nota = iterator1.next();
            if (nota < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na posição que foram informadas:");
        //Não é possível usando HashSet, temos que usar LikedHashSet
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7d, 0.0, 3.6));
        //Os valores da lista poderiam ser adicionado um po0r um usando add(valor)
        //Exemplo notas.add(7.0)
        System.out.println(notas1);

        System.out.println("Exiba todas as notas no ordem crescente:");
        //Para isso é preciso usar a implementação TreeSet
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto:");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto notas1 está vazio: " + notas1.isEmpty());
        System.out.println("Confira se o conjunto notas2 está vazio: " + notas2.isEmpty());

    }
}
