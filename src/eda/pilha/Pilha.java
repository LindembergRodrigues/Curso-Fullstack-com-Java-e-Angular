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

    public void push(Object obj) {
        No no = new No(obj);
        No auxiliar = refNo;
        refNo = no;
        refNo.setProximoNo(auxiliar);
    }

    @Override
    public String toString() {
        No noPilha = refNo;
        String retornoNO = "";
        while (noPilha != null){
            retornoNO += noPilha.getConteudo()+ "\n";
            noPilha = noPilha.getProximoNo();

        }

        return retornoNO;
    }
}
