/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aditya
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        rollnofield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        attlabel = new javax.swing.JLabel();
        gpalabel = new javax.swing.JLabel();
        dispnamelabel = new javax.swing.JLabel();
        dispdeptlabel = new javax.swing.JLabel();
        dispagelabel = new javax.swing.JLabel();
        dispattlabel = new javax.swing.JLabel();
        dispgpalabel = new javax.swing.JLabel();
        enterrollnolabel = new javax.swing.JLabel();
        studentnamelabel = new javax.swing.JLabel();
        deptlabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        displaybutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rollnofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnofieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DISPLAY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        attlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        attlabel.setText("Attendance % :");

        gpalabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gpalabel.setText("GPA :");

        enterrollnolabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterrollnolabel.setText("Enter Roll Number:");

        studentnamelabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentnamelabel.setText("Student Name :");

        deptlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deptlabel.setText("Department :");

        agelabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agelabel.setText("Age :");

        displaybutton.setText("Display");
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    displaybuttonActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentnamelabel)
                            .addComponent(attlabel)
                            .addComponent(agelabel)
                            .addComponent(deptlabel)
                            .addComponent(gpalabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dispnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispdeptlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispattlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispgpalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterrollnolabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rollnofield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(displaybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollnofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterrollnolabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deptlabel)
                    .addComponent(dispdeptlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispattlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gpalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispgpalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(displaybutton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Teacher t =new Teacher();
        t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public int isPresent(Statement st, int rollno) throws Exception
    {
        String search = "select rollno from student where rollno=";
        ResultSet rs = st.executeQuery(search+rollno);
        if(rs.next())
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    
    private void displaybuttonActionPerformed(java.awt.event.ActionEvent evt) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/mini";
        String uname = "root";
        String pass = "pass";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
        
        String sname, dept;
        int rollno, age;
        float attendance, marks;
        String temp;
        String select = "select * from student where rollno=";
        //System.out.print("Enter roll number of student who's record is to be deleted: ");
        temp = new String(rollnofield.getText());
        rollno = Integer.parseInt(temp);
        
        if(isPresent(st,rollno) == 1)
        {
            ResultSet rs = st.executeQuery(select+rollno);
            rs.next();
            
            rollno = rs.getInt("rollno");
            sname = rs.getString("sname");
            dept = rs.getString("dept");
            age = rs.getInt("age");
            attendance = rs.getFloat("attendance");
            marks = rs.getFloat("marks");
            
            dispnamelabel.setText(sname);
            dispagelabel.setText(Integer.toString(age));
            dispattlabel.setText(Float.toString(attendance));
            dispgpalabel.setText(Float.toString(marks));
            dispdeptlabel.setText(dept);
            
            //JOptionPane.showMessageDialog(this,"name: "+sname);
        }    
        else
        {
            JOptionPane.showMessageDialog(this,"Student not found.");
        }
        
        
    }

    private void rollnofieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnofieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnofieldActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel attlabel;
    private javax.swing.JLabel deptlabel;
    private javax.swing.JLabel dispagelabel;
    private javax.swing.JLabel dispattlabel;
    private javax.swing.JLabel dispdeptlabel;
    private javax.swing.JLabel dispgpalabel;
    private javax.swing.JButton displaybutton;
    private javax.swing.JLabel dispnamelabel;
    private javax.swing.JLabel enterrollnolabel;
    private javax.swing.JLabel gpalabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rollnofield;
    private javax.swing.JLabel studentnamelabel;
    // End of variables declaration//GEN-END:variables
}