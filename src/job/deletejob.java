/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;



import config.Session;
import config.dbConnectors;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class deletejob extends javax.swing.JInternalFrame {

    /**
     * Creates new form adduser
     */
    public deletejob() {
        initComponents();
         this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
    }
    
   
     public void displayData(){
        try{
            dbConnectors dbc = new dbConnectors();
            ResultSet rs = dbc.getData("SELECT j_id, j_name,j_status FROM tbl_jobs");
            applicantstable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
        
    }
     
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantstable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 252, 239));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 252, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 252, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 130, -1));

        CLEAR.setBackground(new java.awt.Color(255, 255, 255));
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel2.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, -1));

        edit.setText("SELECT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, -1));

        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 30));

        jLabel2.setText(" ID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));

        jLabel3.setText("Job description:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        jLabel5.setText("Status: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 20));

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setEnabled(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 30));

        jLabel9.setText("Job Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        description.setColumns(20);
        description.setRows(5);
        description.setEnabled(false);
        jScrollPane2.setViewportView(description);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 140));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavaible" }));
        status.setEnabled(false);
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 420));

        applicantstable.setBackground(new java.awt.Color(255, 252, 239));
        applicantstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        applicantstable.setGridColor(new java.awt.Color(255, 252, 239));
        jScrollPane1.setViewportView(applicantstable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 300, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Session sess = Session.getInstance();
        dbConnectors dbc = new dbConnectors();
        int cuser = sess.getUid();
        if(id.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please select a job!");
        
        }else{
        dbc.deleteData("DELETE FROM tbl_jobs WHERE j_id = '"+id.getText()+"'");
        displayData();
        id.setText("");
        name.setText("");
       description.setText("");
        status.setSelectedItem("");
        
       
        String actionn = "Deleted job with ID No.: " + id.getText();
            dbc.insertData("INSERT INTO tbl_logs(user_id, action, date) VALUES ('" + sess.getUid() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
        }
       
    }//GEN-LAST:event_deleteActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
       id.setText("");
        name.setText("");
       description.setText("");
        status.setSelectedItem("");
        
       
     
    }//GEN-LAST:event_CLEARActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         int rowIndex = applicantstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a job!");
        } else {
            try {
                dbConnectors dbc = new dbConnectors();
                TableModel tbl = applicantstable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_jobs WHERE j_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    
                    id.setText(""+rs.getInt("j_id"));
                    name.setText(""+rs.getString("j_name"));
                    description.setText(""+rs.getString("j_description"));
                    status.setSelectedItem(""+rs.getString("j_status"));                 
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        displayData();
    }//GEN-LAST:event_formInternalFrameActivated

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JTable applicantstable;
    public javax.swing.JButton delete;
    private javax.swing.JTextArea description;
    private javax.swing.JButton edit;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField name;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
