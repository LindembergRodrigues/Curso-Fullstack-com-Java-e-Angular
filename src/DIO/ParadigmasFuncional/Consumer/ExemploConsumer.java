package DIO.ParadigmasFuncional.Consumer;

import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        //Consumer<String> entrada = System.out::println;
        Consumer<String> entrada = frase -> System.out.println(frase);
        entrada.accept("Teste 01");

        // segundo exemplo
        Consumer<String> in = System.out::println;
        entrada.accept("Teste 02");
    }
}