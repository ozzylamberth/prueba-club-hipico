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
			orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
			orm.Hip_apuesta lormHip_apuesta = lormHip_apuestaDAO.loadHip_apuestaByQuery(null, null);
			// Delete the persistent object
			lormHip_apuestaDAO.delete(lormHip_apuesta);
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
