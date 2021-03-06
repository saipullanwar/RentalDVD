/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldvd;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hiccu
 */
public class formTransaksi extends javax.swing.JFrame {
    
    String judulPinjam[]={"No","ID Pinjam","Kode Film","TGL. Pinjam","TGL. Kembali","Status","Keterangan","Denda"};
    int LebarPinjam[]={70,120,250,110,200,120,120,120};
    String SQLPinjam="SELECT*FROM detail_pinjam ORDER BY IDPinjam DESC";
    DefaultTableModel List;
    
    /**
     * Creates new form formTransaksi
     */
    public formTransaksi() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        new ConfigDB().tampilTabel(judulPinjam, SQLPinjam, JTablePinjam);
        new ConfigDB().aturLebarKolom(JTablePinjam, LebarPinjam);
        List= new DefaultTableModel();
        JTableList.setModel(List);
        List.addColumn("ID Anggota");
        List.addColumn("Nama Anggota");
        List.addColumn("Kode Film");
        List.addColumn("Judul");
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        JLabel5 = new javax.swing.JLabel();
        txtIDPinjam = new javax.swing.JTextField();
        txtIDAnggota = new javax.swing.JTextField();
        txtNamAnggota = new javax.swing.JTextField();
        txtKodeFilm = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        JLabel6 = new javax.swing.JLabel();
        JLabel7 = new javax.swing.JLabel();
        JLabel8 = new javax.swing.JLabel();
        txtTglPinjam = new com.toedter.calendar.JDateChooser();
        txtTglKembali = new com.toedter.calendar.JDateChooser();
        cmbKet = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPinjam = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableList = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTablePinjam = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtDenda = new javax.swing.JTextField();
        JLabel9 = new javax.swing.JLabel();
        JNo = new javax.swing.JLabel();

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

        JLabel1.setText("ID Pinjam");

        JLabel2.setText("ID Anggota");

        JLabel3.setText("Nama Anggota");

        JLabel4.setText("Kode Film");

        JLabel5.setText("Judul Film");

