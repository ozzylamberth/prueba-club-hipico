package ws;

import java.util.ArrayList;
import java.util.Collection;
import org.orm.PersistentException;
import com.google.gson.Gson;

import SOAPVO.CorridaSOAPVO;
import java.lang.reflect.*;
import java.util.Calendar;
public class CorridaSOA {

	
	/** metodo para agregar una carrera entregandole los parametros correspondientes
	 * @param co_id_carrera codigo de la carrera
	 * @param co_fecha fecha de la carrera dd/mm/aa
	 * @param co_hora  hora de la carrera hh:mm
	 * @param co_ganancia en este parametro se guarda la cantidad de dinero acumulada por carrera
	 * @param co_finalizado muestra si la carrera se finalizo, en este caso al crear una carrera
	 * comienza con el valor 0
	 * @return retorna mensaje que la carrera fue agregada
	 */
	public String add(String co_id_carrera, String co_fecha,String co_hora,int co_ganancia,int co_finalizado){
		String mensaje="";
		int resultado=1;
		double t1,t2;
		t1=System.currentTimeMillis();
		
		if(co_id_carrera.equals("") || co_id_carrera==null || co_fecha.equals("") || co_fecha==null
				|| co_hora.equals("") || co_hora==null || co_finalizado!=0 || co_ganancia!=0){
			
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
				lormHip_corrida.setCo_ganancia(co_ganancia);
				lormHip_corrida.setCo_finalizado(co_finalizado);
				
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
		lo_parametros="("+co_id_carrera+")("+co_fecha+")("+co_hora+")("+co_ganancia+")("+co_finalizado+")";
		
		ws.LogsSOA obj = new LogsSOA();
		obj.add(lo_hora,lo_parametros,mensaje, lo_tiempo);
		
		return mensaje;
	}// fin metodo add
	
	/** este metodo esta echo para mostrar todas las carreras
	 * @param co_id_carrera paso el parametro id carrera con el valor "carr" para que me muestre
	 * todas las carreras
 	 * @return retorna un json con todas las carreras
	 */
	public String get(String co_id_carrera){
		String json=null;
		double t1,t2;
		t1=System.currentTimeMillis();
		
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		
		Collection<CorridaSOAPVO> coleccionCorrida = new ArrayList<CorridaSOAPVO>();
		orm.Hip_corrida[] ormCorrida;
		
        if((co_id_carrera== null) || (co_id_carrera == (""))){
        	
        	json = "0";        	
        }
        else{
        	
        	try {
				ormCorrida = lDAOFactory.getHip_corridaDAO().listHip_corridaByQuery("co_id_carrera like'%"+co_id_carrera+"%'", null);
				
				for (int i = 0; i < ormCorrida.length; i++ ){
                    CorridaSOAPVO corridaencontrada = CorridaSOAPVO.crearCorridaSOAPVO(ormCorrida[i]);
                    coleccionCorrida.add(corridaencontrada);
                    System.out.println("Corrida :"+ormCorrida[i]);
                    
				
				}
				
                Gson gson = new Gson();
                json = gson.toJson(coleccionCorrida);
                
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		lo_parametros="("+co_id_carrera+")";
		
		ws.LogsSOA obj = new LogsSOA();
		obj.add(lo_hora,lo_parametros,json, lo_tiempo);
		return json;
	} 
	
}
