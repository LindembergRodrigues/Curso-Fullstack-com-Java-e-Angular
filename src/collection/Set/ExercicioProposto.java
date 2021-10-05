package collection.Set;

import java.util.*;

public class ExercicioProposto {
    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>();

        //Adiciona as 7 cores do arco íris
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        // Quantidade de cores que o arco íris tem
        System.out.print("Quantidade de cores - " + arcoIris.size());

        Set<String> AI = new TreeSet<>(arcoIris);
        //exibir em ordem alfabética
        System.out.print("\nEm ordem Alfabética -" + AI);

        List<String> lista = new ArrayList<>(AI);
        Collections.reverse(lista);
        System.out.println("\nOrdem inversa - "+ lista);

        Iterator<String> it = arcoIris.iterator();
        // começam com a letra v
        System.out.print("\nComeça com V - ");
        while (it.hasNext()){
            String plavra = it.next();
            if (plavra.charAt(0) == 'V') {
                System.out.print(plavra+ ", ");
            }
        }

        it = arcoIris.iterator();
        System.out.print("\nRemove as que não começam com V - ");
        while (it.hasNext()){
            String plavra = it.next();
            if (plavra.charAt(0) != 'V') {
                it.remove();
            }
        }

        System.out.println(arcoIris);


    }
}
