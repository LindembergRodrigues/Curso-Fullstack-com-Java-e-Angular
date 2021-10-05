package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * exemplos de ordenação
 *
 */
public class ExGatos {
    public static void main(String[] args) {
        List<Gatos> gato = new ArrayList<>();

        gato.add(new Gatos("Neve",15,"branco"));
        gato.add(new Gatos("Lís",5,"Cinza"));
        gato.add(new Gatos("Teco",15,"Amarelo alaranjado"));

        System.out.println("\nOrdem de inserção " + gato);

        // A lib list/ArrayList não possui o método aleatório, utilizamos da lib Collection
        Collections.shuffle(gato);
        System.out.println("\nOrdem aleatória " + gato);

        // Para que funcione é necessário o uso da classe comparable que esta implementado na classe Gatos
        Collections.sort(gato);
        System.out.println("\nOrdem Natural " + gato);

        // mesma regra do exemplo de cima

        System.out.println("Ordena por idade");

    }


}

class Gatos implements Comparable<Gatos>{
    private String nome;
    private int idade;
    private String cor;

    Gatos(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString(){
        return "O nome do gato é " + nome + ", tem " + idade+ " Meses de vida e sua cor é " + cor+ "\n";
    }

    @Override
    public int compareTo(Gatos gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }


}
