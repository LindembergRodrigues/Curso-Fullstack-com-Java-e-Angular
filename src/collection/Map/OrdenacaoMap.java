package collection.Map;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
       
        Map<String, Livro> escritor = new HashMap<>(){{
            put("Howking, Stephen", new Livro("Uma breve História do tempo",256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuvla Noah", new Livro("Lições para o século 21", 4321));
        }};

        System.out.println(escritor);
        System.out.println("\n");

        Map<String, Livro> escritor2 = new LinkedHashMap<>(){{
            put("Howking, Stephen", new Livro("Uma breve História do tempo",256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuvla Noah", new Livro("Lições para o século 21", 4321));
        }};

        Map<String, Livro> esc = new TreeMap<>(escritor);

        for (Map.Entry<String,Livro> dados : esc.entrySet()){
            System.out.println(dados.getKey() +" --  "+ dados.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> esc2 = new TreeSet(new CompareToLivro());
        esc2.addAll(escritor.entrySet());
        System.out.println(esc2);

    }
}


class Livro  {
    private String nome;
    private int pagina;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return pagina == livro.pagina && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pagina);
    }

    Livro(String nome, int pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + " - " + getPagina();
    }


}

class CompareToLivro implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
