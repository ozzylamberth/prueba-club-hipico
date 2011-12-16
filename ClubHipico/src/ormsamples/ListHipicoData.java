/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListHipicoData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		System.out.println("Listing Hip_caballos...");
		orm.Hip_caballos[] ormHip_caballoses = lDAOFactory.getHip_caballosDAO().listHip_caballosByQuery(null, null);
		int length = Math.min(ormHip_caballoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHip_caballoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hip_corrida...");
		orm.Hip_corrida[] ormHip_corridas = lDAOFactory.getHip_corridaDAO().listHip_corridaByQuery(null, null);
		length = Math.min(ormHip_corridas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHip_corridas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hip_apuesta...");
		orm.Hip_apuesta[] ormHip_apuestas = lDAOFactory.getHip_apuestaDAO().listHip_apuestaByQuery(null, null);
		length = Math.min(ormHip_apuestas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHip_apuestas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Hip_caballos by Criteria...");
		orm.Hip_caballosCriteria hip_caballosCriteria = new orm.Hip_caballosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//hip_caballosCriteria.ca_id_caballo.eq();
		hip_caballosCriteria.setMaxResults(ROW_COUNT);
		orm.Hip_caballos[] ormHip_caballoses = hip_caballosCriteria.listHip_caballos();
		int length =ormHip_caballoses== null ? 0 : Math.min(ormHip_caballoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHip_caballoses[i]);
		}
		System.out.println(length + " Hip_caballos record(s) retrieved."); 
		
		System.out.println("Listing Hip_corrida by Criteria...");
		orm.Hip_corridaCriteria hip_corridaCriteria = new orm.Hip_corridaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//hip_corridaCriteria.co_id_carrera.eq();
		hip_corridaCriteria.setMaxResults(ROW_COUNT);
		orm.Hip_corrida[] ormHip_corridas = hip_corridaCriteria.listHip_corrida();
		length =ormHip_corridas== null ? 0 : Math.min(ormHip_corridas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHip_corridas[i]);
		}
		System.out.println(length + " Hip_corrida record(s) retrieved."); 
		
		System.out.println("Listing Hip_apuesta by Criteria...");
		orm.Hip_apuestaCriteria hip_apuestaCriteria = new orm.Hip_apuestaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//hip_apuestaCriteria.ap_id_apuesta.eq();
		hip_apuestaCriteria.setMaxResults(ROW_COUNT);
		orm.Hip_apuesta[] ormHip_apuestas = hip_apuestaCriteria.listHip_apuesta();
		length =ormHip_apuestas== null ? 0 : Math.min(ormHip_apuestas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHip_apuestas[i]);
		}
		System.out.println(length + " Hip_apuesta record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListHipicoData listHipicoData = new ListHipicoData();
			try {
				listHipicoData.listTestData();
				//listHipicoData.listByCriteria();
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
