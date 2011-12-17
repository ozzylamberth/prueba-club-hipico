package SOAPVO;

public class LogSOAPVO {
	
	String lo_hora; String lo_parametros; String lo_resultado; String lo_tiempo;
	
	
	public void setLo_hora(String lo_hora){
		
		this.lo_hora=lo_hora;
	}
	
	public String getLo_hora(){
		
		return lo_hora;
	}
	
	public void setLo_parametros(String lo_parametros){
		
		this.lo_parametros=lo_parametros;
	}
	
	public String getLo_parametros(){
		
		return lo_parametros;
	}
	
	public void setLo_resultado(String lo_resultado){
		
		this.lo_resultado = lo_resultado;
	}
	
	public String getLo_resultado(){
		
		return lo_resultado;
	}
	
	public void setLo_tiempo(String lo_tiempo){
		
		this.lo_tiempo = lo_tiempo;
	}
	
	public String getLo_tiempo(){
		
		return lo_tiempo;
	}
	
	
	public static LogSOAPVO crearLogSOAPVO (orm.Hip_log hip_logOrm){
		
		LogSOAPVO obj= new LogSOAPVO();
		
		
		obj.setLo_hora(hip_logOrm.getLo_hora());
		obj.setLo_parametros(hip_logOrm.getLo_parametros());
		obj.setLo_resultado(hip_logOrm.getLo_resultado());
		obj.setLo_tiempo(hip_logOrm.getLo_tiempo());
		
		
		return obj;
	}

}
