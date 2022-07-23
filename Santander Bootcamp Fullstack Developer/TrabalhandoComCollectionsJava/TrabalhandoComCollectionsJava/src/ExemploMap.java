import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        //Formas de inicializar o Map
        Map map = new HashMap<>(); // Antes do java5
        Map<String, Double> map1 = new HashMap<>();
        Map<String, Double> map2 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Subistitua o consumo do gol por 15,2 km/l:");
        //carrosPopulares.replace("gol", 16.1);
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo uno está no dicionário: " + carrosPopulares.containsKey("uno"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Não existe um indice na interface Map para podermos fazer uma busca pela posição

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();// Retorna um Set
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros:");
        //O método values retorna uma Collection
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        /*for (Double value : carrosPopulares.values()) {
            System.out.println(value);
        }*/

        System.out.println("Exiba o moelo mais econômico e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo");
        Double consumMenosEficiente = Collections.min(carrosPopulares.values());
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumMenosEficiente)){
                System.out.println("modelo menos eficiente: " + entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Exiba a soma dos consumo:");
//        Collection<Double> consumo = carrosPopulares.values();
//        Iterator<Double> iterator = consumo.iterator();
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);

        System.out.println("Exiba a média dos consumo deste dicionária de carros:" + soma/carrosPopulares.size());

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l:");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados:");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo:");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);

        System.out.println(carrosPopulares2);

        System.out.println("Apagar o dicionário de carros:");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());


    }
}
