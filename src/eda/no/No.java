package eda.no;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;

    }

    public No(T conteudo, No<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
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
