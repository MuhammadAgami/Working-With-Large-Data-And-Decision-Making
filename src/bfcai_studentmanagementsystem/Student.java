package bfcai_studentmanagementsystem;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Muhammad Agami
 */
public class Student extends javax.swing.JFrame {
    int choose;
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    public Student() {
        initComponents();
         choose = MainMenu.ch;
         if(choose == 2){
            this.setTitle("Update Student");
            buttonChange.setIcon(new ImageIcon("src\\image\\edit144.png"));
            addUpdateDelete.setText("Update Student");
            name.setEnabled(false);
            phoneNumber.setEnabled(false);
            male.setEnabled(false);
            female.setEnabled(false);
        }
        else if(choose == 3){
            this.setTitle("Delete Student");
            buttonChange.setIcon(new ImageIcon("src\\image\\delete144.png"));
            addUpdateDelete.setText("Delete Student");
            name.setEnabled(false);
            phoneNumber.setEnabled(false);
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
        StudentNumberLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        buttonChange = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addUpdateDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        StudentNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StudentNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        StudentNumberLabel.setText("Student Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gander");

        name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        phoneNumber.setToolTipText("");
        phoneNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancle144.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(StudentNumberLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(male)
                        .addGap(167, 167, 167)
                        .addComponent(female))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentNumberLabel)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male)
                            .addComponent(female))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        addUpdateDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addUpdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        addUpdateDelete.setText("Add Student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addUpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
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
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

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

        setSize(new java.awt.Dimension(1128, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.setVisible(false);
        main.Doctor.setEnabled(false);
        main.Student.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
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

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "The id field is empty", "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("SELECT * FROM Student WHERE id = ?");
                    pre.setInt(1, Integer.parseInt(id.getText()));
                    res = pre.executeQuery();
                    if (res.next()) {
                        id.setEnabled(false);
                        name.setText(res.getString(2));
                        name.setEnabled(true);
                        phoneNumber.setText(res.getString(4));
                        phoneNumber.setEnabled(true);

                        String gender = res.getString(5);

                        if (gender.equals(female.getText())) {
                            female.setSelected(true);
                        } else {
                            male.setSelected(true);
                        }
                        male.setEnabled(true);
                        female.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "This student number does not exist", "Unavailable", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter ddd a number only", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                           con.close();
                    } catch (SQLException ex) {
                    }
                }
            }
        }

    }//GEN-LAST:event_idKeyPressed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudentNumberLabel;
    private javax.swing.JLabel addUpdateDelete;
    private javax.swing.JButton buttonChange;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables

    private void Insert() {
            String miss = "You forgot to enter the following data: \n";
            if (id.getText().isEmpty()) {
                miss += "1- Student Number\n";
            }
            if (name.getText().isEmpty()) {
                miss += "2- Student Name\n";
            }
            if (phoneNumber.getText().isEmpty()) {
                miss += "3- Phone Number\n";
            }
            if (!male.isSelected() && !female.isSelected()) {
                miss += "4- Gender\n";
            }
            String gender = female.isSelected() ? female.getText() : male.getText();
            if (id.getText().isEmpty() || name.getText().isEmpty() || phoneNumber.getText().isEmpty() || (!male.isSelected() && !female.isSelected())) {
                JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("SELECT * FROM Student WHERE id = ?");
                    pre.setInt(1, Integer.parseInt(id.getText()));
                    res = pre.executeQuery();
                    if (res.next()) {
                        JOptionPane.showMessageDialog(null, "The student number already exists", "Existing", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        pre = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        pre.setInt(1, Integer.parseInt(id.getText()));
                        pre.setString(2, name.getText());
                        pre.setInt(3, 123);
                        pre.setString(4, phoneNumber.getText());
                        pre.setString(5, gender);
                        pre.setInt(6, 0);
                        pre.setInt(7, 0);
                        pre.setInt(8, 0);
                        pre.setInt(9, 0);
                        pre.execute();
                        JOptionPane.showMessageDialog(null, "A student has been added successfully", "Added", JOptionPane.INFORMATION_MESSAGE);
                        Clear();
                    }
                } catch (SQLException | NumberFormatException ex ) {
                    StudentNumberLabel.setForeground(Color.ORANGE);
                    JOptionPane.showMessageDialog(null,"Please enter a number only", "Error", JOptionPane.ERROR_MESSAGE);
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
            if (id.getText().isEmpty()) {
                miss += "1- Student Number\n";
            }
            String gender = female.isSelected() ? female.getText() : male.getText();
            if (id.getText().isEmpty() || name.getText().isEmpty() || phoneNumber.getText().isEmpty() || (!male.isSelected() && !female.isSelected())) {
                JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("UPDATE Student SET name = ?, mobile = ?, gender = ? WHERE id = ?");
                    pre.setString(1, name.getText());
                    pre.setString(2, phoneNumber.getText());
                    pre.setString(3, gender);
                    pre.setInt(4, Integer.parseInt(id.getText()));
                    pre.executeUpdate();
                    JOptionPane.showMessageDialog(null,  "A student has been updated successfully", "Updated", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                    id.setEnabled(true);
                    name.setEnabled(false);
                    phoneNumber.setEnabled(false);
                    male.setEnabled(false);
                    female.setEnabled(false);
                } catch (SQLException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Please enter a number only", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                            con.close();    
                    } catch (SQLException ex) {
                    }
                }
            }
        }

        private void Delete() {
            String miss = "You forgot to enter the following data: \n";
            if (id.getText().isEmpty()) {
                miss += "1- Student Number\n";
            }
            if (id.getText().isEmpty() || name.getText().isEmpty() || phoneNumber.getText().isEmpty() || (!male.isSelected() && !female.isSelected())) {
                JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("DELETE FROM Student WHERE id = ?");
                    pre.setInt(1, Integer.parseInt(id.getText()));
                    pre.executeUpdate();
                    JOptionPane.showMessageDialog(null, "A student has been Deleted successfully", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                    Clear();
                    id.setEnabled(true);
                    name.setEnabled(false);
                    phoneNumber.setEnabled(false);
                    male.setEnabled(false);
                    female.setEnabled(false);

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


        private void Clear() {
            id.setText("");
            name.setText("");
            phoneNumber.setText("");
            male.setSelected(false);
            female.setSelected(false);
        }
}
