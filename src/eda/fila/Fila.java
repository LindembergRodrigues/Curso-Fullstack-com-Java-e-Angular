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
        No auxNo = no;
        No auxNo2 = no;
        while  (true){
            if (auxNo.getProximoNo() != null) {
                auxNo2= auxNo;
                auxNo = auxNo2.getProximoNo();
            }else {
                auxNo2.setProximoNo(null);
                break;
            }
        }

        return auxNo == auxNo2 ? null: auxNo2;


    }

    public No first (){
        if (!isEmpty()){
            No auxNo = no;
            while(true){
                if (auxNo.getProximoNo() != null){
                    auxNo = auxNo.getProximoNo();
                }else{
                    break;
                }
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
        No noFila = no;
        String retornoNO = "";

        while (noFila != null){
            retornoNO += noFila.getConteudo()+ "\n";
            noFila = noFila.getProximoNo();
        }

        return retornoNO;
   }
}

