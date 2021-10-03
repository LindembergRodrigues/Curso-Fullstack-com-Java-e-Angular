package collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        //List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,5));
        //List<Integer> lista = Arrays.asList(1,2,3,5); // Exemplo válido, porém com algumas limitações
        //List<Integer> lista = List.of(1,2,3,5); // funciona, porém é imatável

        System.out.println("Lista com 7 notas::");

        Random random = new Random();
        for (int i =0; i<7 ;i++){
            lista.add(Math.pow(random.nextDouble(),5));
        }
        for (int i =0; i<7 ;i++){
            System.out.println(lista.get(i));
        }
    }
}
