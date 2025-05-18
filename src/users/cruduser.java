
package users;

import adminpack.admindashboard;
import config.Session;
import javax.swing.JOptionPane;
import authentication.login;



public class cruduser extends javax.swing.JFrame {

  
    public cruduser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 252, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(241, 207, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_name.setText("  accname");
        jPanel3.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 30));

        jLabel1.setBackground(new java.awt.Color(241, 207, 84));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/9004799_arrow_direction_left_back_icon.png"))); // NOI18N
        jLabel1.setText("BACK");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 40));

        jLabel2.setBackground(new java.awt.Color(241, 207, 84));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/1564491_add_create_new_plus_icon.png"))); // NOI18N
        jLabel2.setText("ADD USER");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 40));

        jLabel3.setBackground(new java.awt.Color(241, 207, 84));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/8666681_edit_icon.png"))); // NOI18N
        jLabel3.setText("EDIT USER");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 40));

        jLabel4.setBackground(new java.awt.Color(241, 207, 84));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/9004772_cross_delete_cancel_remove_icon.png"))); // NOI18N
        jLabel4.setText("DELETE USER");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 40));

        jLabel5.setBackground(new java.awt.Color(241, 207, 84));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/2931174_clipboard_copy_paste_analysis_report_icon.png"))); // NOI18N
        jLabel5.setText("VIEW USERS");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 170, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("APPLICATION TRACKER");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("JOB");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 500));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("—");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, -1));

        jDesktopPane1.setBackground(new java.awt.Color(255, 252, 239));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 710, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(898, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();      
        
        if(sess.getUid()== 0){
            JOptionPane.showMessageDialog(null, "No Account!, Please login first!");
            login lf = new login();
            lf.setVisible(true);
            this.dispose();
        }else{
           
            acc_name.setText(" "+sess.getLname());
        } 
        
    }//GEN-LAST:event_formWindowActivated

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    jDesktopPane1.removeAll();
    adduser ad = new adduser();
    jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      jDesktopPane1.removeAll();
    edituser ed = new edituser();
    jDesktopPane1.add(ed).setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    jDesktopPane1.removeAll();
    deleteuser dl = new deleteuser();
    jDesktopPane1.add(dl).setVisible(true);   
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        admindashboard adm = new admindashboard();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jDesktopPane1.removeAll();
        adduser ad = new adduser();
        jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jDesktopPane1.removeAll();
        viewuser ad = new viewuser();
        jDesktopPane1.add(ad).setVisible(true);  
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(cruduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cruduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cruduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cruduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cruduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
