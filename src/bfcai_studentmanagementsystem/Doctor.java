package bfcai_studentmanagementsystem;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author Muhammad Agami
 */
public class Doctor extends javax.swing.JFrame {

    int choose;
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    public Doctor() {
        initComponents();
        choose = MainMenu.hd;
         if(choose == 2){
            this.setTitle("Update Doctor");
            buttonChange.setIcon(new ImageIcon("src\\image\\edit144.png"));
            addUpdateDelete.setText("Update Doctor");
            doctorName.setEnabled(false);
            phoneNumber.setEnabled(false);
            address.setEnabled(false);
            male.setEnabled(false);
            female.setEnabled(false);
        }
        else if(choose == 3){
            this.setTitle("Delete Doctor");
            buttonChange.setIcon(new ImageIcon("src\\image\\delete144.png"));
            addUpdateDelete.setText("Delete Doctor");
            doctorName.setEnabled(false);
            phoneNumber.setEnabled(false);
            address.setEnabled(false);
            male.setEnabled(false);
            female.setEnabled(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DoctorNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        doctorNumber = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        buttonChange = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addUpdateDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Doctor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        DoctorNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoctorNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        DoctorNameLabel.setText("Doctor Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctor Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gander");

        doctorName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        doctorName.setToolTipText("");
        doctorName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNameActionPerformed(evt);
            }
        });

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNumber.setToolTipText("");
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        doctorNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        doctorNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doctorNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNumberActionPerformed(evt);
            }
        });
        doctorNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doctorNumberKeyPressed(evt);
            }
        });

        male.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");

        female.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("address");

        address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        address.setToolTipText("");
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        buttonChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add144.png"))); // NOI18N
        buttonChange.setToolTipText("");
        buttonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancle144.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(DoctorNameLabel)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(doctorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(female)
                        .addGap(217, 217, 217))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorNameLabel)
                    .addComponent(doctorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        addUpdateDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addUpdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        addUpdateDelete.setText("Add Doctor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addUpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(addUpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1100, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNameActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void doctorNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNumberActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
           choose = MainMenu.hd;
        switch (choose) {
            case 1:
                Insert();
                break;
            case 2:
                Update();
                break;
            default:
                Delete();
                break;
        }
    }//GEN-LAST:event_buttonChangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.setVisible(false);
        main.Doctor.setEnabled(false);
        main.Student.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void doctorNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctorNumberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (doctorNumber.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "The Doctor Number field is empty", "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("SELECT * FROM Doctor WHERE id = ?");
                    pre.setInt(1, Integer.parseInt(doctorNumber.getText()));
                    res = pre.executeQuery();
                    if (res.next()) {
                        doctorNumber.setEnabled(false); 
                        doctorName.setText(res.getString(2));
                        doctorName.setEnabled(true);
                        phoneNumber.setText(res.getString(4));
                        phoneNumber.setEnabled(true);
                        address.setText(res.getString(5));
                        address.setEnabled(true);

                        String gender = res.getString(6);

                        if (gender.equals(female.getText())) {
                            female.setSelected(true);
                        } else {
                            male.setSelected(true);
                        }
                        male.setEnabled(true);
                        female.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "This doctor number does not exist", "Unavailable", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a number only", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                       
                    }
                }
        }
}

    }//GEN-LAST:event_doctorNumberKeyPressed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorNameLabel;
    private javax.swing.JLabel addUpdateDelete;
    private javax.swing.JTextField address;
    private javax.swing.JButton buttonChange;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField doctorNumber;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables

   private void Insert() {
        String miss = "You forgot to enter the following data: \n";
        if (doctorNumber.getText().isEmpty()) {
            miss += "1- Doctor Number\n";
        }
        if (doctorName.getText().isEmpty()) {
            miss += "2- Doctor Name\n";
        }
        if (phoneNumber.getText().isEmpty()) {
            miss += "3- Phone Number\n";
        }
        if (address.getText().isEmpty()) {
            miss += "4- Address\n";
        }
        if (!male.isSelected() && !female.isSelected()) {
            miss += "5- Gender\n";
        }
        String gender = female.isSelected() ? female.getText() : male.getText();
        if (doctorNumber.getText().isEmpty() || doctorName.getText().isEmpty() || phoneNumber.getText().isEmpty() || address.getText().isEmpty() || (!male.isSelected() && !female.isSelected())) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                con = ConnectionDatabase.connect();
                pre = con.prepareStatement("SELECT * FROM Doctor WHERE id = ?");
                pre.setInt(1, Integer.parseInt(doctorNumber.getText()));
                res = pre.executeQuery();
                if (res.next()) {
                    JOptionPane.showMessageDialog(null, "The Doctor number already exists", "Existing", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    pre = con.prepareStatement("INSERT INTO Doctor VALUES (?, ?, ?, ?, ?, ?)");
                    pre.setInt(1, Integer.parseInt(doctorNumber.getText()));
                    pre.setString(2, doctorName.getText()); 
                   
                    pre.setInt(3, 123); 
                    pre.setString(4, phoneNumber.getText());
                    pre.setString(5, address.getText());
                    pre.setString(6, gender);
                    pre.execute();
                    JOptionPane.showMessageDialog(null, "A Doctor has been added successfully", "Added", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                }
            } catch (SQLException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "An error occurred while inserting data", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                        con.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
    }

    private void Update() {
        String miss = "You forgot to enter the following data: \n";
        if (doctorNumber.getText().isEmpty()) {
            miss += "1- Doctor Number\n";
        }
         String gender = female.isSelected() ? female.getText() : male.getText();
        if (doctorNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            con = ConnectionDatabase.connect();
            try {
                pre = con.prepareStatement("UPDATE Doctor SET nameDoctor = ?, moblie = ?, address = ?,  gender = ? WHERE id = ?");
                pre.setString(1, doctorName.getText());
                pre.setString(2, phoneNumber.getText());
                pre.setString(3, address.getText());
                pre.setString(4, gender);
                pre.setInt(5, Integer.parseInt(doctorNumber.getText()));
                pre.executeUpdate();
                JOptionPane.showMessageDialog(null,"A Doctor has been updated successfully","updated",JOptionPane.INFORMATION_MESSAGE);
                Clear();
                doctorNumber.setEnabled(true);
                doctorName.setEnabled(false);
                phoneNumber.setEnabled(false);
                address.setEnabled(false);
                male.setEnabled(false);
                female.setEnabled(false);
                
            } catch (SQLException ex) {
                
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
    }

    private void Delete() {
        String miss = "You forgot to enter the following data: \n";
        if (doctorNumber.getText().isEmpty()) {
            miss += "1- Docor Number\n";
        }
        if (doctorNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            con = ConnectionDatabase.connect();
            try {
                pre = con.prepareStatement("DELETE FROM Doctor WHERE id = ?");
                pre.setInt(1, Integer.parseInt(doctorNumber.getText()));
                pre.execute();
                JOptionPane.showMessageDialog(null,"A Doctor has been Deleted successfully","Deleted",JOptionPane.INFORMATION_MESSAGE);
                Clear();
                doctorNumber.setEnabled(true);
                doctorName.setEnabled(false);
                phoneNumber.setEnabled(false);
                address.setEnabled(false);
                male.setEnabled(false);
                female.setEnabled(false);
                
            } catch (SQLException ex) {
                
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    
                }
            }
        }  
    }
    
    private void Clear() {
        doctorNumber.setText("");
        doctorName.setText("");
        phoneNumber.setText("");
        address.setText("");
        male.setSelected(false);
        female.setSelected(false);
    }


}
