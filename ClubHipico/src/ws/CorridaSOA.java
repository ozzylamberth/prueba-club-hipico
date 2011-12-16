package ws;

import org.orm.PersistentException;

public class CorridaSOA {

	
	public String add(String co_id_carrera, String co_fecha,String co_hora,int co_ganancia){
		String mensaje="";
		int resultado=1;
		
		if(co_id_carrera.equals("") || co_id_carrera==null || co_fecha.equals("") || co_fecha==null
				|| co_hora.equals("") || co_hora==null){
			
			mensaje="ingrese todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				//instanciando objeto corrida
				orm.dao.Hip_corridaDAO lormHip_corridaDAO = lDAOFactory.getHip_corridaDAO();
				orm.Hip_corrida lormHip_corrida = lormHip_corridaDAO.createHip_corrida();
				
				//seteando objeto corrida
				
				lormHip_corrida.setCo_id_carrera(co_id_carrera);
				lormHip_corrida.setCo_fecha(co_fecha);
				lormHip_corrida.setCo_hora(co_hora);
				
				//guardando cambios
				
				try {
					lormHip_corridaDAO.save(lormHip_corrida);
					mensaje="la corrida ha sigo guardada";
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="no se guardo corrida";
				}
				
				
			}
			
			
		}
		
		
		
		return mensaje;
	}
}
