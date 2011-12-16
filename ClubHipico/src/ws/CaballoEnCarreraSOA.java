package ws;

import org.orm.PersistentException;

public class CaballoEnCarreraSOA {
	
	public String add(String ca_id_caballo, String ca_id_carrera)throws PersistentException {
		String mensaje="";
		int resultado=1;
		
		
		if(ca_id_caballo.equals("") || ca_id_caballo==null || ca_id_carrera.equals("") || ca_id_carrera==null){
			
			mensaje="ingrese todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				
				//instanciar objeto caballo en carrera
				
				orm.dao.Hip_caballo_carreraDAO lormHip_caballo_carreraDAO = lDAOFactory.getHip_caballo_carreraDAO();
				orm.Hip_caballo_carrera lormHip_caballo_carrera = lormHip_caballo_carreraDAO.createHip_caballo_carrera();
				
				//instanciar objeto caballo
				
				orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
				orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.getHip_caballosByORMID(ca_id_caballo);
				lormHip_caballosDAO.save(lormHip_caballos);
				
				
				//instanciar objeto carrera
				
				orm.dao.Hip_corridaDAO lormCorridaDAO =lDAOFactory.getHip_corridaDAO();
				orm.Hip_corrida lormHip_corrida = lormCorridaDAO.getHip_corridaByORMID(ca_id_carrera);
				lormCorridaDAO.save(lormHip_corrida);
				
				//setear caballo en carrera
				
				lormHip_caballo_carrera.setCa_id_caballo(lormHip_caballos);
				lormHip_caballo_carrera.setCo_id_carrera(lormHip_corrida);
				
				//guardar cambios
				
				try {
					lormHip_caballo_carreraDAO.save(lormHip_caballo_carrera);
					mensaje="caballo inscrito en carrera";
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="no se pudo inscribir";
				}
				
				
			}
				
			
			
		}
		
		
		
		
		return mensaje;
	}

}
