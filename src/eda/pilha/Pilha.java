package eda.pilha;

import eda.no.No;

public class Pilha {

    private No refNo;

    Pilha(){
        refNo = null;
    }

    public boolean isEmpty() {
       return refNo == null ? true : false;
    }

    public No top(){
        return refNo;
    }

    public No pop(){
        if (!isEmpty()){
            No pop = refNo;
            refNo = refNo.getProximoNo();
            return pop;
        }else{
            return null;
        }

    }

    public void push(No no){
        No auxiliar = refNo;
        refNo = no;
        refNo.setProximoNo(auxiliar);
    }

    @Override
    public String toString() {
        String aux = "\tPilha\n<==========>\n";
        while (refNo != null){
                aux += refNo.getConteudo()+ "\n";
                refNo = refNo.getProximoNo();

        }
        aux += "<==========>\n";
        return aux;
    }
}
