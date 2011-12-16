/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateHipicoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.HipicoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
			orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.loadHip_caballosByQuery(null, null);
			// Update the properties of the persistent object
			lormHip_caballosDAO.save(lormHip_caballos);
			orm.dao.Hip_corridaDAO lormHip_corridaDAO = lDAOFactory.getHip_corridaDAO();
			orm.Hip_corrida lormHip_corrida = lormHip_corridaDAO.loadHip_corridaByQuery(null, null);
			// Update the properties of the persistent object
			lormHip_corridaDAO.save(lormHip_corrida);
			orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
			orm.Hip_apuesta lormHip_apuesta = lormHip_apuestaDAO.loadHip_apuestaByQuery(null, null);
			// Update the properties of the persistent object
			lormHip_apuestaDAO.save(lormHip_apuesta);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Hip_caballos by Hip_caballosCriteria");
		orm.Hip_caballosCriteria hip_caballosCriteria = new orm.Hip_caballosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//hip_caballosCriteria.ca_id_caballo.eq();
		System.out.println(hip_caballosCriteria.uniqueHip_caballos());
		
		System.out.println("Retrieving Hip_corrida by Hip_corridaCriteria");
		orm.Hip_corridaCriteria hip_corridaCriteria = new orm.Hip_corridaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//hip_corridaCriteria.co_id_carrera.eq();
		System.out.println(hip_corridaCriteria.uniqueHip_corrida());
		
		System.out.println("Retrieving Hip_apuesta by Hip_apuestaCriteria");
		orm.Hip_apuestaCriteria hip_apuestaCriteria = new orm.Hip_apuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//hip_apuestaCriteria.ap_id_apuesta.eq();
		System.out.println(hip_apuestaCriteria.uniqueHip_apuesta());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateHipicoData retrieveAndUpdateHipicoData = new RetrieveAndUpdateHipicoData();
			try {
				retrieveAndUpdateHipicoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateHipicoData.retrieveByCriteria();
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
