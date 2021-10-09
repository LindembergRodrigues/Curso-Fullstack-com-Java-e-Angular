package eda.fila;

import eda.no.No;
import eda.pilha.Pilha;

public class ExemploFila {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6};
        Fila fila = new Fila();

        for(int num : numeros ){
            fila.enqueue(new No(num));
        }
        System.out.println(fila);
        while (!fila.isEmpty()){
            System.out.println(fila.dequeue());
        }

        System.out.println(fila);

    }
}
