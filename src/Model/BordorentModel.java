/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Driver.MysqlCnx;
import Model.beans.Bordorent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author youssouf
 */
public class BordorentModel {
    
    Bordorent bordorent ;
    
    public static boolean ajouter(Bordorent bordorent){
        
        String sql ="insert into bordorent values(? , ?)" ;
        try {
            PreparedStatement ps = MysqlCnx.getConnection().prepareStatement( sql);
            ps.setString(1, bordorent.getIdBordorent());
            ps.setDate(2, new java.sql.Date(bordorent.getDateBor().getTime()));
        } catch (SQLException ex) {
            Logger.getLogger(BordorentModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return true ;
    }
    
}
