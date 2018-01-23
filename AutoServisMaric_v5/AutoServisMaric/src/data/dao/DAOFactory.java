package data.dao;

import data.dao.mysql.MySQLDAOFactory;

public abstract class DAOFactory {
    public abstract KupacDAO getKupacDAO();
    
    public abstract VoziloDAO getVoziloDAO();
    
    public abstract ModelVozilaDAO getModelVozilaDAO();
    
    public abstract ZaposleniDAO getZaposleniDAO();
    
    public abstract StatistikaDAO getStatistikaDAO();
    
    public abstract RadniNalogDAO getRadniNalogDAO();

    
    public static DAOFactory getDAOFactory() {
		return new MySQLDAOFactory();
	}
   
}