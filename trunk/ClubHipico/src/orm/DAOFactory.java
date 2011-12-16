/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm;

import orm.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract Hip_caballosDAO getHip_caballosDAO();
	public abstract Hip_corridaDAO getHip_corridaDAO();
	public abstract Hip_apuestaDAO getHip_apuestaDAO();
	public abstract Hip_cajaDAO getHip_cajaDAO();
}

