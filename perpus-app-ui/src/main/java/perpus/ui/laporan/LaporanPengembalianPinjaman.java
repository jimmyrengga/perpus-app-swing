/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.ui.laporan;

import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import perpus.Main;

/**
 *
 * @author martinusadyh
 */
public class LaporanPengembalianPinjaman extends javax.swing.JPanel {

    public static final String PANEL_NAME = "Laporan Peminjaman / Pengembalian";
    private static LaporanPengembalianPinjaman panel;

    public static LaporanPengembalianPinjaman getPanel() {
        if (panel == null) {
            panel = new LaporanPengembalianPinjaman();
        }

        return panel;
    }

    /**
     * Creates new form LaporanPengembalianPinjaman
     */
    public LaporanPengembalianPinjaman() {
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

        rptPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbJnsTransaksi = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        dateChooserDr = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dateChooserSampai = new com.toedter.calendar.JDateChooser();
        btnRefresh = new javax.swing.JButton();

        rptPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout rptPanelLayout = new javax.swing.GroupLayout(rptPanel);
        rptPanel.setLayout(rptPanelLayout);
        rptPanelLayout.setHorizontalGroup(
            rptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rptPanelLayout.setVerticalGroup(
            rptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jLabel1.setText("Jenis Transaksi ");

        cmbJnsTransaksi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PEMINJAMAN", "PENGEMBALIAN" }));

        jLabel2.setText("Dari Tanggal");

        dateChooserDr.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("s/d");

        dateChooserSampai.setDateFormatString("dd/MM/yyyy");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus/img/reload.png"))); // NOI18N
        btnRefresh.setToolTipText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbJnsTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooserDr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooserSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cmbJnsTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(dateChooserDr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dateChooserSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(10, 10, 10)
                .addComponent(rptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbJnsTransaksi, dateChooserDr, dateChooserSampai, jLabel1, jLabel2, jLabel3});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        String jnsTransaksi = cmbJnsTransaksi.getSelectedItem().toString();
        Date tglMulai = dateChooserDr.getDate();
        Date tglSampai = dateChooserSampai.getDate();

        if (tglMulai != null && tglSampai != null) {
            JasperPrint jp = Main.getReportService().printLaporanPeminjaman(
                    jnsTransaksi, tglMulai, tglSampai);

            rptPanel.removeAll();
            rptPanel.setLayout(new BorderLayout());
            rptPanel.add(new JRViewer(jp), BorderLayout.CENTER);
        } else {
            JOptionPane.showMessageDialog(Main.getMainForm(),
                    "Silahkan pilih tanggal transaksi !!",
                    "Terjadi Kesalahan !!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox cmbJnsTransaksi;
    private com.toedter.calendar.JDateChooser dateChooserDr;
    private com.toedter.calendar.JDateChooser dateChooserSampai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel rptPanel;
    // End of variables declaration//GEN-END:variables
}
