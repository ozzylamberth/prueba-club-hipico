package ws;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import org.orm.PersistentException;

import com.google.gson.Gson;

import orm.dao.Hip_logDAO;


import SOAPVO.CaballosSOAPVO;
import SOAPVO.LogSOAPVO;

public class LogsSOA {
	
	/** metodo que agrega un log xD
	 * @param lo_hora
	 * @param lo_parametros
	 * @param lo_resultado
	 * @param lo_tiempo
	 */
	public void add(String lo_hora, String lo_parametros, String lo_resultado, String lo_tiempo){
		int resultado=1;
		if(lo_hora.equals("") || lo_hora==null || lo_parametros.equals("") || lo_parametros==null||
				lo_tiempo.equals("") || lo_tiempo==null){
			
			resultado=0;
			
		}
		else{
			if(resultado==1){
				// instanciando factoria
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				// instanciando objeto log
				orm.dao.Hip_logDAO  lormHip_logDAO = lDAOFactory.getHip_logDAO();
				orm.Hip_log lormHip_log = lormHip_logDAO.createHip_log();
				
				
				//seteando objeto log
				lormHip_log.setLo_hora(lo_hora);
				lormHip_log.setLo_parametros(lo_parametros);
				lormHip_log.setLo_resultado(lo_resultado);
				lormHip_log.setLo_tiempo(lo_tiempo);
				
				
				try {
					
					//guardando objeto log
					lormHip_logDAO.save(lormHip_log);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}// fin else
		
		
	}//fin metodo

	
	public String get(){
		
		String json=null;		double t1,t2;
		t1=System.currentTimeMillis();
		
		
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<LogSOAPVO> coleccionLog = new ArrayList<LogSOAPVO>();
		orm.Hip_log[] ormLog;
		
		
		try {
			ormLog=lDAOFactory.getHip_logDAO().listHip_logByQuery("lo_hora like '%:%'", null);
			
			for(int i=0 ; i<ormLog.length ; i++ ){
				
				LogSOAPVO logEncontrado = LogSOAPVO.crearLogSOAPVO(ormLog[i]);
				coleccionLog.add(logEncontrado);
				System.out.println("log econtrado :"+ormLog[i]);
				}
			
			
            Gson gson = new Gson();
            json = gson.toJson(coleccionLog);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		lo_parametros="Sin parametros";
		
		ws.LogsSOA obj = new LogsSOA();
		obj.add(lo_hora,lo_parametros,"envio logs", lo_tiempo);

		
		return json;
		
	}
	
	
	
}//fin clase
