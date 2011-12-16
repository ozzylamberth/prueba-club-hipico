package ws;

import org.orm.PersistentException;

public class ApuestaSOA {
	
	
	public String add(String ap_id_apuesta, int ap_monto, int ap_tipo,String ca_id_caballo, String co_id_carrera) throws PersistentException{
		
		String mensaje="";
		int resultado=1;
		
		if(ap_id_apuesta.equals("") || ap_id_apuesta==null || ap_monto==0 || ap_tipo==0 ||
				ca_id_caballo.equals("") || ca_id_caballo==null || co_id_carrera.equals("") || co_id_carrera==null){
			
			mensaje="ingrese todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				
				
				//instanciando objeto apuesta
				
				orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
				orm.Hip_apuesta lormHip_apuesta = lormHip_apuestaDAO.createHip_apuesta();
				
				//instanciando objeto caballo
				
				orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
				orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.getHip_caballosByORMID(ca_id_caballo);
				lormHip_caballosDAO.save(lormHip_caballos);
				
				//instanciando  objeto corrida
				
				orm.dao.Hip_corridaDAO lormCorridaDAO = lDAOFactory.getHip_corridaDAO();
				orm.Hip_corrida lormHip_corrida = lormCorridaDAO.getHip_corridaByORMID(co_id_carrera);
				lormCorridaDAO.save(lormHip_corrida);
				
				//instanciando objeto hipcaballos corrida
				
				orm.dao.Hip_caballos_hip_corridaDAO lormCaballos_hip_corridaDAO =lDAOFactory.getHip_caballos_hip_corridaDAO();
				orm.Hip_caballos_hip_corrida lormHip_caballos_hip_corrida = lormCaballos_hip_corridaDAO.getHip_caballos_hip_corridaByORMID(lormHip_caballos, lormHip_corrida);
				lormCaballos_hip_corridaDAO.save(lormHip_caballos_hip_corrida);
				
				
				//seteando objeto apuesta
				
				lormHip_apuesta.setAp_id_apuesta(ap_id_apuesta);
				lormHip_apuesta.setAp_monto(ap_monto);
				lormHip_apuesta.setAp_tipo(ap_tipo);
				lormHip_apuesta.setCa_id_caballo(lormHip_caballos_hip_corrida);
			
				
				
			}
			
			
		}
		
		
		
		
		
		return mensaje;		
	}

}
