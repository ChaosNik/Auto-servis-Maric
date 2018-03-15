/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservismaric.dialog;

import data.dao.DAOFactory;
import data.dto.DioDTO;
import data.dto.ProdanDioDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aco
 */
public class PregledProdanihDijelovaDialog extends javax.swing.JDialog {

    /**
     * Creates new form PregledProdanihDijelovaDialog
     */
    public PregledProdanihDijelovaDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setTitle("Pregled prodanih dijelova");
        setLocationRelativeTo(null);
        btnSvi.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProdaniDijelovi = new javax.swing.JPanel();
        pnlProdaniMenu = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblSifra = new javax.swing.JLabel();
        lblNaziv = new javax.swing.JLabel();
        btnPretrazi = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();
        btnSvi = new javax.swing.JButton();
        tfId = new javax.swing.JTextField();
        tfSifra = new javax.swing.JTextField();
        tfNaziv = new javax.swing.JTextField();
        lblPregledProdanihDijelova = new javax.swing.JLabel();
        pnlTabelaProdanihDijelova = new javax.swing.JPanel();
        jScrollProdaniDijelovi = new javax.swing.JScrollPane();
        tblProdaniDijelovi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlProdaniDijelovi.setBackground(new java.awt.Color(102, 153, 255));

        pnlProdaniMenu.setBackground(new java.awt.Color(102, 153, 255));
        pnlProdaniMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        lblId.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(240, 240, 240));
        lblId.setText("Id:");

        lblSifra.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblSifra.setForeground(new java.awt.Color(240, 240, 240));
        lblSifra.setText("Šifra:");

        lblNaziv.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblNaziv.setForeground(new java.awt.Color(240, 240, 240));
        lblNaziv.setText("Naziv:");

        btnPretrazi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPretrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/search.png"))); // NOI18N
        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        btnOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autoservismaric/images/fast-backward-double-left-arrow-symbol.png"))); // NOI18N
        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        btnSvi.setText("Prikaži sve");
        btnSvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProdaniMenuLayout = new javax.swing.GroupLayout(pnlProdaniMenu);
        pnlProdaniMenu.setLayout(pnlProdaniMenuLayout);
        pnlProdaniMenuLayout.setHorizontalGroup(
            pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdaniMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdaniMenuLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(lblSifra))
                    .addComponent(btnSvi))
                .addGap(18, 18, 18)
                .addGroup(pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSifra, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdaniMenuLayout.createSequentialGroup()
                        .addComponent(lblNaziv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOdustani, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        pnlProdaniMenuLayout.setVerticalGroup(
            pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdaniMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblSifra)
                    .addComponent(lblNaziv)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlProdaniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOdustani)
                    .addComponent(btnSvi))
                .addContainerGap())
        );

        lblPregledProdanihDijelova.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPregledProdanihDijelova.setForeground(new java.awt.Color(240, 240, 240));
        lblPregledProdanihDijelova.setText("Pregled prodanih dijelova:");

        javax.swing.GroupLayout pnlProdaniDijeloviLayout = new javax.swing.GroupLayout(pnlProdaniDijelovi);
        pnlProdaniDijelovi.setLayout(pnlProdaniDijeloviLayout);
        pnlProdaniDijeloviLayout.setHorizontalGroup(
            pnlProdaniDijeloviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdaniDijeloviLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdaniDijeloviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdaniDijeloviLayout.createSequentialGroup()
                        .addComponent(lblPregledProdanihDijelova)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlProdaniMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlProdaniDijeloviLayout.setVerticalGroup(
            pnlProdaniDijeloviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdaniDijeloviLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPregledProdanihDijelova)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProdaniMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        tblProdaniDijelovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdDio", "Sifra", "Naziv", "Prodajna cijena/kom (KM/kom)", "Kolicina", "Datum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdaniDijelovi.getTableHeader().setReorderingAllowed(false);
        jScrollProdaniDijelovi.setViewportView(tblProdaniDijelovi);
        if (tblProdaniDijelovi.getColumnModel().getColumnCount() > 0) {
            tblProdaniDijelovi.getColumnModel().getColumn(0).setResizable(false);
            tblProdaniDijelovi.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblProdaniDijelovi.getColumnModel().getColumn(1).setResizable(false);
            tblProdaniDijelovi.getColumnModel().getColumn(2).setResizable(false);
            tblProdaniDijelovi.getColumnModel().getColumn(3).setResizable(false);
            tblProdaniDijelovi.getColumnModel().getColumn(4).setResizable(false);
            tblProdaniDijelovi.getColumnModel().getColumn(5).setResizable(false);
        }
        tblProdaniDijelovi.setAutoCreateRowSorter(true);

        javax.swing.GroupLayout pnlTabelaProdanihDijelovaLayout = new javax.swing.GroupLayout(pnlTabelaProdanihDijelova);
        pnlTabelaProdanihDijelova.setLayout(pnlTabelaProdanihDijelovaLayout);
        pnlTabelaProdanihDijelovaLayout.setHorizontalGroup(
            pnlTabelaProdanihDijelovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollProdaniDijelovi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        pnlTabelaProdanihDijelovaLayout.setVerticalGroup(
            pnlTabelaProdanihDijelovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollProdaniDijelovi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProdaniDijelovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTabelaProdanihDijelova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlProdaniDijelovi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlTabelaProdanihDijelova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        Integer id = null;
        try{
            id = Integer.parseInt(tfId.getText());
        }catch(NumberFormatException e){
            if(!"".equals(tfId.getText())){
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(this, "Nepravilan format cijene!", "Greška", JOptionPane.ERROR_MESSAGE);      
            }
            id = null;
            //flag = true;
        }
        String naziv = tfNaziv.getText();
        String sifra = tfSifra.getText();
        ArrayList<DioDTO> dijelovi = new ArrayList<DioDTO>();
        ArrayList<DioDTO> dijelovi2 = new ArrayList<DioDTO>();
        if(id != null){
            DioDTO dio = DAOFactory.getDAOFactory().getDioDAO().getDio(id);
            if(dio != null)
                dijelovi.add(dio);
        }else if(!"".equals(sifra)){
            DioDTO dio = DAOFactory.getDAOFactory().getDioDAO().getDio(sifra);
        }else if(!"".equals(naziv)){
            dijelovi = DAOFactory.getDAOFactory().getDioDAO().getDijeloviNaziv(naziv, true);
            dijelovi2 = DAOFactory.getDAOFactory().getDioDAO().getDijeloviNaziv(naziv, false);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)tblProdaniDijelovi.getModel();
        dtm.setRowCount(0);
        
        ArrayList<ProdanDioDTO> prodani = new ArrayList<ProdanDioDTO>();
        //System.out.println(dijelovi.size());
        if(dijelovi != null)
        for(int i = 0; i < dijelovi.size(); i++){
            DioDTO dio = dijelovi.get(i);
            prodani = DAOFactory.getDAOFactory().getProdanDioDAO().getProdaniDijelovi(dio.getId());
            if(prodani != null)
            for(int j = 0; j < prodani.size(); j++){
                ProdanDioDTO prod = prodani.get(j);
                dtm.addRow(new Object[]{dio.getId(), dio.getSifra(), dio.getNaziv(),prod.getCijena(),prod.getKolicina()
                            ,new SimpleDateFormat("dd.MM.yyyy.").format(prod.getDatum())});
            }
        }
        for(int i = 0; i < dijelovi2.size(); i++){
            DioDTO dio = dijelovi2.get(i);
            prodani = DAOFactory.getDAOFactory().getProdanDioDAO().getProdaniDijelovi(dio.getId());
            for(int j = 0; j < prodani.size(); j++){
                ProdanDioDTO prod = prodani.get(j);
                dtm.addRow(new Object[]{dio.getId(), dio.getSifra(), dio.getNaziv(),prod.getCijena(),prod.getKolicina()
                            ,new SimpleDateFormat("dd.MM.yyyy.").format(prod.getDatum())});
            }
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnSviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSviActionPerformed
        ArrayList<ProdanDioDTO> prodani = new ArrayList<ProdanDioDTO>();
        prodani = DAOFactory.getDAOFactory().getProdanDioDAO().getSviProdaniDijelovi();
        
        DefaultTableModel dtm = (DefaultTableModel)tblProdaniDijelovi.getModel();
        
        for(int i = 0; i < prodani.size(); i++){
            ProdanDioDTO prod = prodani.get(i);
            DioDTO dio = DAOFactory.getDAOFactory().getDioDAO().getDio(prod.getIdDio());
            if(dio != null){
                dtm.addRow(new Object[]{dio.getId(), dio.getSifra(), dio.getNaziv(),prod.getCijena(),prod.getKolicina()
                            ,new SimpleDateFormat("dd.MM.yyyy.").format(prod.getDatum())});
            }
        }
    }//GEN-LAST:event_btnSviActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnSvi;
    private javax.swing.JScrollPane jScrollProdaniDijelovi;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JLabel lblPregledProdanihDijelova;
    private javax.swing.JLabel lblSifra;
    private javax.swing.JPanel pnlProdaniDijelovi;
    private javax.swing.JPanel pnlProdaniMenu;
    private javax.swing.JPanel pnlTabelaProdanihDijelova;
    private javax.swing.JTable tblProdaniDijelovi;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNaziv;
    private javax.swing.JTextField tfSifra;
    // End of variables declaration//GEN-END:variables
}
