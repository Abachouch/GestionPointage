/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LesFormees;
import Model.beans.ServiceOrient;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lahcen
 */
public class JFrame_S_orient__Act_Medi extends javax.swing.JFrame {

    
    
 
    
   private DefaultTableModel dt; 
    
    private int i; // un indice de déplacement 
      Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    private int id_serv;
    
    
    public JFrame_S_orient__Act_Medi() {
        initComponents();
        panel_Modifier.setVisible(false);
        panel_Supprimer.setVisible(false);
     //   jPanel1.setSize(500, 500);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_Ajouter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Ajouter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Button_Ajouter = new javax.swing.JButton();
        Button_Modifier = new javax.swing.JButton();
        Button_Supprimer = new javax.swing.JButton();
        panel_Supprimer = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        Button_Supprimer_Enregistrer = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        supprimer = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_Modifier = new javax.swing.JPanel();
        txt_Modifier = new javax.swing.JTextField();
        comboboc_Modifier = new javax.swing.JComboBox();
        Button_Modifier_Enregistrer = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Gestion Pointage");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(1587, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        panel_Ajouter.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        jLabel2.setText("Service Orient");

        jLabel7.setText("Ajouter");

        Button_Ajouter.setText("Ajouter");
        Button_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AjouterActionPerformed(evt);
            }
        });

        Button_Modifier.setText("Modifier");
        Button_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ModifierActionPerformed(evt);
            }
        });

        Button_Supprimer.setText("Supprimer");
        Button_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_Modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Button_Ajouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Modifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Supprimer)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_AjouterLayout = new javax.swing.GroupLayout(panel_Ajouter);
        panel_Ajouter.setLayout(panel_AjouterLayout);
        panel_AjouterLayout.setHorizontalGroup(
            panel_AjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AjouterLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_AjouterLayout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_AjouterLayout.setVerticalGroup(
            panel_AjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AjouterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(panel_AjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AjouterLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(panel_AjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(panel_AjouterLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 160, Short.MAX_VALUE))
        );

        panel_Supprimer.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Button_Supprimer_Enregistrer.setText("Enregistrer");
        Button_Supprimer_Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Supprimer_EnregistrerActionPerformed(evt);
            }
        });

        jButton7.setText("Annuler");

        supprimer.setText("Supprimer");

        jLabel12.setText("Service Orient");

        javax.swing.GroupLayout panel_SupprimerLayout = new javax.swing.GroupLayout(panel_Supprimer);
        panel_Supprimer.setLayout(panel_SupprimerLayout);
        panel_SupprimerLayout.setHorizontalGroup(
            panel_SupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SupprimerLayout.createSequentialGroup()
                .addGroup(panel_SupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SupprimerLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(supprimer))
                    .addGroup(panel_SupprimerLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_SupprimerLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Button_Supprimer_Enregistrer)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panel_SupprimerLayout.setVerticalGroup(
            panel_SupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SupprimerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(supprimer)
                .addGap(67, 67, 67)
                .addGroup(panel_SupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(panel_SupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Supprimer_Enregistrer)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Modifier.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        comboboc_Modifier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Button_Modifier_Enregistrer.setText("Enregistrer");
        Button_Modifier_Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Modifier_EnregistrerActionPerformed(evt);
            }
        });

        jButton5.setText("Annuler");

        jLabel8.setText("Modifier");

        jLabel9.setText("Service Orient");

        jLabel10.setText("Service Orient");

        javax.swing.GroupLayout panel_ModifierLayout = new javax.swing.GroupLayout(panel_Modifier);
        panel_Modifier.setLayout(panel_ModifierLayout);
        panel_ModifierLayout.setHorizontalGroup(
            panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ModifierLayout.createSequentialGroup()
                .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ModifierLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel8))
                    .addGroup(panel_ModifierLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Modifier)
                            .addComponent(comboboc_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ModifierLayout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(Button_Modifier_Enregistrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        panel_ModifierLayout.setVerticalGroup(
            panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ModifierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(115, 115, 115)
                .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboc_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(panel_ModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Modifier_Enregistrer)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Ajouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Supprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ModifierActionPerformed

        panel_Ajouter.setVisible(false);
        panel_Modifier.setVisible(true);
    }//GEN-LAST:event_Button_ModifierActionPerformed

    private void Button_Modifier_EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Modifier_EnregistrerActionPerformed
        panel_Ajouter.setVisible(true);
        panel_Modifier.setVisible(false);      
    }//GEN-LAST:event_Button_Modifier_EnregistrerActionPerformed

    private void Button_Supprimer_EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Supprimer_EnregistrerActionPerformed

        panel_Ajouter.setVisible(true);
        panel_Supprimer.setVisible(false);
    }//GEN-LAST:event_Button_Supprimer_EnregistrerActionPerformed

    private void Button_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SupprimerActionPerformed
        panel_Ajouter.setVisible(false);
        panel_Supprimer.setVisible(true);
    }//GEN-LAST:event_Button_SupprimerActionPerformed

    private void Button_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AjouterActionPerformed

      
    }//GEN-LAST:event_Button_AjouterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     //Load comme C#
        try{
        // connexion avec base de donnée stg
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
           st = con.createStatement();     
        dt = new DefaultTableModel();// dt c'est un variable pour stocké les element d'un tableau {ligne et colomn}
      
        dt.addColumn("Nom_Service_Orient");
        
      // table_S_Orient.setModel(dt);
       /*
        *  afficehr la liste des stagiaires 
        */
        AfficherBorderent();
      /*
       *  remplir les champs 
       */
        // i = 0;
      // DeplacerStagiaire(i);
    }catch(Exception e){
        System.out.printf("erreur   "+e.getMessage());//getMessage c'est une fonction  pour afficher l'Erreur ou se trouve ?!!!!!
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n  "+ e.getMessage());
    }
        
    }//GEN-LAST:event_formWindowOpened

    
    
    
    
    
     private void AfficherBorderent(){
  
  //txt_ID_Borderent.setEnabled(false);
   
     try{
        dt.setRowCount(0); // vider la list des stagiaires.
        rs = st.executeQuery("SELECT * FROM service_orient");
        
        while(rs.next()){
            
          // id_serv=rs.gets
            Object[] t = {id_serv};
            dt.addRow(t);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur afficher la liste des stagiaire\n"+e.getMessage());
    } 
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_S_orient__Act_Medi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_S_orient__Act_Medi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_S_orient__Act_Medi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_S_orient__Act_Medi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_S_orient__Act_Medi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Ajouter;
    private javax.swing.JButton Button_Modifier;
    private javax.swing.JButton Button_Modifier_Enregistrer;
    private javax.swing.JButton Button_Supprimer;
    private javax.swing.JButton Button_Supprimer_Enregistrer;
    private javax.swing.JComboBox comboboc_Modifier;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_Ajouter;
    private javax.swing.JPanel panel_Modifier;
    private javax.swing.JPanel panel_Supprimer;
    private javax.swing.JLabel supprimer;
    private javax.swing.JTextField txt_Ajouter;
    private javax.swing.JTextField txt_Modifier;
    // End of variables declaration//GEN-END:variables
}
