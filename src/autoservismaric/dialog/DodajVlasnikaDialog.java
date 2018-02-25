/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservismaric.dialog;

import autoservismaric.forms.HomeForm1;
import data.dto.KupacDTO;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import poslovnalogika.KupacLogika;

/**
 *
 * @author DulleX
 */
public class DodajVlasnikaDialog extends javax.swing.JDialog {

    public KupacLogika kupacLogika = new KupacLogika();

    ButtonGroup bg;
    KupacDTO kup;
    /**
     * Creates new form DodajVlasnikaDialog
     */

    DodajVoziloDialog dvd;
    HomeForm1 forma;
    DodajVoziloDialog dijalog;
    IzmijeniVoziloDialog dijalogIzmijeni;

    public DodajVlasnikaDialog(DodajVoziloDialog dvd, java.awt.Frame parent, boolean modal, HomeForm1 forma) {
        super(parent, modal);
        initComponents();
        this.dvd = dvd;
        bg = new ButtonGroup();
        this.forma = forma;
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }
    
    public DodajVlasnikaDialog(DodajVoziloDialog dvd, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.dvd = dvd;
        bg = new ButtonGroup();
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }


    public DodajVlasnikaDialog(java.awt.Frame parent, boolean modal, HomeForm1 forma) {
        super(parent, modal);
        initComponents();
        bg = new ButtonGroup();
        this.forma = forma;
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }
    
    public DodajVlasnikaDialog(java.awt.Frame parent, boolean modal, DodajVoziloDialog dijalog) {
        super(parent, modal);
        initComponents();
        bg = new ButtonGroup();
        this.dijalog = dijalog;
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }
    
    public DodajVlasnikaDialog(java.awt.Frame parent, boolean modal, IzmijeniVoziloDialog dijalog) {
        super(parent, modal);
        initComponents();
        bg = new ButtonGroup();
        this.dijalogIzmijeni = dijalog;
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }
    
    public DodajVlasnikaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bg = new ButtonGroup();
        kupacLogika.inicijalizacijaDodajDijaloga(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDodajVlasnika = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfImeDodaj = new javax.swing.JTextField();
        tfPrezimeDodaj = new javax.swing.JTextField();
        tfNazivDodaj = new javax.swing.JTextField();
        tfTelefonDodaj = new javax.swing.JTextField();
        tfAdresaDodaj = new javax.swing.JTextField();
        tfGradDodaj = new javax.swing.JTextField();
        rbPrivatno = new javax.swing.JRadioButton();
        rbPravno = new javax.swing.JRadioButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOdustani = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodavanje vlasnika vozila");
        setPreferredSize(new java.awt.Dimension(429, 466));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelDodajVlasnika.setBackground(new java.awt.Color(102, 153, 255));
        panelDodajVlasnika.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(412, 442));

        tfNazivDodaj.setEditable(false);

        tfTelefonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonDodajActionPerformed(evt);
            }
        });

        rbPrivatno.setBackground(new java.awt.Color(102, 153, 255));
        rbPrivatno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPrivatno.setForeground(new java.awt.Color(255, 255, 255));
        rbPrivatno.setSelected(true);
        rbPrivatno.setText("Privatno");
        rbPrivatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrivatnoActionPerformed(evt);
            }
        });

        rbPravno.setBackground(new java.awt.Color(102, 153, 255));
        rbPravno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPravno.setForeground(new java.awt.Color(255, 255, 255));
        rbPravno.setText("Pravno");
        rbPravno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPravnoActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Ime:");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Prezime:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Naziv:");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Telefon:");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Adresa:");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Grad:");

        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/add (1).png"))); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dodavanja vlasnika vozila:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tip vlasnika:");

        btnOdustani.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/cancel (1).png"))); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112)
                            .addComponent(jLabel24)
                            .addComponent(jLabel113)
                            .addComponent(jLabel115)
                            .addComponent(jLabel114)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefonDodaj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfGradDodaj)
                            .addComponent(tfAdresaDodaj)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbPravno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50))
                            .addComponent(tfPrezimeDodaj)
                            .addComponent(tfNazivDodaj)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbPrivatno)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfImeDodaj))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addComponent(btnOdustani)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDodaj)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel111, jLabel112, jLabel113, jLabel114, jLabel115, jLabel24});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDodaj, btnOdustani});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPrivatno)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPravno)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfImeDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrezimeDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNazivDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdresaDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGradDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnOdustani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel111, jLabel112, jLabel113, jLabel114, jLabel115});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfAdresaDodaj, tfGradDodaj, tfImeDodaj, tfNazivDodaj, tfPrezimeDodaj, tfTelefonDodaj});

        javax.swing.GroupLayout panelDodajVlasnikaLayout = new javax.swing.GroupLayout(panelDodajVlasnika);
        panelDodajVlasnika.setLayout(panelDodajVlasnikaLayout);
        panelDodajVlasnikaLayout.setHorizontalGroup(
            panelDodajVlasnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDodajVlasnikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDodajVlasnikaLayout.setVerticalGroup(
            panelDodajVlasnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDodajVlasnikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDodajVlasnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDodajVlasnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbPrivatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrivatnoActionPerformed
        tfNazivDodaj.setEditable(false);
        tfNazivDodaj.setBackground(Color.gray);
        tfNazivDodaj.setText("");
        tfImeDodaj.setEditable(true);
        tfPrezimeDodaj.setEditable(true);
        tfImeDodaj.setBackground(Color.white);
        tfPrezimeDodaj.setBackground(Color.white);
        tfImeDodaj.setText("");
        tfPrezimeDodaj.setText("");
    }//GEN-LAST:event_rbPrivatnoActionPerformed

    private void rbPravnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPravnoActionPerformed
        tfImeDodaj.setEditable(false);
        tfPrezimeDodaj.setEditable(false);
        tfNazivDodaj.setEditable(true);
        tfImeDodaj.setBackground(Color.gray);
        tfPrezimeDodaj.setBackground(Color.gray);
        tfNazivDodaj.setBackground(Color.white);
        tfImeDodaj.setText("");
        tfPrezimeDodaj.setText("");
        tfNazivDodaj.setText("");
    }//GEN-LAST:event_rbPravnoActionPerformed

    private void tfTelefonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonDodajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonDodajActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        kupacLogika.dodajKupca(this);
    }//GEN-LAST:event_btnDodajActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                    
    }//GEN-LAST:event_formWindowClosing

    public DodajVoziloDialog getDijalog() {
        return dijalog;
    }

    public IzmijeniVoziloDialog getDijalogIzmijeni() {
        return dijalogIzmijeni;
    }

    
    
    public ButtonGroup getBg() {
        return bg;
    }

    public KupacDTO getKup() {
        return kup;
    }

    public DodajVoziloDialog getDvd() {
        return dvd;
    }

    public JButton getBtnDodaj() {
        return btnDodaj;
    }

    public JButton getBtnOdustani() {
        return btnOdustani;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getPanelDodajVlasnika() {
        return panelDodajVlasnika;
    }

    public JRadioButton getRbPravno() {
        return rbPravno;
    }

    public JRadioButton getRbPrivatno() {
        return rbPrivatno;
    }

    public JTextField getTfAdresaDodaj() {
        return tfAdresaDodaj;
    }

    public JTextField getTfGradDodaj() {
        return tfGradDodaj;
    }

    public JTextField getTfImeDodaj() {
        return tfImeDodaj;
    }

    public JTextField getTfNazivDodaj() {
        return tfNazivDodaj;
    }

    public JTextField getTfPrezimeDodaj() {
        return tfPrezimeDodaj;
    }

    public JTextField getTfTelefonDodaj() {
        return tfTelefonDodaj;
    }

    public void setKup(KupacDTO kup) {
        this.kup = kup;
    }

    public HomeForm1 getForma() {
        return forma;
    }
    
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
            java.util.logging.Logger.getLogger(DodajVlasnikaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajVlasnikaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajVlasnikaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajVlasnikaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DodajVlasnikaDialog dialog = new DodajVlasnikaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDodajVlasnika;
    private javax.swing.JRadioButton rbPravno;
    private javax.swing.JRadioButton rbPrivatno;
    private javax.swing.JTextField tfAdresaDodaj;
    private javax.swing.JTextField tfGradDodaj;
    private javax.swing.JTextField tfImeDodaj;
    private javax.swing.JTextField tfNazivDodaj;
    private javax.swing.JTextField tfPrezimeDodaj;
    private javax.swing.JTextField tfTelefonDodaj;
    // End of variables declaration//GEN-END:variables
}
