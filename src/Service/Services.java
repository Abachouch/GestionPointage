package Service;

import Driver.MysqlCnx;
import Model.LoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * cet class contien tout les action de programme il joue le role d'un controleur
 * @author youssouf
 * @
 */
public class Services {

    public boolean Test_Login_Connection(String username, String password) throws SQLException {
        String sql = "SELECT Username,Pasword FROM logine WHERE Username='" + username + "' and Pasword='" + password + "'";
        boolean etat = false;
        MysqlCnx cnx = new MysqlCnx();
        Connection connect = cnx.getConnection();
        Statement stmt = null;
        try {
            stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String usnam = "";
            String pass = "";
            while (rs.next()) {
                etat = true;
            }
        } catch (Exception e) {
        } finally {
            connect.close();
            stmt.close();
        }

        return etat;
    }
    /**
     * cet methode permetr de s'authantifier et redirecter l utilisateur vers un form
     * 
     * @param login
     * @param password 
     * 
     */
    public boolean login(String login , String password){
        if(LoginModel.login(login, password))
            //redirection vers page acceuil
            return true ;
        else 
            //redirection vers login avec un erreur
            return false ;
    }
    
    
    
    
    
}
