package ws;

import org.orm.PersistentException;

public class ApuestaSOA {
	
	
	public String add( int ap_monto, String  ap_tipo,String ca_id_caballo, String co_id_carrera) throws PersistentException{
		
		String mensaje="";
		int resultado=1;
		
		if(ap_monto==0 || ap_tipo==null || ap_tipo.equals("") ||
				ca_id_caballo.equals("") || ca_id_caballo==null || co_id_carrera.equals("") || co_id_carrera==null){
			
			mensaje="ingrese todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				try {
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
				
				//instanciando objeto caja
				
				orm.dao.Hip_cajaDAO lormHip_cajaDAO = lDAOFactory.getHip_cajaDAO();
				orm.Hip_caja lormHip_caja = lormHip_cajaDAO.getHip_cajaByORMID());
				
				
				//seteando objeto apuesta
				
				
				lormHip_apuesta.setAp_monto(ap_monto);
				lormHip_apuesta.setAp_tipo(ap_tipo);
				lormHip_apuesta.setCa_id_caballo(lormHip_caballos);
				lormHip_apuesta.setCo_id_carrera(lormHip_corrida);
				
				
					lormHip_apuestaDAO.save(lormHip_apuesta);
					mensaje="apuesta realizada";
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="error en apuesta";
				}
			
				
				
			}
			
			
		}
		
		
		
		
		
		return mensaje;		
	}

}