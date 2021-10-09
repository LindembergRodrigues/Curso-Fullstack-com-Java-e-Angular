package dio.diversos;

import java.util.EmptyStackException;

/**
 * testa a classe Genericss e gera um erro, ocasionado por um loop infinito
 *
 */
public class TesteGenerics {
    public static void main(String[] args) {
       Integer [] inteiros = {1,2,3,4,5};
       Double [] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};

       Genericss<Integer> inteiros2 = new Genericss<>();
       Genericss<Double> doubles2 = new Genericss<>(10);

       testaPush(inteiros2,inteiros);
       testaPop(inteiros2);
       testaPush(doubles2,doubles);
       testaPop(doubles2);

    }

    /**
     * teste a adição de elementos no Arraylist inteiro2
     * @param lista a referência de inteiro2
     * @param inteiros uma lista de inteiros que terá seua dados inseridos em inteiro2
     */
    public static <T> void testaPush(Genericss<T>  lista, T[] inteiros){
        for ( T num : inteiros){
            System.out.printf("Será inserido na lista de genericos com Inteiros o nº %s\n",num);
            lista.push(num);
        }
    }

    /**
     * testa remoçaão dos elementos de inteiros2 e ocasiona o loop
     * @param lista referencia do arraylist inteiro2
     */
    public static <T> void testaPop(Genericss<T> lista){
        try {
            while(true){
                System.out.printf("Foi removido o numero <%s>\n", lista.pop());
            }

        }catch( EmptyStackException e ){
            System.err.println();
            e.printStackTrace();
        }
    }

}
