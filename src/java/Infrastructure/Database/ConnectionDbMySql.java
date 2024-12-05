package Infrastructure.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

//esta clase nos permite realizar la conexion  a la bd
public class ConnectionDbMySql {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_yesid_david_martinez_arrieta";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //Método que devuelve una conexion a la base de datos 
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Error:  Driver MySQL no encontrado. ");
        } catch (SQLException e) {
            e.printStackTrace();
            var message = "Error: no se pudo establecer la conexion con la base de datos. ";
            throw new SQLException(message);
        }

        return connection;
    }

}
