package eda.nó;

public class GerarNo {
    public static void main(String[] args) {
        No<String> no = new No("Conteudo nó 1 ");
        No<String> no2 = new No("Conteudo nó 2 ");

        no.setProximoNo(no2);
        No<String> no3 = new No("Conteudo nó 2 ");
        no.setProximoNo(no3);
        No<Integer> no4 = new No("Conteudo nó 2 ");
        no4.setProximoNo(no);

        System.out.println();
        System.out.println(no4.getProximoNo());
        // melhorar
        
    }
}
