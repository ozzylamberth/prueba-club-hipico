package SOAPVO;

public class CorridaSOAPVO {

	
	String co_id_carrera; String co_fecha;String co_hora;int co_ganancia;
	
	
	public void setCo_id_carrera(String co_id_carrera){
		
		this.co_id_carrera = co_id_carrera;
				
	}
	
	public String getCo_id_carrera(){
		
		return co_id_carrera;
	}
	
	public void setCo_fecha(String co_fecha){
		
		this.co_fecha = co_fecha;
	}
	
	public String getCo_fecha(){
		
		return co_fecha;
	}
	
	public void setCo_hora(String co_hora){
		
		this.co_hora = co_hora;
	}
	
	public String getCo_hora(){
		
		return co_hora;
	}
	
	
	public void setCo_ganancia(int co_ganancia){
		
		this.co_ganancia = co_ganancia;
	}
	
	public int getCo_ganancia(){
		
		return co_ganancia;
	}
	
	
	public static CorridaSOAPVO crearCorridaSOAPVO (orm.Hip_corrida hip_corridaOrm){
		
		CorridaSOAPVO obj= new CorridaSOAPVO();
		
		hip_corridaOrm.setCo_id_carrera(hip_corridaOrm.getCo_id_carrera());
		hip_corridaOrm.setCo_fecha(hip_corridaOrm.getCo_fecha());
		hip_corridaOrm.setCo_hora(hip_corridaOrm.getCo_hora());
		hip_corridaOrm.setCo_ganancia(hip_corridaOrm.getCo_ganancia());
		

		return obj;
	}
}
