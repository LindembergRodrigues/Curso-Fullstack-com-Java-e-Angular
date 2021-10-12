package eda.listaEncadeada;

import eda.no.No;

public class ListaEncadeada<T> {

    No <T> noListaEncadeada;

    public ListaEncadeada() {
        this.noListaEncadeada = null;
    }

    public void add(T conteudo){

        No<T> noConteudo = new No(conteudo);
        if (this.isEmpty()){
            noListaEncadeada =  noConteudo;
            return;
        }

        No<T> novoNo2= noListaEncadeada;
        for (int i =0 ; i < size()-1; i++){
            novoNo2 = novoNo2.getProximoNo();
        }
        novoNo2.setProximoNo(noConteudo);

    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public boolean isEmpty() {
        return noListaEncadeada == null;

    }

    public No<T> getNo(int index){

        validaIndice(index);
        No<T> noAuxiliar = noListaEncadeada;
        No<T> noRetorno = null;

        for (int i= 0; i<=index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivo = this.getNo(index);
        if (index == 0 ){
            noListaEncadeada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior= getNo(index-1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();

    }

    public int size() {
        int tamanhoLista = 0;
        No<T> listaAux = noListaEncadeada;
        while (true) {
            if (listaAux != null) {
                tamanhoLista++;
                if (listaAux.getProximoNo() != null) {
                    listaAux = listaAux.getProximoNo();
                }else{
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if (index >=size()){
            throw new IndexOutOfBoundsException(" Não existe conteúdo para esse indice," +
                    " o tamanho da Array é "+ (size()-1));
        }
    }




    @Override
    public String toString(){
        String listaRetorno  = "";
        No<T> noPosicao = noListaEncadeada;
        for(int i=0; i< size(); i++){

            listaRetorno+= noPosicao+ "-->";
            noPosicao= noPosicao.getProximoNo();

        }
        listaRetorno+= "null";
        return listaRetorno;
    }
}
