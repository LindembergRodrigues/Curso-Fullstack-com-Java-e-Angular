package collection.Set;

import java.util.*;

public class exSet {
    public static void main(String[] args) {
        //criar 7 notas em um set
        Set<Double> notas = new HashSet<>(Arrays.asList(20.0,12d,70.1,30d,90.5,96.54,73.3,30d));

        System.out.println("Coleção com 7 notas "+ notas.toString());

        //naõ podemos adionar em uma posição tão como capturar de uma posição
        System.out.println("A nota 50 esta contida no Set" + notas.contains(50.0));

        System.out.println("A nota 30 esta contida no Set" + notas.contains(30.0));

        System.out.println("A maior nota é " + Collections.max(notas));

        System.out.println("A menor nota é " + Collections.min(notas));

        Iterator<Double> interador = notas.iterator();

        Double soma = 0.0;
        while (interador.hasNext()){
            soma += interador.next();
        }
        System.out.println( "A soma é "+soma );

        System.out.println( "Remove o valor 30.0");
        System.out.println(notas);
        notas.remove(30d);
        System.out.println(notas);

        System.out.println("Remove as menores que 70");
        Iterator<Double> interador2 = notas.iterator();
        while(interador2.hasNext()){
            if (interador2.next() < 70d){
                interador2.remove();
                System.out.println(notas);
            }
        }

        System.out.println("Mostra a ordem conforme inserido");

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(10.0);
        notas2.add(50.0);
        notas2.add(35.0);
        notas2.add(25.0);
        notas2.add(19.0);
        notas2.add(47.0);
        notas2.add(66.0);
        notas2.add(10.0);
        System.out.println(notas2);


        // ordenar em ordem crescente, a Colletion Treeset ordena pela ordem natural
        Set<Double> notas3 = new TreeSet<>(notas2);

        System.out.println("\nEm ordem crescente " + notas3+"\n");

        System.out.println("Limpa notas " + notas2);
        notas2.clear();
        System.out.println(notas2.isEmpty());

    }
}
