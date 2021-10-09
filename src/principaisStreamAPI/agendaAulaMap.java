package principaisStreamAPI;

import java.util.*;

public class agendaAulaMap {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("lindemberg",912345678));
            put(52, new Contato("Rodrigo",991919191));
            put(35, new Contato("Aline",988124578));
            put(4, new Contato("Bianca",854123564));
        }};

        for(Map.Entry<Integer, Contato> agendaIt : agenda.entrySet()){
            System.out.println(agendaIt.getKey()+ " - " + agendaIt.getValue().getNome() + " - " + agendaIt.getValue().getTelefone());

        }
        System.out.println();

        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(){{
            put(1, new Contato("lindemberg",912345678));
            put(4, new Contato("Rodrigo",991919191));
            put(3, new Contato("Aline",988124578));
            put(5, new Contato("Bianca",854123564));
        }};
        for(Map.Entry<Integer, Contato> agendaIt : agenda2.entrySet()){
            System.out.println(agendaIt.getKey()+ " - " + agendaIt.getValue().getNome() + " - " + agendaIt.getValue().getTelefone());

        }

        System.out.println("\n - Ordernar por numero de ID - ");
        Map<Integer, Contato> agenda3 = new TreeMap<>(){{
            put(15, new Contato("lindemberg",912345678));
            put(9, new Contato("Rodrigo",99191919));
            put(13, new Contato("Aline",988124578));
            put(1, new Contato("Bianca",854123564));
        }};
        for(Map.Entry<Integer, Contato> agendaIt : agenda3.entrySet()){
            System.out.println(agendaIt.getKey()+ " - " + agendaIt.getValue().getNome() + " - " + agendaIt.getValue().getTelefone());
        }

       /* Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getTelefone(),cont2.getValue().getTelefone());
            }
        });
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>( Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getTelefone();
                    }
                }));*/
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>( Comparator.comparing(
               cont ->  cont.getValue().getTelefone()));

        agenda4.addAll(agenda3.entrySet());
        System.out.println("\nOrdena por Telefone ");
        for(Map.Entry<Integer, Contato> agendaIt : agenda4){
            System.out.println(agendaIt.getKey()+ " - " + agendaIt.getValue().getNome() + " - " + agendaIt.getValue().getTelefone());
        }

    }
}

class Contato {
    private String nome;
    private int telefone;

    Contato(String nome, int telefone){
     this.nome = nome;
     this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(telefone, contato.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
// nunca utilizadoo

class CompareToTel implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getTelefone(),(o2.getValue().getTelefone()));
    }
}