package eda.fila;

import eda.no.No;

public  class Fila<T>{

    private No no;
    Fila(){
        no = null;
    }

    public void enqueue(T obj){
        No dados = new No(obj);
        dados.setProximoNo((no));
        no = dados;

    }

    public No dequeue(){
        if (!this.isEmpty()) {
            No auxNo = no;
            No auxNo2 = no;
            while (true) {
                if (auxNo.getProximoNo() != null) {
                    auxNo2 = auxNo;
                    auxNo = auxNo2.getProximoNo();
                } else {
                    if(auxNo2.equals(auxNo)){
                        no = null;
                    }
                    auxNo2.setProximoNo(null);
                    break;
                }
            }
            return auxNo;
        }
        return null;
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
        return no == null;
    }

    @Override
    public String toString() {
        No noFila = no;
        String retornoNO = "";

        while (noFila != null){
            retornoNO += noFila.getConteudo()+ ", ";

            noFila = noFila.getProximoNo();
        }

        return (retornoNO.length() > 0) ? retornoNO.substring(0, retornoNO.lastIndexOf(",")): retornoNO;
   }
}

