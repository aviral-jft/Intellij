import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class test {

    @Autowired
    private B b;

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","root","password");
            System.out.println("Connected");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from temp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();
            System.out.println("Closed");
        }catch(Exception e){ System.out.println(e);}
    }

    public void show(){
        b.display();
    }
}

