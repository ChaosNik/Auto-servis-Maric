/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservismaric.dialog;

import data.dao.DAOFactory;
import data.dto.DioDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aco
 */
public class IzmijeniDioDialog extends javax.swing.JDialog {
       DefaultTableModel dtm;
    int red;

    /**
     * Creates new form IzmijeniDioDialog
     */
    public IzmijeniDioDialog(DefaultTableModel dtm, int red) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ažuriranje dijelova");
        this.dtm = dtm;
        this.red = red;
        try {
            tfId.setText(((Integer) dtm.getValueAt(red, 0)).toString());
            tfSifra.setText((String) dtm.getValueAt(red, 1));
            tfNaziv.setText((String) dtm.getValueAt(red, 2));
            tfMarka.setText((String) dtm.getValueAt(red, 3));
            tfModel.setText((String) dtm.getValueAt(red, 4));
            tfGorivo.setText((String) dtm.getValueAt(red, 6));
            //Object d = (Object)dtm.getValueAt(red, 6);
            tfCijena.setText(((Object) dtm.getValueAt(red, 7)).toString());
            tfKolicina.setText(((Integer) dtm.getValueAt(red, 8)).toString());
            tfNovo.setText((String) dtm.getValueAt(red, 9));
            tfGodiste.setText(((Integer) dtm.getValueAt(red, 5)).toString());
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelzmijeniDio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        btnAzuriraj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOdustani = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfSifra = new javax.swing.JTextField();
        tfNaziv = new javax.swing.JTextField();
        tfMarka = new javax.swing.JTextField();
        tfModel = new javax.swing.JTextField();
        tfGorivo = new javax.swing.JTextField();
        tfCijena = new javax.swing.JTextField();
        tfKolicina = new javax.swing.JTextField();
        tfNovo = new javax.swing.JTextField();
        tfGodiste = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelzmijeniDio.setBackground(new java.awt.Color(102, 153, 255));
        panelzmijeniDio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(476, 482));

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Naziv:");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Marka:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Model:");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Vrsta goriva:");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Cijena");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Količina:");

        btnAzuriraj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAzuriraj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/refresh-button (1).png"))); // NOI18N
        btnAzuriraj.setText("Ažuriraj");
        btnAzuriraj.setNextFocusableComponent(btnOdustani);
        btnAzuriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzurirajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ažuriraj podatke o dijelu:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");

        btnOdustani.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/cancel (1).png"))); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Šifra:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Novo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Godište:");

        tfId.setEditable(false);

        tfSifra.setEditable(false);

        tfNaziv.setNextFocusableComponent(tfMarka);

        tfMarka.setNextFocusableComponent(tfModel);

        tfModel.setNextFocusableComponent(tfGorivo);

        tfGorivo.setNextFocusableComponent(tfCijena);

        tfCijena.setNextFocusableComponent(tfKolicina);

        tfKolicina.setNextFocusableComponent(tfNovo);

        tfNovo.setNextFocusableComponent(tfGodiste);

        tfGodiste.setNextFocusableComponent(btnAzuriraj);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnOdustani)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAzuriraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfId)
                                .addComponent(tfSifra)
                                .addComponent(tfNaziv)
                                .addComponent(tfMarka, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfGodiste)
                                    .addComponent(tfNovo))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel114))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfGorivo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(tfCijena))))))
                .addGap(8, 150, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfCijena, tfGodiste, tfGorivo, tfId, tfKolicina, tfMarka, tfModel, tfNaziv, tfNovo, tfSifra});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(tfNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(tfMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(tfGorivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(tfCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(tfKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfGodiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAzuriraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdustani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfCijena, tfGodiste, tfGorivo, tfId, tfKolicina, tfMarka, tfModel, tfNaziv, tfNovo, tfSifra});

        javax.swing.GroupLayout panelzmijeniDioLayout = new javax.swing.GroupLayout(panelzmijeniDio);
        panelzmijeniDio.setLayout(panelzmijeniDioLayout);
        panelzmijeniDioLayout.setHorizontalGroup(
            panelzmijeniDioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelzmijeniDioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelzmijeniDioLayout.setVerticalGroup(
            panelzmijeniDioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelzmijeniDioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelzmijeniDio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelzmijeniDio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAzurirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzurirajActionPerformed
        String sifra = "";
        String naziv = "";
        Double cijena = null; 
        Integer godiste = null;
        boolean stanje = false; 
        String gorivo = "";
        String marka = "";
        String model = "";
        Integer kolicina = null;
        boolean flag = false;
        Integer id = null;
        
        //šifra
        sifra = tfSifra.getText();
        if(!"".equals(sifra)){
            DioDTO dioo = DAOFactory.getDAOFactory().getDioDAO().getDio(sifra);
            if(dioo.getId() != Integer.parseInt(tfId.getText())){
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Šifra vec postoji!", "Greška", JOptionPane.ERROR_MESSAGE); 
                flag = true;
            }
            
        }else{
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(this, "Unesite šifru!", "Greška", JOptionPane.ERROR_MESSAGE);
            flag = true;
        }
        
        //naziv
        naziv = tfNaziv.getText();
        if("".equals(naziv)){
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(this, "Unesite naziv!", "Greška", JOptionPane.ERROR_MESSAGE);
            flag = true;
        }
        
        //id
        try{
            id = Integer.parseInt(tfId.getText());
        }catch(NumberFormatException e){
            if(!"".equals(tfId.getText())){
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Nepravilan format cijene!", "Greška", JOptionPane.ERROR_MESSAGE);      
            }
        }
        
        //godiste
        try {
            godiste = Integer.parseInt(tfGodiste.getText());
        } catch (NumberFormatException e) {
            if (!"".equals(tfGodiste.getText())) {
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Nepravilan format godišta.", "Greška", JOptionPane.ERROR_MESSAGE);
                flag = true;
            }
            godiste = null;
        }
        if("Da".equals(tfNovo.getText())){
            stanje = true;
        }else if("Ne".equals(tfNovo.getText())){
            stanje = false;
        }else{
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(this, "Nepravilan format stanja, unesite 'Da' ili 'Ne'.", "Greška", JOptionPane.ERROR_MESSAGE);
            flag = true;
        }
        
        //vrsta gorivo
        gorivo = tfGorivo.getText(); 
        if(!"Svi".equals(gorivo) && !"Benzin".equals(gorivo) && !"Dizel".equals(gorivo)){
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(this, "Nepravilan format vrste goriva, unesite 'Svi', 'Benzin' ili 'Dizel'.", "Greška", JOptionPane.ERROR_MESSAGE);
            flag = true;
        }
        //cijena
        try{
            cijena = Double.parseDouble(tfCijena.getText());
        }catch(NumberFormatException e){
            if(!"".equals(tfCijena.getText())){
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Nepravilan format cijene!", "Greška", JOptionPane.ERROR_MESSAGE);      
            }else{
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Unesite cijenu!", "Greška", JOptionPane.ERROR_MESSAGE);
            }
            flag = true;
        }
        //kolicina
        try {
            kolicina = Integer.parseInt(tfKolicina.getText());
        } catch (NumberFormatException e) {
            if (!"".equals(tfKolicina.getText())) {
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Nepravilan format količine.", "Greška", JOptionPane.ERROR_MESSAGE);
                flag = true;
            }
            kolicina = null;
        }
        
        marka = tfMarka.getText();
        model = tfModel.getText();
        
        if(!flag){
        DioDTO dio = new DioDTO(id, sifra, naziv, gorivo, godiste, stanje, cijena, kolicina, true, marka, model);
        DAOFactory.getDAOFactory().getDioDAO().azurirajDio(dio);
        dtm.setValueAt(sifra, red, 1);
        dtm.setValueAt(naziv, red, 2);
        dtm.setValueAt(godiste, red, 5);
        dtm.setValueAt(gorivo, red, 6);
        dtm.setValueAt(cijena, red, 7);
        dtm.setValueAt(kolicina, red, 8);
        dtm.setValueAt(stanje == true ? "Da": "Ne", red, 9);
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(this, "Uspješno ažuriran dio.", "Obavještenje", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        }
    }//GEN-LAST:event_btnAzurirajActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzuriraj;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelzmijeniDio;
    private javax.swing.JTextField tfCijena;
    private javax.swing.JTextField tfGodiste;
    private javax.swing.JTextField tfGorivo;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfKolicina;
    private javax.swing.JTextField tfMarka;
    private javax.swing.JTextField tfModel;
    private javax.swing.JTextField tfNaziv;
    private javax.swing.JTextField tfNovo;
    private javax.swing.JTextField tfSifra;
    // End of variables declaration//GEN-END:variables
}
