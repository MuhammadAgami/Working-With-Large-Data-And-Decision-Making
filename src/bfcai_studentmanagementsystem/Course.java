
package bfcai_studentmanagementsystem;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Muhammad Agami
 */
public class Course extends javax.swing.JFrame {

    int choose;
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    public Course() {
        initComponents();
        InsertNameDoctor();
         choose = MainMenu.cour;
         if(choose == 2){
            this.setTitle("Update Course");
            buttonChange.setIcon(new ImageIcon("src\\image\\edit144.png"));
            addUpdateDelete1.setText("Update Course");
            CourseName.setEnabled(false);
            hoursNumber.setEnabled(false);
            hoursPrice.setEnabled(false);
            doctorOfcourse.setEnabled(false);
            fristSemester.setEnabled(false);
            secondSemester.setEnabled(false);
        }
        else if(choose == 3){
            this.setTitle("Delete Course");
            buttonChange.setIcon(new ImageIcon("src\\image\\delete144.png"));
            addUpdateDelete1.setText("Delete Course");
            CourseName.setEnabled(false);
            hoursNumber.setEnabled(false);
            hoursPrice.setEnabled(false);
            doctorOfcourse.setEnabled(false);
            fristSemester.setEnabled(false);
            secondSemester.setEnabled(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseNumber = new javax.swing.JTextField();
        hoursNumber = new javax.swing.JTextField();
        CourseName = new javax.swing.JTextField();
        hoursPrice = new javax.swing.JTextField();
        doctorOfcourse = new javax.swing.JComboBox<>();
        fristSemester = new javax.swing.JRadioButton();
        secondSemester = new javax.swing.JRadioButton();
        buttonChange = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addUpdateDelete1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hours Number");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hours Price");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor Of Course");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semester");

        courseNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        courseNumber.setToolTipText("");
        courseNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        courseNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                courseNumberKeyPressed(evt);
            }
        });

        hoursNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CourseName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNameActionPerformed(evt);
            }
        });

        hoursPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        doctorOfcourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fristSemester.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(fristSemester);
        fristSemester.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fristSemester.setForeground(new java.awt.Color(255, 255, 255));
        fristSemester.setText("First");

        secondSemester.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(secondSemester);
        secondSemester.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondSemester.setForeground(new java.awt.Color(255, 255, 255));
        secondSemester.setText("Second");
        secondSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondSemesterActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(courseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hoursPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(doctorOfcourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(hoursNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(fristSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(194, 194, 194)
                                            .addComponent(secondSemester)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorOfcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fristSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondSemester)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        addUpdateDelete1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addUpdateDelete1.setForeground(new java.awt.Color(255, 255, 255));
        addUpdateDelete1.setText("Add Course");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(addUpdateDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addUpdateDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1112, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseNameActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
        choose = MainMenu.cour;
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

    private void secondSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondSemesterActionPerformed

    private void courseNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseNumberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (courseNumber.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "The course number field is empty", "Data loss", JOptionPane.WARNING_MESSAGE);
            } else {
                 try {
                    con = ConnectionDatabase.connect();
                    pre = con.prepareStatement("SELECT * FROM course WHERE idCourse = ?");
                    pre.setInt(1, Integer.parseInt(courseNumber.getText()));
                    res = pre.executeQuery();
                    if (res.next()) {
                        courseNumber.setEnabled(false); 
                        CourseName.setText(res.getString(2));
                        CourseName.setEnabled(true);
                        hoursNumber.setText(res.getString(3));
                        hoursNumber.setEnabled(true);
                        hoursPrice.setText(res.getString(5));
                        hoursPrice.setEnabled(true);
                        doctorOfcourse.setSelectedItem(res.getString(4));
                        doctorOfcourse.setEnabled(true);
                        String semester = res.getString(6);

                        if (semester.equals(secondSemester.getText())) {
                            secondSemester.setSelected(true);
                        } else {
                            fristSemester.setSelected(true);
                        }
                            fristSemester.setEnabled(true);
                            secondSemester.setEnabled(true);
                    } else {
                            JOptionPane.showMessageDialog(null, "This course number does not exist", "Unavailable", JOptionPane.WARNING_MESSAGE);
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

    }//GEN-LAST:event_courseNumberKeyPressed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CourseName;
    private javax.swing.JLabel addUpdateDelete1;
    private javax.swing.JButton buttonChange;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField courseNumber;
    private javax.swing.JComboBox<String> doctorOfcourse;
    private javax.swing.JRadioButton fristSemester;
    private javax.swing.JTextField hoursNumber;
    private javax.swing.JTextField hoursPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton secondSemester;
    // End of variables declaration//GEN-END:variables

   private void Insert() {
        String miss = "You forgot to enter the following data: \n";
        if (courseNumber.getText().isEmpty()) {
            miss += "1- Course Number\n";
        }
        if (CourseName.getText().isEmpty()) {
            miss += "2- Course Name\n";
        }
        if (hoursNumber.getText().isEmpty()) {
            miss += "3- Hours Number\n";
        }
        if (hoursPrice.getText().isEmpty()) {
            miss += "4- Hours price\n";
        }
        if (doctorOfcourse.getSelectedIndex() == -1) {
            miss += "5- Doctor of Course\n";
        }
        if (!fristSemester.isSelected() && !secondSemester.isSelected()) {
            miss += "6- Semester\n";
        }
        int semester = 1;
        if(secondSemester.isSelected()){
            semester = 2;
        };
        if (courseNumber.getText().isEmpty() || CourseName.getText().isEmpty() || hoursNumber.getText().isEmpty() || hoursPrice.getText().isEmpty() || doctorOfcourse.getSelectedIndex() == -1 || (!fristSemester.isSelected() && !secondSemester.isSelected())) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                con = ConnectionDatabase.connect();
                pre = con.prepareStatement("SELECT * FROM course WHERE idCourse = ?");
                pre.setInt(1, Integer.parseInt(courseNumber.getText()));
                res = pre.executeQuery();
                if (res.next()) {
                    JOptionPane.showMessageDialog(null, "The Course number already exists", "Existing", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    pre = con.prepareStatement("INSERT INTO course VALUES (?, ?, ?, ?, ?, ?)");
                    pre.setInt(1, Integer.parseInt(courseNumber.getText()));
                    pre.setString(2, CourseName.getText()); 
                    pre.setInt(3, Integer.parseInt(hoursNumber.getText()));
                    pre.setString(4, (String) doctorOfcourse.getSelectedItem());
                    pre.setInt(5, Integer.parseInt(hoursPrice.getText()));
                    pre.setInt(6, semester);
                    pre.execute();
                    JOptionPane.showMessageDialog(null,"A Course has been added successfully","Added",JOptionPane.INFORMATION_MESSAGE);
                    Clear();
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

    private void Update() {
        String miss = "You forgot to enter the following data: \n";
        if (courseNumber.getText().isEmpty()) {
            miss += "1- Course Number\n";
        }
        int semester = 1;
        if(secondSemester.isSelected()){
            semester = 2;
        }
        if (courseNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                con = ConnectionDatabase.connect();
                pre = con.prepareStatement("UPDATE course SET nameCourse = ?, hourNumber = ?, nameDoctor = ?, salaryOnHour = ?, semester = ? WHERE idCourse = ?");
                pre.setString(1, CourseName.getText());
                pre.setString(2, hoursNumber.getText());
                pre.setString(3, (String) doctorOfcourse.getSelectedItem());
                pre.setInt(4, Integer.parseInt(hoursPrice.getText()));
                pre.setInt(5, semester);
                pre.setInt(6, Integer.parseInt(courseNumber.getText()));
                pre.executeUpdate();
                JOptionPane.showMessageDialog(null, "A Course has been updated successfully", "Updated", JOptionPane.INFORMATION_MESSAGE);
                Clear();
                courseNumber.setEnabled(true);
                CourseName.setEnabled(false);
                hoursNumber.setEnabled(false);
                doctorOfcourse.setEnabled(false);
                fristSemester.setEnabled(false);
                secondSemester.setEnabled(false);
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

    private void Delete() {
        String miss = "You forgot to enter the following data: \n";
        if (courseNumber.getText().isEmpty()) {
            miss += "1- Course Number\n";
        }
        if (courseNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, miss, "Data loss", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                con = ConnectionDatabase.connect();
                pre = con.prepareStatement("DELETE FROM course WHERE idCourse = ?");
                pre.setInt(1, Integer.parseInt(courseNumber.getText()));
                pre.execute();
                JOptionPane.showMessageDialog(null, "A Course has been Deleted successfully", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                Clear();
                courseNumber.setEnabled(true);
                CourseName.setEnabled(false);
                hoursNumber.setEnabled(false);
                doctorOfcourse.setEnabled(false);
                fristSemester.setEnabled(false);
                secondSemester.setEnabled(false);
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

    private void InsertNameDoctor() {
        con = ConnectionDatabase.connect();
        try {
            pre = con.prepareStatement("select nameDoctor from Doctor");
            res = pre.executeQuery();
            while (res.next()) {
                doctorOfcourse.addItem(res.getString("nameDoctor"));
            }
            doctorOfcourse.setSelectedIndex(-1);
        } catch (SQLException ex) {
            ;
        } finally {
            try {
                  con.close();
            } catch (SQLException ex) {
               ;
            }
        }
    }

    private void Clear() {
        courseNumber.setText("");
        CourseName.setText("");
        hoursNumber.setText("");
        hoursPrice.setText("");
        doctorOfcourse.setSelectedIndex(-1);
        fristSemester.setSelected(false);
        secondSemester.setSelected(false);
    }

}
