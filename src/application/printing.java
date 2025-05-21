
package application;


import adminpack.admindashboard;
import config.Session;
import javax.swing.JOptionPane;
import authentication.login;
import config.PanelPrinter;
import config.dbConnectors;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;




public class printing extends javax.swing.JFrame {

  
    public printing() {
        initComponents();
    }

    
     public void displayData(){
        try{
            dbConnectors dbc = new dbConnectors();
            ResultSet rs = dbc.getData("SELECT tbl_applications.app_id, tbl_applicants.a_lname, tbl_jobs.j_name, "
             + " tbl_applications.status FROM tbl_applications "
             + " INNER JOIN tbl_applicants ON tbl_applications.app_aid = tbl_applicants.a_id "
             + " INNER JOIN tbl_jobs ON tbl_applications.app_jid = tbl_jobs.j_id WHERE tbl_applications.status = 'Approved'");
            applicantstable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
        
    }     public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        acc_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantstable = new javax.swing.JTable();
        page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jobname = new javax.swing.JLabel();
        appid = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 40));

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

        select.setBackground(new java.awt.Color(241, 207, 84));
        select.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/touchscreen.png"))); // NOI18N
        select.setText("SELECT");
        select.setOpaque(true);
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 40));

        jLabel4.setBackground(new java.awt.Color(241, 207, 84));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesdesign/326675_print_icon.png"))); // NOI18N
        jLabel4.setText(" PRINT");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 40));

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

        applicantstable.setBackground(new java.awt.Color(255, 252, 239));
        applicantstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        applicantstable.setGridColor(new java.awt.Color(255, 252, 239));
        jScrollPane1.setViewportView(applicantstable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 300, 440));

        page.setBackground(new java.awt.Color(245, 253, 189));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("This document serves as an official acknowledgment of the receipt");
        page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 26));

        jLabel5.setText("recorded  and will be processed in accordance with our  recruitment ");
        page.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 350, 30));

        jLabel10.setText("policies. Please retain this receipt for your records.");
        page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 330, 30));

        jLabel11.setText("of the applicant's job application. All submitted information has been");
        page.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 330, 26));

        jLabel12.setText("Date summitted:");
        page.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("APPLICATION TRACKER");
        page.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("JOB");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        page.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 50));
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 230, 20));

        jLabel16.setText("job applied:");
        page.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 20));

        jLabel17.setText("Application id:");
        page.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 20));

        jLabel18.setText("Applicant name:");
        page.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));
        page.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, 20));
        page.add(jobname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 20));
        page.add(appid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 230, 20));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(null);
        jPanel7.add(image);
        image.setBounds(0, 0, 110, 100);

        page.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 100));

        jPanel1.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 380, 500));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(" SHOWING APPROVED APPLICATIONS");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 300, 30));

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
       displayData();
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
  
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        admindashboard adm = new admindashboard();  
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
         int rowIndex = applicantstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an application!");
        } else {
            try {
                dbConnectors dbc = new dbConnectors();
                TableModel tbl = applicantstable.getModel();
                ResultSet rs = dbc.getData("SELECT tbl_applications.app_id,tbl_applications.date, tbl_applicants.a_fname, tbl_applicants.a_lname, tbl_applicants.a_image, tbl_jobs.j_name, "
             + " tbl_applications.status FROM tbl_applications INNER JOIN tbl_applicants ON tbl_applications.app_aid = tbl_applicants.a_id "
             + " INNER JOIN tbl_jobs ON tbl_applications.app_jid = tbl_jobs.j_id  WHERE tbl_applications.app_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    
                    appid.setText(""+rs.getInt("app_id"));
                    fullname.setText(""+rs.getString("a_lname")+""+rs.getString("a_fname"));
                    jobname.setText(""+rs.getString("j_name"));
                    date.setText(""+rs.getString("date"));
                    image.setIcon(ResizeImage(rs.getString("a_image"),null,image));
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_selectMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(appid.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please select an application!");}
        else{
        PanelPrinter pprint = new PanelPrinter(page);
        pprint.printPanel();}
        
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new printing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel appid;
    private javax.swing.JTable applicantstable;
    private javax.swing.JLabel date;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jobname;
    private javax.swing.JPanel page;
    private javax.swing.JLabel select;
    // End of variables declaration//GEN-END:variables
}
