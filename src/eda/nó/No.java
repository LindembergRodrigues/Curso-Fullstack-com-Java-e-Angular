package eda.nó;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;

    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public String toString() {
        return "No {" +
                "Conteúdo='" + conteudo + "\'" + "}";
    }

    public No getProximoNo() {
        return proximoNo;
    }
}
