package ExercicioProposto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CursoDAO dao = new CursoDAO();
        System.out.println("Inserir Dados no banco: Inglês e duração 5 horas ");

        System.out.println("Inserir Dados no banco: Hitória e duração 50 horas ");

        System.out.println("Inserir Dados no banco: Noção Para Presidentes e duração 8 (na horizontal) horas ");
        Curso curso = new Curso("Inglês",5);
        Curso curso1 = new Curso("Hitória",50);
        Curso curso2 = new Curso("Noção Para Presidentes",8);

        dao.create(curso);
        dao.create(curso1);
        dao.create(curso2);

        List<Curso> cursoList = dao.reader();
        cursoList.stream().forEach(System.out::println);

        System.out.println("Remove Curso com id 2");
        dao.delete(2);

        cursoList = dao.reader();
        cursoList.stream().forEach(System.out::println);

    }
}
