/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Driver.MysqlCnx;
import Model.beans.Logine;
import Service.Services;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author youssouf
 */
public class LoginModel {

    /**
     * cet fonction permet de tester si un utilisateur est inscrit
     *
     * @param login
     * @param password
     * @return true si le utilisateur est daja inscrire dans la base de donne et
     * false si non
     */
    public static boolean login(String login, String password) {
        String sql = "SELECT Username , Pasword FROM logine WHERE Username= ? and Pasword= ? ";

        PreparedStatement pre;
        try {
            pre = MysqlCnx.getConnection().prepareStatement(sql);
            pre.setString(1, login);
            pre.setString(2, password);
            // remplire la resultset si le usernam et password sont correct
            ResultSet rs = pre.executeQuery();
            //si la rsultset a une resultat il va returne true
            return rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * cet fonction permet de inscrir un ultilisateur
     *
     * @param user : USER
     * @return the auto genrated id for login table .
     */
    public static int ajouter(Logine user) {
        int id = 0;
        String asqInsert = "insert into logine (Username,Pasword) values(? , ?)";
        try {
            PreparedStatement pre = MysqlCnx.getConnection().prepareStatement(asqInsert);
            pre.setString(1, user.getUsername());
            pre.setString(1, user.getPasword());
            id = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public boolean supprimer(int id) {
        int rowAffected = 0;

        String sqldelete = "delete logine where id_Login = " + id;

        try {
            Statement st = MysqlCnx.getConnection().createStatement();
            st.executeUpdate(sqldelete);
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (rowAffected > 0) ? true : false;
    }

    public boolean modifier(Logine login) {
        int rowAffected = 0;

        String sqldelete = "UPDATE LOGINE SET USERNAME = ? PASWORD = ?  where id_Login = " + login.getIdLogin();


        PreparedStatement st;
        try {
            st = MysqlCnx.getConnection().prepareStatement(sqldelete);
            st.setString(1, login.getUsername());
            st.setString(1, login.getPasword());
            rowAffected = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (rowAffected > 0) ? true : false;
    }

    public List<Logine> All() {
        List<Logine> lst = new ArrayList<>();
        Logine l;
        int rowAffected = 0;
        
        String sqlSelect = "select * from logine";
        Statement st;
        try {
            st = MysqlCnx.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                l = new Logine();
                l.setIdLogin(rs.getInt("logine"));
                l.setPasword(rs.getString("logine"));
                l.setUsername(rs.getString("username"));
                lst.add(l) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
    
     public Logine LogineAllById(int id) {
        Logine l = null;
        int rowAffected = 0;
        String sqlSelect = "select * from logine where id_Login = "+id;
        Statement st;
        try {
            st = MysqlCnx.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                l = new Logine();
                l.setIdLogin(rs.getInt("logine"));
                l.setPasword(rs.getString("logine"));
                l.setUsername(rs.getString("username"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
}
