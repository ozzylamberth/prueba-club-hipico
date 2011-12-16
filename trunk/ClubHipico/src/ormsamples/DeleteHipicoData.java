/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteHipicoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.HipicoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
			orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.loadHip_caballosByQuery(null, null);
			// Delete the persistent object
			lormHip_caballosDAO.delete(lormHip_caballos);
			orm.dao.Hip_corridaDAO lormHip_corridaDAO = lDAOFactory.getHip_corridaDAO();
			orm.Hip_corrida lormHip_corrida = lormHip_corridaDAO.loadHip_corridaByQuery(null, null);
			// Delete the persistent object
			lormHip_corridaDAO.delete(lormHip_corrida);
			orm.dao.Hip_caballo_carreraDAO lormHip_caballo_carreraDAO = lDAOFactory.getHip_caballo_carreraDAO();
			orm.Hip_caballo_carrera lormHip_caballo_carrera = lormHip_caballo_carreraDAO.loadHip_caballo_carreraByQuery(null, null);
			// Delete the persistent object
			lormHip_caballo_carreraDAO.delete(lormHip_caballo_carrera);
			orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
			orm.Hip_apuesta lormHip_apuesta = lormHip_apuestaDAO.loadHip_apuestaByQuery(null, null);
			// Delete the persistent object
			lormHip_apuestaDAO.delete(lormHip_apuesta);
			orm.dao.Hip_cajaDAO lormHip_cajaDAO = lDAOFactory.getHip_cajaDAO();
			orm.Hip_caja lormHip_caja = lormHip_cajaDAO.loadHip_cajaByQuery(null, null);
			// Delete the persistent object
			lormHip_cajaDAO.delete(lormHip_caja);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteHipicoData deleteHipicoData = new DeleteHipicoData();
			try {
				deleteHipicoData.deleteTestData();
			}
			finally {
				orm.HipicoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
