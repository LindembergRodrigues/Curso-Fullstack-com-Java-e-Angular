package eda.pilha;

import eda.no.No;

public class ExemploPilha {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6};
        Pilha pilha = new Pilha();

        for(int num : numeros ){
            pilha.push(new No(num));
        }
        System.out.println(pilha);
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }

        System.out.println(pilha);
    }
}

