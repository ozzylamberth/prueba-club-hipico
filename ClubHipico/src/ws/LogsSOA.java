package ws;

import org.orm.PersistentException;

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

}//fin clase
