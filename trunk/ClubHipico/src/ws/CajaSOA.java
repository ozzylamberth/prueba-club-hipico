package ws;

import org.orm.PersistentException;

public class CajaSOA {
	
	public String add(String caj_id_caja,int caj_ganancia, String co_id_carrera ) throws PersistentException {
		
		String mensaje="";
		int resultado=1;
		
		if(caj_id_caja.equals("") || caj_id_caja==null ||  caj_ganancia==0||
				co_id_carrera.equals("") || co_id_carrera==null){
			
			mensaje="introducir todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				
				//instanciar objeto caja
				
				orm.dao.Hip_cajaDAO lormHip_cajaDAO = lDAOFactory.getHip_cajaDAO();
				orm.Hip_caja lormHip_caja = lormHip_cajaDAO.createHip_caja();
				
				//instanciar objeto corrida
				
				orm.dao.Hip_corridaDAO lormCorridaDAO =lDAOFactory.getHip_corridaDAO();
				orm.Hip_corrida lormHip_corrida = lormCorridaDAO.getHip_corridaByORMID(co_id_carrera);
				lormCorridaDAO.save(lormHip_corrida);
				
				//setear objeto caja
				
				lormHip_caja.setCaj_id_caja(caj_id_caja);
				lormHip_caja.setGanancia(caj_ganancia);
				lormHip_caja.setCo_id_carrera(lormHip_corrida);
				
				// guargar objeto
				
				try {
					lormHip_cajaDAO.save(lormHip_caja);
					mensaje="caja guardada";
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="no se guardo caja";
				}
				
				
			}
			
		}//fin else
		
		
		
		return mensaje;
	}//fin metodo

}//fin clase
