package ExercicioProposto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO{
    //C
    public void create(Curso curso) {
        try (Connection con = DAOConection.getConnection()) {
            String requisicao = "INSERT INTO curso(nome,duracao_horas)  values(?,?)";

            PreparedStatement pstm = con.prepareStatement(requisicao);

            pstm.setString(1,curso.getNome());
            pstm.setInt(2,curso.getDurcaoHoras());

            int qtdAlteraca = pstm.executeUpdate();
            System.out.println("Dados inseridos!");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //R
    public List<Curso> reader(){
        List<Curso> cursos = new ArrayList<>();

        try(Connection con = DAOConection.getConnection()){

            String requerimento = "select * from curso";

            PreparedStatement pstm = con.prepareStatement(requerimento);

            ResultSet dadosBD = pstm.executeQuery();

            while (dadosBD.next()){
                int id = dadosBD.getInt("id");
                String nome = dadosBD.getString("nome");
                int  duracaoHOras = dadosBD.getInt("duracao_horas");

                cursos.add(new Curso(id,nome,duracaoHOras));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return cursos;
    }
    //U
    public void update(Curso curso){
        try (Connection con = DAOConection.getConnection()){
            String requerimento = "UPDATE curso SET id = ?, nome = ?, duracao_hora = ? where id = ?";

            PreparedStatement pstm = con.prepareStatement(requerimento);

            pstm.setInt(1,curso.getId());
            pstm.setString(2,curso.getNome());
            pstm.setInt(3,curso.getDurcaoHoras());
            int qtdAtualizacao = pstm.executeUpdate();
            System.out.println("Dados atualizados");
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    //D
    public void delete( int id){
        try(Connection con = DAOConection.getConnection()) {
            String requerimento = "delete from curso where id = ?";

            PreparedStatement pstm =con.prepareStatement(requerimento);
            pstm.setInt(1,id);
            System.out.println("dado  Removido");
            int qtdAlteraca = pstm.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
