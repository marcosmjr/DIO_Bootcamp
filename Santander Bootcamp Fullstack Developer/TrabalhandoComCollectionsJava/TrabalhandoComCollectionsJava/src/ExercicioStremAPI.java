import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExercicioStremAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5", "7");

        System.out.println("Imprima todos os numeros desta lista de stream:");

        // Usando Consumer
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // Usando função lambda
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // Usando reference Method
        //numerosAleatorios.stream().forEach(System.out::println);

        // Usando o metodo forEath da interface List com Reference Mothod
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // Colocando tudo dentro de um Set<String>
        System.out.println("Colocando tudo dentro de um Set<String>");
        Set<String> collect = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        collect.forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista:");
        //Usando Predicate
        System.out.println("Usando Predicate");
        List<Integer> collect1 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0 && integer > 2;
                    }
                })
                .collect(Collectors.toList());

        collect1.forEach(System.out::println);


        System.out.println("Usando função lambda");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .forEach(System.out::println);

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares:");
        List<Integer> numerosAleatorios2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*numerosAleatorios2.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        });*/

        numerosAleatorios2.removeIf(valor -> valor % 2 != 0 );

        numerosAleatorios2.forEach(System.out::println);

    }
}
