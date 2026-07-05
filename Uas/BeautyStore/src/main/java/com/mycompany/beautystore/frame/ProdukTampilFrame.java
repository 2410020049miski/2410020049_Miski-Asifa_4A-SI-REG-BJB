/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.beautystore.frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class ProdukTampilFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProdukTampilFrame.class.getName());

    /**
     * Creates new form ProdukTampilFrame
     */
    public ProdukTampilFrame() {
         initComponents();
        setLocationRelativeTo(null);
        tampilData();  
    }

    private void tampilData() {
    
    DefaultTableModel model = (DefaultTableModel) tProduk.getModel();
    model.setRowCount(0);

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = java.sql.DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_kosmetik",
                "root",
                ""
        );

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM produk");

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getInt("id_produk"),
                rs.getString("nama_produk"),
                rs.getString("merk"),
                rs.getString("kategori"),
                rs.getDouble("harga"),
                rs.getInt("stok")
            });
        }

        rs.close();
        st.close();
        conn.close();

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this, e.getMessage());

    }

    }
    private void cariData() {

    DefaultTableModel model = (DefaultTableModel) tProduk.getModel();
    model.setRowCount(0);

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_kosmetik",
                "root",
                "");

        String sql = "SELECT * FROM produk WHERE nama_produk LIKE ? "
                   + "OR merk LIKE ? "
                   + "OR kategori LIKE ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        String cari = "%" + eCari.getText().trim() + "%";

        ps.setString(1, cari);
        ps.setString(2, cari);
        ps.setString(3, cari);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            model.addRow(new Object[]{
                rs.getInt("id_produk"),
                rs.getString("nama_produk"),
                rs.getString("merk"),
                rs.getString("kategori"),
                rs.getDouble("harga"),
                rs.getInt("stok")
            });

        }

        rs.close();
        ps.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProduk = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        eCari = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("======================================");

        jLabel5.setText("======================================");

        jLabel6.setFont(new java.awt.Font("KG Red Hands", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("DATA PRODUK KOSMETIK");

        bTambah.setForeground(new java.awt.Color(255, 102, 102));
        bTambah.setText("Tambah");
        bTambah.addActionListener(this::bTambahActionPerformed);

        bUbah.setForeground(new java.awt.Color(255, 102, 102));
        bUbah.setText("Ubah");
        bUbah.addActionListener(this::bUbahActionPerformed);

        bHapus.setForeground(new java.awt.Color(255, 102, 102));
        bHapus.setText("Hapus");
        bHapus.addActionListener(this::bHapusActionPerformed);

        bRefresh.setForeground(new java.awt.Color(255, 102, 102));
        bRefresh.setText("Refresh");
        bRefresh.addActionListener(this::bRefreshActionPerformed);

        bTutup.setForeground(new java.awt.Color(255, 102, 102));
        bTutup.setText("Tutup");
        bTutup.addActionListener(this::bTutupActionPerformed);

        tProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Produk", "Nama Produk", "Merk", "kategori", "Harga", "Stok"
            }
        ));
        jScrollPane2.setViewportView(tProduk);

        jLabel1.setText("Cari :");

        eCari.setToolTipText("");
        eCari.addActionListener(this::eCariActionPerformed);

        bCari.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bCari.setText("🔍");
        bCari.setActionCommand("");
        bCari.addActionListener(this::bCariActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eCari, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(bRefresh)
                    .addComponent(bTutup)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bHapus, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCari))
                .addGap(17, 17, 17)
                .addComponent(bTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTutup)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        new ProdukTambahFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        new MenuUtamaFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
    
    tampilData();

    JOptionPane.showMessageDialog(this,
            "Data berhasil direfresh");
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed

        int baris = tProduk.getSelectedRow();

        if (baris == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah");
            return;
        }

        int id = Integer.parseInt(tProduk.getValueAt(baris,0).toString());
        String nama = tProduk.getValueAt(baris,1).toString();
        String merk = tProduk.getValueAt(baris,2).toString();
        String kategori = tProduk.getValueAt(baris,3).toString();
        double harga = Double.parseDouble(tProduk.getValueAt(baris,4).toString());
        int stok = Integer.parseInt(tProduk.getValueAt(baris,5).toString());

        ProdukTambahFrame form = new ProdukTambahFrame();
        form.setData(id, nama, merk, kategori, harga, stok);
        form.setVisible(true);

        dispose(); 
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
    int baris = tProduk.getSelectedRow();

    if (baris == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus");
        return;
    }

    int jawab = JOptionPane.showConfirmDialog(
            this,
            "Yakin ingin menghapus?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION);

    if (jawab == JOptionPane.YES_OPTION) {
        try {
            int id = Integer.parseInt(tProduk.getValueAt(baris, 0).toString());

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_kosmetik",
                    "root",
                    "");

            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM produk WHERE id_produk=?");

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            conn.close();

            JOptionPane.showMessageDialog(this, "Produk berhasil dihapus");
            tampilData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
 
    }//GEN-LAST:event_bHapusActionPerformed

    private void eCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eCariActionPerformed
    
    bCariActionPerformed(evt);
    }//GEN-LAST:event_eCariActionPerformed

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
    
    if (eCari.getText().trim().isEmpty()) {
        tampilData();
    } else {
        cariData();
    }

    }//GEN-LAST:event_bCariActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ProdukTampilFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTutup;
    private javax.swing.JButton bUbah;
    private javax.swing.JTextField eCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tProduk;
    // End of variables declaration//GEN-END:variables
}
