/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poslovnalogika;

import autoservismaric.dialog.IzmijeniDioDialog;
import autoservismaric.dialog.OpisDialog;
import autoservismaric.dialog.ProdajDioDialog;
import autoservismaric.forms.HomeForm1;
import static autoservismaric.forms.HomeForm1.pdv;
import static autoservismaric.forms.HomeForm1.selRedDio;
import data.dao.DAOFactory;
import data.dto.KupacDTO;
import data.dto.RadniNalogDTO;
import data.dto.VoziloDTO;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aco
 */
public class PocetnaLogika {
    HomeForm1 form;
    public PocetnaLogika(HomeForm1 form){
        this.form = form;
    }
    
    public void prikaziAktivnosti(Date dat1, Date dat2){
        ArrayList<RadniNalogDTO> nalozi = new ArrayList<RadniNalogDTO>();
        nalozi = DAOFactory.getDAOFactory().getRadniNalogDAO().getRadniNalozi(dat1, dat2);
        
        DefaultTableModel dtm = (DefaultTableModel) form.getjTable10().getModel();
        dtm.setRowCount(0);
        
        int i = 0;
        if (nalozi != null) {
            while (i < nalozi.size()) {
                RadniNalogDTO d = nalozi.get(i);
                VoziloDTO vozilo = DAOFactory.getDAOFactory().getVoziloDAO().vozilo(d.getIdVozilo());
                KupacDTO kupac = DAOFactory.getDAOFactory().getKupacDAO().kupac(vozilo.getIdKupac());
                String naziv = "";
                if(kupac.getNaziv() == null){
                    naziv = kupac.getIme() + " " + kupac.getPrezime();
                }else
                    naziv = kupac.getNaziv();
                
                dtm.addRow(new Object[]{d.getIdRadniNalog(), naziv, vozilo.getBrojRegistracije(),d.getDatumOtvaranjaNaloga(), d.getPredvidjenoVrijemeZavrsetka()});
                i++;
            }
        }
    }
    
    public void ucitajPopupZaAktivnosti() {
        JMenuItem opis = new JMenuItem("Prikaži opis");
        JTable jTable = form.getjTable10();
        opis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Integer id = (Integer)jTable.getValueAt(jTable.getSelectedRow(), 0);
                new OpisDialog(form, true, id).setVisible(true);
            }
        });
        form.getPopupAktivnosti().add(opis);

        
        jTable.setComponentPopupMenu(form.getPopupAktivnosti());

        
        form.getPopupAktivnosti().addPopupMenuListener(new PopupMenuListener() {

            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int rowAtPoint = jTable.rowAtPoint(SwingUtilities.convertPoint(form.getPopupAktivnosti(), new Point(0, 0), jTable));
                        selRedDio = rowAtPoint;
                        int column = 0;
                        //int row = tableVozila.getSelectedRow();
                        String imeKolone = jTable.getModel().getColumnName(0);

                        if (selRedDio >= 0) {
                            if ("Id".equals(imeKolone)) {
                                int idDio = Integer.parseInt(jTable.getModel().getValueAt(selRedDio, column).toString());
                            }
                        }
                        if (rowAtPoint > -1) {
                            jTable.setRowSelectionInterval(rowAtPoint, rowAtPoint);
                        }
                    }
                });
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }
}