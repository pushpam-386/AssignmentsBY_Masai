import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    String driverClassName="com.mysql.jdbc.Driver";
    String connectionUrl="";
    String dbUser="root";
    String dbpwd="root";

    private static ConnectionFactory connectionFactory=null;
    private ConnectionFactory(){
        try {
            Class.forName(driverClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException{
        Connection conn=null;
        conn= DriverManager.getConnection(connectionUrl,dbUser,dbpwd);
        return conn;
    }
    public static ConnectionFactory getInstance(){
        if(connectionFactory==null){
            connectionFactory=new ConnectionFactory();
        }
        return connectionFactory;
    }
}
