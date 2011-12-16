package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import com.google.gson.Gson;

import SOAPVO.ApuestaSOAPVO;


public class CierreCarreraSOA {

	public String cerrarCaja(String co_id_carrera, String primer_lugar, String segundo_lugar){
		String ganancia ="";
		int resultado=1;
		String mensaje="";
		String json=null;
		
		if (co_id_carrera.equals("") || co_id_carrera==null){
			
			mensaje="ingrese carrera";
			resultado=0;
			
		}
		else{
			if(resultado==1){
				
				try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				
				//instanciar objeto apuesta
				
				orm.dao.Hip_apuestaDAO lormHip_apuestaDAO = lDAOFactory.getHip_apuestaDAO();
				
				
				
				
				//creando coleccion de apuesta para calcular valores
				Collection<ApuestaSOAPVO> coleccionApuesta = new ArrayList<ApuestaSOAPVO>();
				orm.Hip_apuesta[] ormApuesta;
				
				ormApuesta =lDAOFactory.getHip_apuestaDAO().listHip_apuestaByQuery("co_id_carrera='"+co_id_carrera+"'", null);

				
	        	for (int i = 0; i < ormApuesta.length; i++ ){
	                ApuestaSOAPVO apuestaEncontrada  = ApuestaSOAPVO.crearApuestaSOAPVO(ormApuesta[i]);
	                coleccionApuesta.add(apuestaEncontrada );
	                System.out.println("apuesta :"+ormApuesta[i]);
	                
	                Gson gson = new Gson();
	                json = gson.toJson( coleccionApuesta);
	        	
	        	
	        		}
				
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        
		        
			}
			
			
		}
		
		
		
		
		return json;
	}
}
