import java.awt.*;
import java.sql.*;
import java.util.Arrays;

public class ABCDao {

    Connection connection=null;
    PreparedStatement ptmt=null;
    ResultSet resultSet=null;

    public ABCDao() {
    }

    private Connection getConnection() throws SQLException{
        Connection conn;
        conn=ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public void add(ABCBean abcBean){
        try {
            if (!verifyFields(abcBean)) {
                System.out.println("Invalid input Format");
                return;
            }
            String queryString = "INSERT INTO Abc(rollNumber,Name,standard,dob,fees) values(?,?,?,?)";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, abcBean.getRollNumber());
            ptmt.setString(2, abcBean.getStudentName());
            ptmt.setString(3, abcBean.getStandard());
            ptmt.setDate(4,abcBean.getDob());
            ptmt.setInt(5, abcBean.getFees());
            ptmt.executeUpdate();
            System.out.println("Data Added Successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (ptmt!=null){
                    ptmt.close();
                }
                if(connection!=null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private boolean verifyFields(ABCBean abcBean){
        List<String> romanNumerals= Arrays.asList("I","II","III","IV","V","VI","VII","VIII","IX","X");
        if (String.valueOf(abcBean.getRollNumber()).length()==4&&abcBean.getStudentName().matches("[A-Z]{1,20}")&&
                romanNumerals.contains((abcBean.getStandard()))
            return true;
        return false;
    }

    public ABCBean findBYRollNumber(int rollNumber){{
    try {
        String queryString ="SElect * from Abc Where rollNumber=?";
        connection=getConnection();
        ptmt=connection.prepareStatement(queryString);
        ptmt.setInt(1,rollNumber);
        resultSet=ptmt.executeQuery();
        if(resultSet!=null){
            ABCBean abcBean=new ABCBean(resultSet.getInt())
        }
    }
    }
    }
}
