import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //Forma de implementar List
        List<Double> notas0 = new ArrayList<>(Arrays.asList(7d, 5.5, 9.3, 5d, 7d, 0d, 3.6));

        List<Double> notas00 = Arrays.asList(7d, 5.5, 9.3, 5d, 7d, 0d, 3.6); // observar que não possui new
        //Essa forma é limitada, nao se pode adicionar ou retirar elementos a ela.

        List<Double> notas000 = List.of(7d, 5.5, 9.3, 5d, 7d, 0d, 3.6); //Essa forma a lista é imutável,
        //nao se pode adicionar ou retirar elementos a ela.

        //Forma convencional
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        //Utilizando o toString
        System.out.println(notas);

        //encontrando o indice de um valor em particular com indexOf
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //Usamos add(indice, valor) para adicionar um elemento em uma posição
        // escolhida sem remover nenhum elemento da lista
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        //Para substituir um valor na lista usamos o método
        //set(index, valor)
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // o notas.indexOf(5d) retorna o indice do valor 5.0
        System.out.println(notas);

        //verifica se o valor esta na lista, contains(Object o) retorna um booleano
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        // imprimir com foreach
        for(Double nota : notas){
            System.out.println(nota);
        }

        //método get passamos a posição e temos como retorno o elemento
        System.out.println("Exiba a terceira nota adicionada: "  + notas.get(2));
        System.out.println(notas);

        //Para exibir a menor nota usamos a class Collections.min(Collection), a List é uma Collection
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Para achar o maior valor, tambem usamos a classe Collections
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //As classe Double, Integer, String implementam uma interface Comparable

        //Usando o iterator
        Iterator<Double> nota = notas.iterator();
        Double soma = 0d;
        while (nota.hasNext()){
            soma += nota.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("exiba a média da notas: " + soma/notas.size());

        //para remover um item conhecido utilizamos o método remove(Objeto o) ou remove(indice)
        System.out.println("Remover a nota 0: ");
        notas.remove(0d); // se não ficar explicito que colocamos o objeto 0d ou 0.0 ele vai remover
                            // o ítem da posição 0, pois vai interpretar que colocamos um inteiro
                            // e um inteiro indica o indice da lista
        System.out.println(notas);

        //Removendo a nota da posição 0
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0); // Notar que desta vez foi colocado um inteiro, indicando o indice 0 da lista
        System.out.println(notas);

        //Remover as notas menores que 7
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double valor = iterator.next();
            if(valor < 7) iterator.remove();
        }
        System.out.println(notas);

        //Outra forma de iterar sem usar iterator e loop while, usando o método removeIf(espressão lambda)
        notas.removeIf(valor -> valor < 9.3);
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println(notas.isEmpty());

        //Exercicio, utilizando LinkedList

        //Preenchedo a lista notas novamente
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println("Notas: " + notas);

        System.out.println("Crie uma lista chamada notas2");

        List<Double> notas2 = new LinkedList<>(notas);
        System.out.println("LinkedList notas2: " + notas2);

        System.out.println("Motra o primeira nota da lista sem remover-la: " + notas2.get(0));

        System.out.println("Motra a primeira nota da lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);

    }
}
