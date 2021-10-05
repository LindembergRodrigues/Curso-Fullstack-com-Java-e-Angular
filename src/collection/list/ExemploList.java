package collection.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        //List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,5));
        //List<Integer> lista = Arrays.asList(1,2,3,5); // Exemplo válido, porém com algumas limitações
        //List<Integer> lista = List.of(1,2,3,5); // funciona, porém é imatável

        System.out.println("Lista com 7 notas::");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            Double num = in.nextDouble();
            lista.add(num);

        }
        System.out.println("Posição da nota 5.00 é " + lista.indexOf(5.0));

        System.out.println("Pos. 5 > " + lista.get(4));
        System.out.println("Inserir na posição 5 o nº 10");
        lista.add(4, 10.0);

        System.out.println("O menor numero é o " + Collections.min(lista));

        System.out.println("O maior numero é o " + Collections.max(lista));
        System.out.println();

        Iterator<Double> interador = lista.iterator();
        Double soma = 0d;
        while (interador.hasNext()) {
            soma += interador.next();

        }
        System.out.println("A soma de todos é " + soma);

        System.out.println("A média é " + (soma / lista.size()));

        System.out.println();
        System.out.println(lista);
        System.out.println("Remover a ultima posição ");
        System.out.println(lista.remove(lista.size()-1));
        System.out.println(lista);

        System.out.println("\nRemove as notas menores que 5");

        interador = lista.iterator();
        while(interador.hasNext()){
            Double n = interador.next();
            if ( n < 5.0){
                interador.remove();
            }
        }
        System.out.println(lista);
    }
}
