import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        String url= "jdbc:mysql://localhost:3306/ratandb";

        try {
            Connection conn= DriverManager.getConnection(url, "root", "root");

            Statement st= conn.createStatement();

            int x= st.executeUpdate("insert into employee values(eid int primary key" + "" +
                    "  name varchar(15)" +
                    "  address varchar(15)" +
                    "  salary int");


            if(x >0) {
                System.out.println("record inserted sucessfully");
            }
            else
                System.out.println("not inserted...");


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}