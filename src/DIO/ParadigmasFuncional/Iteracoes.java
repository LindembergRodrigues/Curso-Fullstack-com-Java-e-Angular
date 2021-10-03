package DIO.ParadigmasFuncional;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Iteracoes {
    /**
     * Código um pouco confuso
     * dois exemplos de utilização de funções imperativa e funcional
     * @param args
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        Integer [] numerosAleatorio  = new Integer[10];

        for (int i =0 ; i< 10;i++){
            numerosAleatorio[i] = random.nextInt(100);
        }
        
        // exemplo 01
        for (int i : numerosAleatorio) {
            if (i > 50 && i < 90) {
                System.out.println(i);
            }
        }

        // exemplo 2
         List<Integer> numero = Stream.of(numerosAleatorio)
                .filter(num -> num>50 && num<80)
                .collect(toList());

        System.out.println(">> " + numero);

        // imprimir todos os dados do Array
        Stream.of(numerosAleatorio)
                        .forEach(System.out::println);

        // imprimir o numero de cada posição do array
        System.out.println("\n\n imprimindo o valor de cada posição e uma segunda lista contendo o dobro do valor");
        Stream.of(numerosAleatorio).map(num -> " - " + num )
                .forEach(System.out::print);
        System.out.println();
        Stream.of(numerosAleatorio).map(num -> " - " + num *2 )
                .forEach(System.out::print);
        
    }
}
