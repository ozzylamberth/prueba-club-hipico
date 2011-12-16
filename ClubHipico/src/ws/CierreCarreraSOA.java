package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import orm.DAOFactory;
import orm.dao.Hip_corridaDAO;

import com.google.gson.Gson;

import SOAPVO.ApuestaSOAPVO;


public class CierreCarreraSOA {

	public String cerrarCaja(String co_id_carrera, String ca_id_caballo){
		double ganancia =0;
		double montoGanador=0;
		double pozo=0;
		int resultado=1;
		String mensaje="";
		String json=null;
		int cantidadGanadores=0;
		
		if (co_id_carrera.equals("") || co_id_carrera==null || ca_id_caballo.equals("") || ca_id_caballo==null){
			
			mensaje="ingrese carrera y caballo";
			resultado=0;
			
		}
		else{ 
			if(resultado==1){
				
				try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				

				
				//creando coleccion de apuesta para calcular valores
				Collection<ApuestaSOAPVO> coleccionApuesta = new ArrayList<ApuestaSOAPVO>();
				orm.Hip_apuesta[] ormApuesta;
				//
				ormApuesta =lDAOFactory.getHip_apuestaDAO().listHip_apuestaByQuery("ca_id_caballo='"+ca_id_caballo+"'", null);

				
	        	for (int i = 0; i < ormApuesta.length; i++ ){
	        		
	        		//guardando coleccion de apuestas encontradas
	                ApuestaSOAPVO apuestaEncontrada  = ApuestaSOAPVO.crearApuestaSOAPVO(ormApuesta[i]);
	                
	                
	                	coleccionApuesta.add(apuestaEncontrada );
	                	System.out.println("apuesta :"+ormApuesta[i]);
	                	cantidadGanadores=cantidadGanadores+1;
	                
	        		}
	        	System.out.println("cantidad ganadores:"+cantidadGanadores);
	        	
	        	//crear objeto carrera para calcular dineros
	        	
	        	orm.dao.Hip_corridaDAO lormCorridaDAO = lDAOFactory.getHip_corridaDAO();
	        	orm.Hip_corrida lormCorrida= lormCorridaDAO.getHip_corridaByORMID(co_id_carrera);
	        	
	        	//seleccionar ganancia
	        	ganancia=lormCorrida.getCo_ganancia();
	        	pozo=ganancia*0.9;
	        	ganancia=ganancia*0.1;
	        	int total = (int) Math.floor(ganancia);

	        	//guardando totales
	        	lormCorrida.setCo_ganancia(total);
	        	lormCorridaDAO.save(lormCorrida);
	        	
	        	//calculando monto ganador
	        	montoGanador=pozo/cantidadGanadores;
	        	
	        	System.out.println("monto ganador: "+montoGanador);
                Gson gson = new Gson();
                json = gson.toJson( coleccionApuesta);
                
				
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        
		        
			}
			
			
		}
		
		
		
		
		return json;
	}
}
