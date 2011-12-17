package ws;

import org.orm.PersistentException;
import java.lang.reflect.*;
import java.util.Calendar;
public class ApuestaSOA {
	
	
	/**
	 * metodo para agregar una apuesta 
	 * @param ap_monto monto a apostar
	 * @param ap_tipo tipo de apuesta se refiere a que lugar apuesta
	 * @param ca_id_caballo codigo del caballo
	 * @param co_id_carrera codigo de la carrera
	 * @return
	 * @throws PersistentException
	 */
	public String add( int ap_monto, String  ap_tipo,String ca_id_caballo, String co_id_carrera) throws PersistentException{
		
		
		String mensaje="";
		int resultado=1;
		int ganancia=0;
		double t1,t2;
		t1=System.currentTimeMillis();
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
				
				
				ganancia=lormHip_corrida.getCo_ganancia()+ap_monto;
				lormHip_corrida.setCo_ganancia(ganancia);	
				System.out.println("valor corrida"+lormHip_corrida.getCo_ganancia());
							
				lormCorridaDAO.save(lormHip_corrida);
				

				
				
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
		lo_parametros="("+ap_monto+")("+ap_tipo+")("+ca_id_caballo+")("+co_id_carrera+")";
		
		ws.LogsSOA obj = new LogsSOA();
		obj.add(lo_hora,lo_parametros,mensaje, lo_tiempo);
		
		return mensaje;		
	}

}
