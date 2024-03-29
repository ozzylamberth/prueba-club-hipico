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

import orm.impl.*;
import orm.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private Hip_caballosDAO _hip_caballosDAO = new Hip_caballosDAOImpl();
	public Hip_caballosDAO getHip_caballosDAO() {
		return _hip_caballosDAO;
	}
	
	private Hip_corridaDAO _hip_corridaDAO = new Hip_corridaDAOImpl();
	public Hip_corridaDAO getHip_corridaDAO() {
		return _hip_corridaDAO;
	}
	
	private Hip_apuestaDAO _hip_apuestaDAO = new Hip_apuestaDAOImpl();
	public Hip_apuestaDAO getHip_apuestaDAO() {
		return _hip_apuestaDAO;
	}
	
	private Hip_logDAO _hip_logDAO = new Hip_logDAOImpl();
	public Hip_logDAO getHip_logDAO() {
		return _hip_logDAO;
	}
	
}

