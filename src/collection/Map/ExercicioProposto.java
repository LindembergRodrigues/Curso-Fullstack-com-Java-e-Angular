package collection.Map;

import java.util.*;

public class ExercicioProposto {
    public static void main(String[] args) {
        Map<String, Integer> populacao = new HashMap<>(){{
           put("PE",9616621);
           put("AL",3351543);
           put("CE",9187103);
           put("RN",3534265);
        }};
        System.out.println("\nOrdem aleatória : ");
        Set<Map.Entry<String, Integer>> pop = populacao.entrySet();
        for (Map.Entry<String, Integer> pop1 : pop){
            System.out.println(pop1.getKey() + " - " + pop1.getValue());
        }

        System.out.println("\nOrdem conforme a adição : ");
        Map<String, Integer> populacao2 = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);

        }};

        pop = populacao2.entrySet();
        for (Map.Entry<String, Integer> pop1 : pop){
            System.out.println(pop1.getKey() + " - " + pop1.getValue());
        }

        System.out.println("\nAdição em ordem alfabética: ");
        Map<String, Integer> populacao3 = new TreeMap<>(populacao);

        pop = populacao3.entrySet();

        for (Map.Entry<String, Integer> pop1 : pop){
            System.out.println(pop1.getKey() + " - " + pop1.getValue());
        }

        System.out.println();
        for (Map.Entry<String, Integer> pop1 : pop){
            if (pop1.getValue().equals(Collections.min(populacao.values()))){
                System.out.println("O estado com a menor população é " + pop1.getKey() + " - " + pop1.getValue());
            }
        }
        System.out.println( );
        for (Map.Entry<String, Integer> pop1 : pop){
           if (pop1.getValue().equals(Collections.max(populacao.values()))){
               System.out.println("O estado com a maior população é " + pop1.getKey() + " - " + pop1.getValue());
           }
        }

        Iterator<Integer> ite = populacao.values().iterator();
        int soma = 0;
        while (ite.hasNext()){
           soma +=  ite.next();

        }
        System.out.println( "A populaçõa total é de " + soma + " enquanto a média é de "+ (soma/populacao.size()));

        pop = populacao.entrySet();
        Iterator<Map.Entry<String, Integer>> it = pop.iterator();
        System.out.println( );
        while(it.hasNext() ){
            if(it.next().getValue()< 4000000){
                it.remove();
            }
        }
        System.out.println(populacao);
    }
}
