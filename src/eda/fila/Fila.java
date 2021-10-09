package eda.fila;

import eda.no.No;

public class Fila {

    private No no;
    Fila(){
        no = null;
    }

    public void enqueue(No dados){
        dados.setProximoNo((no));
        no = dados;

    }

    public No dequeue(){
        No auxNo = first();
        while  (true){
            if (no.getProximoNo() == null) {
                no = no.getProximoNo();
                no.setProximoNo(null);

            }else {
                break;
            }
        }
        return auxNo;

    }

    public No first (){
        if (!isEmpty()){
            No auxNo = no;
            while(auxNo.getProximoNo() != null){
                auxNo = auxNo.getProximoNo();
            }

            return auxNo;
        }else{
            return null;
        }
    }

    public boolean isEmpty() {
        return   no==null ? true : false;
    }

    @Override
    public String toString() {

        String aux = "\tFila\n<==========>\n";

        while (no != null){
            aux += no.getConteudo()+ "\n";
            no = no.getProximoNo();
        }

        aux += "<==========>\n";
        return aux;
   }
}