        txtIDPinjam.setName("txtIDPinjam"); // NOI18N
        txtIDPinjam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDPinjamKeyPressed(evt);
            }
        });

        txtIDAnggota.setName("txtIDAnggota"); // NOI18N

        txtNamAnggota.setName("txtIDNamAnggota"); // NOI18N

        txtKodeFilm.setName("txtKodeFilm"); // NOI18N

        txtJudul.setName("txtJudul"); // NOI18N

        btnCari.setText("Cari Tunggakan");
        btnCari.setName("btnCari"); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        JLabel6.setText("Tanggal Pesan");

        JLabel7.setText("Tanggak Kembali");

        JLabel8.setText("Keterangan");

        txtTglPinjam.setDateFormatString("yyyy-MM-dd");
        txtTglPinjam.setName("txtTglPinjam"); // NOI18N

        txtTglKembali.setDateFormatString("yyyy-MM-dd");
        txtTglKembali.setName("txtTglKembali"); // NOI18N

        cmbKet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pinjam", "Perpanjangan", "Kembali" }));
        cmbKet.setName("cmbKet"); // NOI18N

        btnTambah.setText("Tambah");
        btnTambah.setName("btnTambah"); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setName("btnClear"); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPinjam.setText("Proses Pinjam");
        btnPinjam.setName("btnPinjam"); // NOI18N
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali/Perpanjangan");
        btnKembali.setName("btnKembali"); // NOI18N
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        JTableList.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableList.setName("JTableList"); // NOI18N
        jScrollPane2.setViewportView(JTableList);

        JTablePinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        JTablePinjam.setName("JTablePinjam"); // NOI18N
        JTablePinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablePinjamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTablePinjam);

        btnView.setText("View Detail Pinjaman");
        btnView.setName("btnView"); // NOI18N
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.setName("btnRefresh"); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtDenda.setText("0");
        txtDenda.setName("txtDenda"); // NOI18N

        JLabel9.setText("Denda");

        JNo.setText("-");
        JNo.setName("JNo"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel1)
                            .addComponent(JLabel2)
                            .addComponent(JLabel3)
                            .addComponent(JLabel4)
                            .addComponent(JLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNamAnggota)
                            .addComponent(txtKodeFilm)
                            .addComponent(txtJudul)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIDAnggota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(txtIDPinjam, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel6)
                                    .addComponent(JLabel7)
                                    .addComponent(JLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbKet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTglKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JNo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel1)
                                .addComponent(txtIDPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel6))
                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel2)
                            .addComponent(txtIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari)
                            .addComponent(JLabel7)))
                    .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel3)
                    .addComponent(txtNamAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel8)
                    .addComponent(cmbKet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel4)
                    .addComponent(txtKodeFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel5)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPinjam)
                    .addComponent(btnKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JNo)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnRefresh)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel9))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDPinjamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDPinjamKeyPressed
        // TODO add your handling code here:
        
       new ConfigDB().cariData(judulPinjam,"SELECT*FROM detail_pinjam WHERE IDPinjam='"+txtIDPinjam.getText()+"'", JTablePinjam); 
       new ConfigDB().aturLebarKolom(JTablePinjam, LebarPinjam); 
    }//GEN-LAST:event_txtIDPinjamKeyPressed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    String SQL ="SELECT*FROM view_pinjam WHERE IDAnggota='"+txtIDAnggota.getText()+"' AND status='FALSE'";
        int jumlah=new ConfigDB().jumlahRecord(SQL);
        if (jumlah==0){
            JOptionPane.showMessageDialog(null,"Tidak ada tunggakan Film yang belum dikembalikan");
        } else{
            JOptionPane.showMessageDialog(null,"Ada "+String.valueOf(jumlah) +" tunggakan Film yang belum dikembalikan"); 
 }   
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
    try {
        if (txtIDPinjam.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"ID Pinjam belum diisi");
        txtIDPinjam.requestFocus();
    }else
        if (txtIDAnggota.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"ID Anggota belum diisi");
        txtIDAnggota.requestFocus();
    }else
        if (txtKodeFilm.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Kode Film belum diisi");
            txtKodeFilm.requestFocus();
    } else {
            String SQLPinjam="INSERT INTO pinjam VALUES('"+txtIDPinjam.getText()+"','"+txtIDAnggota.getText()+"','0')";
            new ConfigDB().simpanData(SQLPinjam);
    int jum=JTableList.getRowCount();
        for (int i = 0; i < 10; i++) {
        SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd",
        Locale.getDefault());
        String TGLPinjam =p.format(txtTglPinjam.getDate());
        SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd",
        Locale.getDefault());
        String TGLKembali =k.format(txtTglKembali.getDate());
        String SQLDetail="INSERT INTO detail_pinjam VALUES('0','"+txtIDPinjam.getText()+"','"+String.valueOf(JTableList.getValueAt(i,2))

        +"','"+TGLPinjam+"','"+TGLKembali+"','0','"+String.valueOf(cmbKet.getSelectedItem
        ()) +
        "','0')";
        new ConfigDB().simpanData(SQLDetail);
    }
        new ConfigDB().tampilTabel(judulPinjam, SQLPinjam, JTablePinjam);
        new ConfigDB().aturLebarKolom(JTablePinjam, LebarPinjam);
    }
        } catch (Exception e) {
 }
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
    int JUMLAH=JTableList.getRowCount();
        for (int i = 0; i<JUMLAH; i++) {
            List.removeRow(i);

    }
        txtIDAnggota.setText(null);
        txtIDPinjam.setText(null);
        txtNamAnggota.setText(null);
        txtKodeFilm.setText(null);
        txtJudul.setText(null);
        txtTglKembali.setDate(null);
        txtTglPinjam.setDate(null);
        txtDenda.setText("0");
        JNo.setText("-");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    try {
        SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd",
        Locale.getDefault());
        String TGLPinjam =p.format(txtTglPinjam.getDate());
        SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd",
        Locale.getDefault());
        String TGLKembali =k.format(txtTglKembali.getDate()); 
    if (cmbKet.getSelectedItem()=="Kembali"){

        String SQL1="UPDATE detail_pinjam SET IDPinjam='"+txtIDPinjam.getText()+"', KodeFilm='"+txtKodeFilm.getText()
        +"', tgl_pinjam='"+TGLPinjam+"', tgl_kembali='"+TGLKembali+"',status='1', keterangan='"+String.valueOf(cmbKet.getSelectedItem())
        +"', denda='"+txtDenda.getText()+"' WHERE no='"+JNo.getText()+"'";
        new ConfigDB().ubahData(SQL1);
    } else {
        String SQL2="UPDATE detail_pinjam SET IDPinjam='"+txtIDPinjam.getText()+"', KodeFilm='"+txtKodeFilm.getText()
        +"', tgl_pinjam='"+TGLPinjam+"', tgl_kembali='"+TGLKembali+"',status='0', keterangan='"+String.valueOf(cmbKet.getSelectedItem())
        +"', denda='"+txtDenda.getText()+"' WHERE no='"+JNo.getText()+"'";
        new ConfigDB().ubahData(SQL2);

    }
        new ConfigDB().tampilTabel(judulPinjam, SQLPinjam, JTablePinjam);
        new ConfigDB().aturLebarKolom(JTablePinjam, LebarPinjam);
    } catch (Exception e) {
 }
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        new formView().setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        new ConfigDB().tampilTabel(judulPinjam, SQLPinjam, JTablePinjam);
        new ConfigDB().aturLebarKolom(JTablePinjam, LebarPinjam);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void JTablePinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablePinjamMouseClicked
        // TODO add your handling code here:
    try {
        int i= JTablePinjam.getSelectedRow();
        JNo.setText(String.valueOf(JTablePinjam.getValueAt(i, 0)));
        txtIDPinjam.setText(String.valueOf(JTablePinjam.getValueAt(i, 1)));
        txtKodeFilm.setText(String.valueOf(JTablePinjam.getValueAt(i, 2)));
        cmbKet.setSelectedItem(String.valueOf(JTablePinjam.getValueAt(i, 6)));
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        txtTglPinjam.setDate(dt.parse(String.valueOf(JTablePinjam.getValueAt(i, 3))));
        txtTglKembali.setDate(dt.parse(String.valueOf(JTablePinjam.getValueAt(i, 4))));

        Statement st = new ConfigDB().koneksi.createStatement();
        ResultSet rs = st.executeQuery("SELECT*FROM pinjam WHERE IDPinjam='"+txtIDPinjam.getText()+"'");
    if (rs.next()){
        txtIDAnggota.setText(rs.getString("IDAnggota"));
    }
        ResultSet ra =st.executeQuery("SELECT*FROM anggota WHERE IDAnggota='"+txtIDAnggota.getText()+"'");
    if (ra.next()){
        txtNamAnggota.setText(ra.getString("nama"));
    }
        ResultSet rk =st.executeQuery("SELECT*FROM film WHERE KodeFilm='"+txtKodeFilm.getText()+"'");
    if (rk.next()){
        txtJudul.setText(rk.getString("judul"));
    }
    } catch (Exception e) {
 }
    }//GEN-LAST:event_JTablePinjamMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
         try {
            String
            isi[]={txtIDAnggota.getText(),txtNamAnggota.getText(),txtKodeFilm.getText(),txtJudul.getText()};
        List.addRow(isi);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
 }
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(formTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JLabel JLabel8;
    private javax.swing.JLabel JLabel9;
    private javax.swing.JLabel JNo;
    private javax.swing.JTable JTableList;
    private javax.swing.JTable JTablePinjam;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbKet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIDAnggota;
    private javax.swing.JTextField txtIDPinjam;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKodeFilm;
    private javax.swing.JTextField txtNamAnggota;
    private com.toedter.calendar.JDateChooser txtTglKembali;
    private com.toedter.calendar.JDateChooser txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
