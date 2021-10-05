package collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExecicioProposto2 {
    public static void main(String[] args) {
        LF lf1 = new LF("Java", "1980", "IntellIj");
        LF lf2 = new LF("C", "1970", "Codeblock");
        LF lf3 = new LF("Python", "1990","Pycharm");

        List<LF> lista = new ArrayList<>();
        lista.add(lf1);
        lista.add(lf2);
        lista.add(lf3);

        System.out.println("Por ordem de inserção -" + lista);

        Collections.sort(lista);
        System.out.println("Por ordem natural -"+ lista );

    }
}

class LF implements Comparable<LF>{
    private String nome;
    private String anoDeCriacao;
    private String ide;

    LF(String nome, String anoDeCriacao, String ide){
        this.nome =nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide= ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(String anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String toString(){
        return this.nome + " " + this.anoDeCriacao + " " +  this.ide ;
    }

    @Override
    public int compareTo(LF o) {
        return getNome().compareToIgnoreCase(o.getNome());
    }
}