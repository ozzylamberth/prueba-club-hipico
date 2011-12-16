/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateHipicoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.HipicoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
			orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.createHip_caballos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hip_apuesta, ca_edad, ca_sexo, ca_nombre
			lormHip_caballosDAO.save(lormHip_caballos);
			orm.dao.Hip_corridaDAO lormHip_corridaDAO = lDAOFactory.getHip_corridaDAO();
			orm.Hip_corrida lormHip_corrida = lormHip_corridaDAO.createHip_corrida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hip_apuesta, hip_caja, co_hora, co_fecha
			lormHip_corridaDAO.save(lormHip_corrida);
			orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
			orm.Hip_apuesta lormHip_apuesta = lormHip_apuestaDAO.createHip_apuesta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : co_id_carrera, ca_id_caballo, ap_tipo, ap_monto
			lormHip_apuestaDAO.save(lormHip_apuesta);
			orm.dao.Hip_cajaDAO lormHip_cajaDAO = lDAOFactory.getHip_cajaDAO();
			orm.Hip_caja lormHip_caja = lormHip_cajaDAO.createHip_caja();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : caj_ganancia
			lormHip_cajaDAO.save(lormHip_caja);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateHipicoData createHipicoData = new CreateHipicoData();
			try {
				createHipicoData.createTestData();
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
