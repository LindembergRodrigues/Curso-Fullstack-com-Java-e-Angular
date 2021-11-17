package ExercicioProposto;

public class Curso {

    private int id;
    private String nome;
    private int durcaoHoras;

    public Curso(int id, String nome, int durcaoHoras) {
        this.id = id;
        this.nome = nome;
        this.durcaoHoras = durcaoHoras;
    }

    public Curso(String nome, int durcaoHoras) {
        this.nome = nome;
        this.durcaoHoras = durcaoHoras;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurcaoHoras() {
        return durcaoHoras;
    }

    public void setDurcaoHoras(int durcaoHoras) {
        this.durcaoHoras = durcaoHoras;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", durcaoHoras=" + durcaoHoras +
                '}';
    }
}
