package data.dao.mysql;

import data.dao.VoziloDAO;
import data.dto.KupacDTO;
import data.dto.ModelVozilaDTO;
import data.dto.VoziloDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLVoziloDAO implements VoziloDAO {

    public ArrayList<VoziloDTO> dobijVozila(String query) {
        ArrayList<VoziloDTO> retVal = new ArrayList<VoziloDTO>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                retVal.add(new VoziloDTO(rs.getInt("IdVozilo"), rs.getString("BrojRegistracije"), rs.getInt("Kilovat"), rs.getDouble("Kubikaza"), rs.getInt("Godiste"), rs.getInt("IdKupac"), rs.getInt("IdModelVozila"), rs.getString("VrstaGoriva")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps, rs);
        }
        return retVal;
    }
    
    @Override
    public ArrayList<VoziloDTO> vozila(int idVlasnika){
        ArrayList<VoziloDTO> retVal = new ArrayList<VoziloDTO>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT IdVozilo, BrojRegistracije, Kilovat, Kubikaza, Godiste, IdKupac, IdModelVozila, VrstaGoriva "
                + "FROM vozilo WHERE IdKupac=? AND Izbrisano!=true "
                + "ORDER BY IdVozilo ASC ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            ps.setObject(1, idVlasnika);
            rs = ps.executeQuery();

            while (rs.next()) {
                retVal.add(new VoziloDTO(rs.getInt("IdVozilo"), rs.getString("BrojRegistracije"), rs.getInt("Kilovat"), rs.getDouble("Kubikaza"), rs.getInt("Godiste"), rs.getInt("IdKupac"), rs.getInt("IdModelVozila"), rs.getString("VrstaGoriva")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps, rs);
        }
        return retVal;
    }
    
    @Override
    public ArrayList<VoziloDTO> svaVozila() {
        ArrayList<VoziloDTO> retVal = new ArrayList<VoziloDTO>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT IdVozilo, BrojRegistracije, Kilovat, Kubikaza, Godiste, IdKupac, IdModelVozila, VrstaGoriva "
                + "FROM vozilo WHERE Izbrisano!=true "
                + "ORDER BY IdVozilo ASC ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                retVal.add(new VoziloDTO(rs.getInt("IdVozilo"), rs.getString("BrojRegistracije"), rs.getInt("Kilovat"), rs.getDouble("Kubikaza"), rs.getInt("Godiste"), rs.getInt("IdKupac"), rs.getInt("IdModelVozila"), rs.getString("VrstaGoriva")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps, rs);
        }
        return retVal;
    }

    @Override
    public boolean dodajVozilo(VoziloDTO vozilo) {
        boolean retVal = false;
        Connection conn = null;
        PreparedStatement ps = null;

        String query = "INSERT INTO vozilo(BrojRegistracije, Kilovat, Kubikaza, Godiste, IdKupac, IdModelVozila, VrstaGoriva) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?) ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            ps.setObject(1, vozilo.getBrojRegistracije());

            ps.setObject(2, vozilo.getKilovat());

            ps.setObject(3, vozilo.getKubikaza());

            ps.setObject(4, vozilo.getGodiste());
//                        if(vozilo.getGodiste() != null){
//                        ps.setInt(4, vozilo.getGodiste());
//                        }
//                        else{
//                            ps.setNull(4, java.sql.Types.INTEGER);
//                        }
            ps.setInt(5, vozilo.getIdKupac());
            ps.setInt(6, vozilo.getIdModelVozila());
            ps.setObject(7, vozilo.getVrstaGoriva());

            retVal = ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps);
        }
        return retVal;
    }

    @Override
    public boolean azurirajVozilo(VoziloDTO vozilo) {
        boolean retVal = false;
        Connection conn = null;
        PreparedStatement ps = null;

        String query = "UPDATE vozilo SET "
                + "BrojRegistracije=?, "
                + "Kilovat=?, "
                + "Kubikaza=?, "
                + "Godiste=?, "
                + "IdKupac=?, "
                + "IdModelVozila=?, "
                + "VrstaGoriva=? "
                + "WHERE IdVozilo=? ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            ps.setString(1, vozilo.getBrojRegistracije());
            ps.setInt(2, vozilo.getKilovat());
            ps.setDouble(3, vozilo.getKubikaza());
            ps.setInt(4, vozilo.getGodiste());
            ps.setInt(5, vozilo.getIdKupac());
            ps.setInt(6, vozilo.getIdModelVozila());
            ps.setString(7, vozilo.getVrstaGoriva());
            ps.setInt(8, vozilo.getIdVozilo());

            retVal = ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps);
        }
        return retVal;
    }

    @Override
    public boolean obrisiVozilo(VoziloDTO vozilo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoziloDTO vozilo(int id) {
        VoziloDTO retVal = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT IdVozilo, BrojRegistracije, Kilovat, Kubikaza, Godiste, IdKupac, IdModelVozila, VrstaGoriva "
                + "FROM vozilo "
                + "WHERE IdVozilo=? ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            // public VoziloDTO(Integer idVozilo, String brojRegistracije, Integer kilovat, Double kubikaza, Integer godiste, Integer idKupac, Integer idModelVozila, String vrstaGoriva) {
            if (rs.next()) {
                retVal = new VoziloDTO(new Integer(rs.getInt("IdVozilo")), rs.getString("BrojRegistracije"), new Integer(rs.getInt("Kilovat")), new Double(rs.getDouble("Kubikaza")), new Integer(rs.getInt("Godiste")), new Integer(rs.getInt("IdKupac")), new Integer(rs.getInt("IdModelVozila")), rs.getString("vrstaGoriva"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps, rs);
        }
        return retVal;
    }

    @Override
    public boolean obrisiVozilo(int id) {
        boolean retVal = false;
        Connection conn = null;
        PreparedStatement ps = null;

        String query = "UPDATE vozilo SET "
                + "Izbrisano=true "
                + "WHERE IdVozilo=? ";
        try {
            conn = ConnectionPool.getInstance().checkOut();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            retVal = ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            DBUtilities.getInstance().showSQLException(e);
        } finally {
            ConnectionPool.getInstance().checkIn(conn);
            DBUtilities.getInstance().close(ps);
        }
        return retVal;
    }
}
