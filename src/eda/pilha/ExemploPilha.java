package eda.pilha;

import eda.no.No;

public class ExemploPilha {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,6,5,4};
        Pilha pilha = new Pilha();

        for(int num : numeros ){
            pilha.push(num);
        }

        System.out.println(pilha);
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }


    }
}

