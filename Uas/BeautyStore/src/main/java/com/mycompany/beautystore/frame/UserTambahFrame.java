/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.beautystore.frame;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserTambahFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserTambahFrame.class.getName());

    private int idUser = 0;

    public UserTambahFrame() {
              initComponents();
        setLocationRelativeTo(null);

        cLevel.removeAllItems();
        cLevel.addItem("Admin");
        cLevel.addItem("Kasir");


        }

    public void setData(int id, String nama, String username, String password, String level) {
        this.idUser = id;
        eNama.setText(nama);
        eUsername.setText(username);
        ePassword.setText(password);
        cLevel.setSelectedItem(level);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eUsername = new javax.swing.JTextField();
        ePassword = new javax.swing.JTextField();
        cLevel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bSimpan = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        eNama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Username");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Password");

        ePassword.addActionListener(this::ePasswordActionPerformed);

        cLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir" }));
        cLevel.addActionListener(this::cLevelActionPerformed);

        jLabel8.setFont(new java.awt.Font("KG Red Hands", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("DATA USER");

        jLabel9.setText("======================================");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Level");

        jLabel7.setText("----------------------------------------");

        jLabel4.setText("======================================");

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(this::bSimpanActionPerformed);

        bBatal.setText("Batal");
        bBatal.addActionListener(this::bBatalActionPerformed);

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSimpan)
                    .addComponent(cLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBatal)
                    .addComponent(jLabel9))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(bSimpan)
                .addGap(18, 18, 18)
                .addComponent(bBatal)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePasswordActionPerformed
     bSimpan.doClick();
    }//GEN-LAST:event_ePasswordActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
    String nama = eNama.getText().trim();
    String username = eUsername.getText().trim();
    String password = ePassword.getText().trim();
    String level = cLevel.getSelectedItem().toString();

    if (nama.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
        return;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_kosmetik",
                "root",
                "");

        PreparedStatement ps;

        if (idUser == 0) {

            String sql = "INSERT INTO user(nama, username, password, level) VALUES (?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, level);

        } else {

            String sql = "UPDATE user SET nama=?, username=?, password=?, level=? WHERE id_user=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, level);
            ps.setInt(5, idUser);

        }

        ps.executeUpdate();
        ps.close();
        conn.close();

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

        new UserTampilFrame().setVisible(true);
        dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }

    }//GEN-LAST:event_bSimpanActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
     int jawab = JOptionPane.showConfirmDialog(
            this,
            "Batalkan input data?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION);

    if (jawab == JOptionPane.YES_OPTION) {
        new UserTampilFrame().setVisible(true);
        dispose();
    }
    }//GEN-LAST:event_bBatalActionPerformed

    private void cLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLevelActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserTambahFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bSimpan;
    private javax.swing.JComboBox<String> cLevel;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField ePassword;
    private javax.swing.JTextField eUsername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
