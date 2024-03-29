package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import orm.DAOFactory;
import orm.dao.Hip_corridaDAO;

import com.google.gson.Gson;

import SOAPVO.ApuestaSOAPVO;
import java.lang.reflect.*;
import java.util.Calendar;

public class CierreCarreraSOA {

	/** metodo para cerrar una carrera
	 * @param co_id_carrera le entrego el id de la carrera a cerrar
	 * @param ca_id_caballo le entrego el id del caballo que gano
	 * @return retorna los ganadores y la cantidad de dinero que ganan
	 */

	public String cerrarCaja(String co_id_carrera, String ca_id_caballo){
		double ganancia =0;
		int montoGanador=0;
		double pozo=0;
		int resultado=1;
		String json=null;
		int cantidadGanadores=0;
		double t1,t2;
		t1=System.currentTimeMillis();
		
		if (co_id_carrera.equals("") || co_id_carrera==null || ca_id_caballo.equals("") || ca_id_caballo==null){
			
			
			resultado=0;
			
		}
		else{ 
			if(resultado==1){
				
				try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
        		//crear objeto carrera para calcular dineros
	        	
        		orm.dao.Hip_corridaDAO lormCorridaDAO = lDAOFactory.getHip_corridaDAO();
        		orm.Hip_corrida lormCorrida= lormCorridaDAO.getHip_corridaByORMID(co_id_carrera);

				
				//creando coleccion de apuesta para calcular valores
				Collection<ApuestaSOAPVO> coleccionApuesta = new ArrayList<ApuestaSOAPVO>();
				orm.Hip_apuesta[] ormApuesta;
				//
				ormApuesta =lDAOFactory.getHip_apuestaDAO().listHip_apuestaByQuery("ca_id_caballo='"+ca_id_caballo+"' AND co_id_carrera='"+co_id_carrera+"'", null);

				
	        	for (int i = 0; i < ormApuesta.length; i++ ){
	        		
	        		//guardando coleccion de apuestas encontradas
	                ApuestaSOAPVO apuestaEncontrada  = ApuestaSOAPVO.crearApuestaSOAPVO(ormApuesta[i]);
	                //coleccionApuesta.add(apuestaEncontrada );
	                System.out.println("apuesta :"+ormApuesta[i]);
	                cantidadGanadores=cantidadGanadores+1;
	                	

	        		}
	        	// este if sirve para ver si existen ganadores o la carrera ya a sido finalizada
	        	if(cantidadGanadores!=0 && lormCorrida.getCo_finalizado()==0){


	        	
	        		//seleccionar ganancia
	        		ganancia=lormCorrida.getCo_ganancia();
	        		pozo=ganancia*0.9;
	        		ganancia=ganancia*0.1;
	        		int total = (int) Math.floor(ganancia);
	        		

	        		//guardando totales
	        		lormCorrida.setCo_ganancia(total);
	        		lormCorrida.setCo_finalizado(1);
	        		lormCorridaDAO.save(lormCorrida);
	        	
	        		//calculando monto ganador
	        		pozo=pozo/cantidadGanadores;
	        		montoGanador=(int) Math.floor(pozo);
	        		
	        		System.out.println("monto ganador: "+montoGanador);
	        		
	        		//este for sirve para buscar los ganadores y setearles el pozo ganado y guardarlos en el json
        			for (int i = 0; i < ormApuesta.length; i++ ){
        				ApuestaSOAPVO apuestaEncontrada  = ApuestaSOAPVO.crearApuestaSOAPVO(ormApuesta[i]);
        				apuestaEncontrada.setAp_monto(montoGanador);        				
        				coleccionApuesta.add(apuestaEncontrada );
        				System.out.println("cantidad ganadores:"+cantidadGanadores);
        			}		

	        		Gson gson = new Gson();
               
                json = gson.toJson(coleccionApuesta);
	        	}
	        	else{
	        		
	        		json="0";
	        		System.out.println("la carrera finaliz� o no existen ganadores");
	        	}
	        	
				
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        
		        
			}
			
			
		}
		t2=System.currentTimeMillis();
		//instanciando log
		
		Calendar calendario = Calendar.getInstance();
		String lo_hora;
		String lo_tiempo;
		String lo_parametros;
		Double cal;
		cal=t1/t2;
		
		
		lo_tiempo="tiempo:"+cal+" milisegundos";
		lo_hora =calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE);
		lo_parametros="("+ca_id_caballo+")("+co_id_carrera+")";
		
		ws.LogsSOA obj = new LogsSOA();
		obj.add(lo_hora,lo_parametros,"envio de ganadores", lo_tiempo);
		
		
		
		return json;
	}
}
