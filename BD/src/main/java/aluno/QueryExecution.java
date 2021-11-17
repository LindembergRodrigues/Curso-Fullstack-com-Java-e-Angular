package aluno;

import java.util.List;

public class QueryExecution {
    public static void main(String[] args) {

        AlunoDao alunoDAO = new AlunoDao();

        List<Aluno> alunoList = alunoDAO.list();

        alunoList.stream().forEach(System.out::println);

        System.out.println("\naluno com id 1 =" + alunoDAO.getById(1));

        System.out.println("Inserido  o dados \nNome Lindemberg\nIdade 24\nEstado PB" );

        Aluno aluno = new Aluno(5,"Lindemberg", 25, "PB");

        alunoDAO.create(aluno);
        System.out.println("\n<<LISTA TODOS OS DADOS DO BANCO>>");
        alunoList = alunoDAO.list();

        alunoList.stream().forEach(System.out::println);

        System.out.println("Remover aluno com id numero 8");
    }
}
