
package Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCnx {
 
    //youssouf : jais changer la visibilite de Connection vers private
 private static Connection connection = null;

 //yousouf : jais ajouter le mot clé static a ta method 
 
    public static Connection getConnection() {

        System.out.println("Mysql Testing");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");

        } catch (Exception ex) {
            System.out.println("Connection Error");
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Connection Success");

            } else {
                System.out.println("Connection Failed!");
            }
        }

        return connection;
    }
}
