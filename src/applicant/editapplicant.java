/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicant;


import static authentication.register.eml;
import config.Session;
import config.dbConnectors;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class editapplicant extends javax.swing.JInternalFrame {

    /**
     * Creates new form adduser
     */
    public editapplicant() {
        initComponents();
         this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
    }
    
     public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
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
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
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
     public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
     
     public boolean duplicatedChecker() {
    dbConnectors dbc = new dbConnectors();
    try {
        String query = "SELECT a_email FROM tbl_applicants WHERE (a_email = '" + email.getText() + "')AND a_id !='"+aid.getText()+"'";
        ResultSet resultSet = dbc.getData(query);
        
        boolean duplicate = false; // Flag to track duplicates
        
        while (resultSet.next()) { // Loop through results (if any)
            eml = resultSet.getString("a_email");
            
            
            if (eml.equals(email.getText())) {
                JOptionPane.showMessageDialog(null, "Email already used!");
                email.setText("");
                duplicate = true;
            }   
        }
        
        return duplicate;
    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex);
        return true; // Assume duplicate to avoid inserting problematic data
    }
    
}
     
     public void displayData(){
        try{
            dbConnectors dbc = new dbConnectors();
            ResultSet rs = dbc.getData("SELECT a_id, a_lname,a_status FROM tbl_applicants");
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
        contact = new javax.swing.JTextField();
        aid = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();
        add = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 30));

        aid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aid.setEnabled(false);
        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });
        jPanel2.add(aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 30));

        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

        jLabel2.setText(" ID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel3.setText("Last Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 30));

        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel6.setText("Contact:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        jLabel9.setText("First Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);
        jPanel3.add(image);
        image.setBounds(0, 0, 130, 120);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 130, 120));

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 130, -1));

        select.setBackground(new java.awt.Color(255, 255, 255));
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, -1));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setText("SAVE");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 130, -1));

        CLEAR.setBackground(new java.awt.Color(255, 255, 255));
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel2.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, -1));

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, -1));

        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 30));

        jLabel7.setText("Address:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

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

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if ( lname.getText().isEmpty() ||fname.getText().isEmpty() || email.getText().isEmpty() || contact.getText().isEmpty()|| address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields are required!");
        }  else if (duplicatedChecker()) {
            System.out.println("Duplicate Exist");
        } else {
            
            dbConnectors dbc = new dbConnectors();
            boolean inserted = dbc.insertData("UPDATE tbl_applicants SET a_fname ='"+fname.getText()+"',a_lname ='"+lname.getText()+"',"
                + "a_contact ='"+contact.getText()+"',a_email ='"+email.getText()+"', a_address = '"+address.getText()+"',"
                + "a_image = '"+destination+"' WHERE a_id ='"+aid.getText()+"'");

            if (inserted) {
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
                fname.setText("");
                lname.setText("");
                email.setText("");
                contact.setText("");
                address.setText("");
               image.setIcon(null);
               Session sess = Session.getInstance();
                String actionn = "Updated applicant with ID No.: " + aid.getText();
                dbc.insertData("INSERT INTO tbl_logs(user_id, action, date) VALUES ('" + sess.getUid() + "', '" + actionn + "', '" + LocalDateTime.now() + "')");
            } else {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/images/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    image.setIcon(ResizeImage(path, null, image));
                    
                    select.setVisible(false);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
         image.setIcon(null);
        destination = "";
        path = "";
        select.setVisible(true);
    }//GEN-LAST:event_removeActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        fname.setText("");
       lname.setText("");
        email.setText("");
        contact.setText("");
        
        image.setIcon(null);
        destination = "";
        path = "";
        select.setVisible(true);
    }//GEN-LAST:event_CLEARActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         int rowIndex = applicantstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an applicant!");
        } else {
            try {
                dbConnectors dbc = new dbConnectors();
                TableModel tbl = applicantstable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_applicants WHERE a_id = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {

                    
                    aid.setText(""+rs.getInt("a_id"));
                    fname.setText(""+rs.getString("a_fname"));
                    lname.setText(""+rs.getString("a_lname"));
                    contact.setText(""+rs.getString("a_contact"));
                    email.setText(""+rs.getString("a_email"));
                    address.setText(""+rs.getString("a_address"));
                    
                    
                    image.setIcon(ResizeImage(rs.getString("a_image"),null,image));
                    oldpath = rs.getString("a_image");
                    path = rs.getString("a_image");
                    destination = rs.getString("a_image");
                    
                    
                    
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        displayData();
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    public javax.swing.JButton add;
    public javax.swing.JTextField address;
    public javax.swing.JTextField aid;
    private javax.swing.JTable applicantstable;
    public javax.swing.JTextField contact;
    private javax.swing.JButton edit;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lname;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
