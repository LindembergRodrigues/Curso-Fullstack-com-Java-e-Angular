package ExercicioProposto;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOConection{

    public static Connection getConnection(){
        Connection conection = null;
        try (InputStream input = DAOConection.class.getClassLoader().getResourceAsStream("connection.properties")){
            Properties properties = new Properties();
            properties.load(input);

            String driver = properties.getProperty("jdbc.driver");
            String databaseAddress = properties.getProperty("db.address");
            String name = properties.getProperty("db.name");
            String login = properties.getProperty("db.user.login");
            String password = properties.getProperty("db.user.password");

            StringBuilder dados = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(databaseAddress).append("/")
                    .append(name);

            String conexao = dados.toString();

            try{
                conection = DriverManager.getConnection(conexao,login,password);
            }catch (SQLException e){
                System.out.println("Erro:");
                throw  new RuntimeException(e);
            }


        }catch(Exception e ){
            System.out.println("Erro:\n");
        }
        return conection;
    }
}
