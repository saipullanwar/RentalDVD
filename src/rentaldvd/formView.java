/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaldvd;

import javax.swing.JOptionPane; // membuat pesan dialog
import javax.swing.JTable;
import java.sql.*;

/**
 *
 * @author hiccu
 */
public class formView extends javax.swing.JFrame {
    
    String judul[]={"ID Pinjam","ID Anggota","Nama","Kode Film","Judul","Tanggal Pinjam","Tanggal Kembali","Status","Keterangan","Denda"};
    String SQLView="SELECT*FROM view_pinjam ORDER BY tgl_pinjam DESC";
    int LebarKolom[]={100,100,220,100,200,110,110,100,180,140};

    /**
     * Creates new form formView
     */
    public formView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        new ConfigDB().tampilTabel(judul, SQLView, JTableView);
        new ConfigDB().aturLebarKolom(JTableView, LebarKolom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel1 = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableView = new javax.swing.JTable();
        txtRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabel1.setText("Pencarian Nama Anggota");
        JLabel1.setName("JLabel1"); // NOI18N

        txtPencarian.setName("txtPencarian"); // NOI18N
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPencarianKeyPressed(evt);
            }
        });

        JTableView.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableView.setName("JTableView"); // NOI18N
        jScrollPane1.setViewportView(JTableView);

        txtRefresh.setText("Refresh");
        txtRefresh.setName("txtRefresh"); // NOI18N
        txtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRefresh)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyPressed
        // TODO add your handling code here:
        String SQL="SELECT*FROM view_pinjam WHERE nama like'%"+txtPencarian.getText()+"%'";
        new ConfigDB().cariData(judul, SQL, JTableView);
        new ConfigDB().aturLebarKolom(JTableView, LebarKolom);
    }//GEN-LAST:event_txtPencarianKeyPressed

    private void txtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefreshActionPerformed
        // TODO add your handling code here:
        new ConfigDB().tampilTabel(judul, SQLView, JTableView);
        new ConfigDB().aturLebarKolom(JTableView, LebarKolom);
    }//GEN-LAST:event_txtRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(formView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JTable JTableView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JButton txtRefresh;
    // End of variables declaration//GEN-END:variables
}
