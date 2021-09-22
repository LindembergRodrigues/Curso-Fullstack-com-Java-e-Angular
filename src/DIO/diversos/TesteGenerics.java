package DIO.diversos;

import java.util.EmptyStackException;

/**
 * testa a classe Genericss e gera um erro, ocasionado por um loop infinito
 *
 */
public class TesteGenerics {
    public static void main(String[] args) {
       int [] inteiros = {1,2,3,4,5};
       double [] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};

       Genericss<Integer> inteiros2 = new Genericss<>();
       Genericss<Double> doubles2 = new Genericss<>(10);

       testaPushInteger(inteiros2,inteiros);
       testaPopInteger(inteiros2);
       testePushDouble(doubles2,doubles);
       testePopDouble(doubles2);
    }

    /**
     * teste a adição de elementos no Arraylist inteiro2
     * @param lista a referência de inteiro2
     * @param inteiros uma lista de inteiros que terá seua dados inseridos em inteiro2
     */
    public static void testaPushInteger(Genericss<Integer> lista, int[] inteiros){
        for ( int num : inteiros){
            System.out.printf("Será inserido na lista de genericos com Inteiros o nº %d\n",num);
            lista.push(num);
        }
    }

    /**
     * testa remoçaão dos elementos de inteiros2 e ocasiona o loop
     * @param lista referencia do arraylist inteiro2
     */
    public static void testaPopInteger(Genericss<Integer> lista){
        try {
            while(true){
                System.out.printf("Foi removido o numero <%d>\n", lista.pop());
            }

        }catch( EmptyStackException e ){
            System.err.println();
            e.printStackTrace();
        }
    }

    /**
     * testa a adição de elementos no Arraylist double2
     * @param lista referência a double2
     * @param doubles lista com dados a serem edicionados a doubles2
     */
    public static void testePushDouble(Genericss<Double> lista, double []doubles){
        for ( double num: doubles){
            System.out.printf("Será inserido na lista de genericos com Double o nº %.1f\n",num);
            lista.push(num);
        }
    }

    /**
     * teste a remoção dos elementos de doubles2 e entra no loop infinito
     * @param lista referência de doubles2
     */
    public static void testePopDouble(Genericss<Double> lista){
        try{
            while(true) {
                System.out.printf("Foi removido o numero <%.1f>\n", lista.pop());
            }
         }catch (EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }
}
