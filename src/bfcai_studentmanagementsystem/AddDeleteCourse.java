
package bfcai_studentmanagementsystem;
import java.awt.Color;
import java.awt.Component;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Muhammad Agami
 */
public class AddDeleteCourse extends javax.swing.JFrame {
    MainMenu main = new MainMenu();
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    int val;
    public AddDeleteCourse() {
        initComponents();
        jTable1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
           public Component getTableCellRendererComponent(JTable jtable,Object value, boolean isSelected,boolean hasFocus, int row, int col){
               super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row, col);
               setBackground(Color.lightGray);
               setHorizontalAlignment(CENTER);
               return this;
           }
        });
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setDefaultRenderer(Object.class, centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registrationButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        installButton = new javax.swing.JButton();
        cancleButton = new javax.swing.JButton();
        PrintTableButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add & Delete Course For Student");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        registrationButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrationButton.setText("Registration");
        registrationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Number", "Course Name", "Hours Number", "Doctor of course", "Registar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        installButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        installButton.setText("Install");
        installButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        installButton.setEnabled(false);
        installButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installButtonActionPerformed(evt);
            }
        });

        cancleButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancleButton.setText("Cancle");
        cancleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancleButton.setEnabled(false);
        cancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleButtonActionPerformed(evt);
            }
        });

        PrintTableButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PrintTableButton.setText("Print");
        PrintTableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(registrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(PrintTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(installButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(installButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Add&Delete Course for student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1210, 783));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            try{
                String value = JOptionPane.showInputDialog(null,"Enter the student number","Delete course",JOptionPane.QUESTION_MESSAGE);
                val = Integer.parseInt(value);
                if(JOptionPane.OK_OPTION == 0) {
                    int result =  deleteCourseForStudent(val);
                    if(result == 1){
                        registrationButton.setEnabled(false);
                        deleteButton.setEnabled(false);
                        cancleButton.setEnabled(true);
                        installButton.setEnabled(true);
                        installButton.setText("Install delete");
                    } 
                }
            }
            catch(Exception e) { 
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        try{
            String value = JOptionPane.showInputDialog(null,"Enter the student number","Course registration",JOptionPane.QUESTION_MESSAGE);
            val = Integer.parseInt(value);
            if(JOptionPane.OK_OPTION == 0) {
                int result =  showDataOfTable(val);
                if(result == 1){
                    registrationButton.setEnabled(false);
                    deleteButton.setEnabled(false);
                    cancleButton.setEnabled(true);
                    installButton.setEnabled(true);
                    installButton.setText("Install Registration");
                }
            }
        }
        catch(Exception e) { 
        }
    }//GEN-LAST:event_registrationButtonActionPerformed

    private void cancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleButtonActionPerformed
                registrationButton.setEnabled(true);
                deleteButton.setEnabled(true);
                cancleButton.setEnabled(false);
                installButton.setEnabled(false);
                installButton.setText("Install");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
    }//GEN-LAST:event_cancleButtonActionPerformed

    private void installButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installButtonActionPerformed
        if(installButton.getText().equals("Install Registration")){
            installRegistration();
            
        }else{
            installDelete();
        }
    }//GEN-LAST:event_installButtonActionPerformed

    private void PrintTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTableButtonActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(AddDeleteCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintTableButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintTableButton;
    private javax.swing.JButton cancleButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton installButton;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton registrationButton;
    // End of variables declaration//GEN-END:variables

    private int showDataOfTable(int id) {
        con = ConnectionDatabase.connect();
        try {
            pre = con.prepareStatement("SELECT * FROM Student WHERE id = ?");
            pre.setInt(1, id);
            res = pre.executeQuery();
            if(res.next()){
                pre = con.prepareStatement("SELECT * FROM course WHERE semester = ?");
                pre.setInt(1, MainMenu.semester);
                res = pre.executeQuery();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (res.next()) {
                    PreparedStatement newPre = con.prepareStatement("SELECT * FROM registerStuent WHERE idStudent = ? AND nameCourse = ?");
                    newPre.setInt(1, id); 
                    newPre.setString(2, res.getString(2));
                    ResultSet newRes = newPre.executeQuery();
                    if (newRes.next()) {
                        model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), true});
                    } else {
                        model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), false});
                    }
                    newRes.close(); 
                    newPre.close(); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "Student number not found", "unavailable", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        } catch (SQLException ex) {
  
        } finally {
            try {
                 con.close();  
            } catch (SQLException ex) {
                 
            }
        }
        return 1;
    }

    private int deleteCourseForStudent(int id) {
        con = ConnectionDatabase.connect();
        try {
            pre = con.prepareStatement("SELECT * FROM Student WHERE id = ?");
            pre.setInt(1, id);
            res = pre.executeQuery();
            if(res.next()){
                pre= con.prepareStatement("SELECT * FROM registerStuent WHERE idStudent = ?");
                pre.setInt(1, id); 
                res = pre.executeQuery();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (res.next()){
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString("nameDoctor"), true});
                }
            }else{
                JOptionPane.showMessageDialog(null, "Student number not found", "unavailable", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        } catch (SQLException ex) {
           
        } finally {
            try {
                 con.close();  
            } catch (SQLException ex) {
                 
            }
        }
        return 1;
    }

    
    
    
    private void installRegistration() {
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet res = null;
        try {
            con = ConnectionDatabase.connect();
            for (int row = 0; row < jTable1.getRowCount(); row++) {
                if (Boolean.TRUE.equals(jTable1.getModel().getValueAt(row, 4))) {
                    String nameCourse = jTable1.getModel().getValueAt(row, 1).toString();
                    pre = con.prepareStatement("SELECT * FROM registerStuent WHERE idStudent = ? AND nameCourse = ?");
                    pre.setInt(1, val);
                    pre.setString(2, nameCourse);
                    res = pre.executeQuery();
                    if (!res.next()) {
                        int idCourse = Integer.parseInt(jTable1.getModel().getValueAt(row, 0).toString());
                        String hours = jTable1.getModel().getValueAt(row, 2).toString();
                        String nameDoctor = jTable1.getModel().getValueAt(row, 3).toString();

                        pre = con.prepareStatement("INSERT INTO registerStuent (idStudent, idCourse, nameCourse, hour, nameDoctor, mark1, mark2) VALUES (?, ?, ?, ?, ?, ?, ?)");
                        pre.setInt(1, val);
                        pre.setInt(2, idCourse);
                        pre.setString(3, nameCourse);
                        pre.setString(4, hours);
                        pre.setString(5, nameDoctor);
                        pre.setInt(6, 0);
                        pre.setInt(7, 0);
                        pre.executeUpdate();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "The registry is installed", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (pre != null) {
                    pre.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(); 
            }
        }
    }

private void installDelete() {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;

    try {
        con = ConnectionDatabase.connect();
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Boolean.FALSE.equals(jTable1.getModel().getValueAt(row, 4))) {
                String nameCourse = jTable1.getModel().getValueAt(row, 1).toString();
       
                pre = con.prepareStatement("DELETE FROM registerStuent WHERE idStudent = ? AND nameCourse = ?");
                pre.setInt(1, val);
                pre.setString(2, nameCourse);
                pre.execute();
            }
        }
        JOptionPane.showMessageDialog(null, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        ex.printStackTrace(); // Handle the SQL exception properly, e.g., logging
    } finally {
        try {
            if (res != null) {
                res.close();
            }
            if (pre != null) {
                pre.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the SQL exception while closing connections
        }
    }
}



}
