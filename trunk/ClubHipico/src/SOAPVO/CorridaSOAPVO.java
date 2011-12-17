package SOAPVO;

public class CorridaSOAPVO {

	
	String co_id_carrera; 
	String co_fecha;
	String co_hora;
	int co_ganancia;
	int co_finalizado;
	
	
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
	public void setCo_finalizado(int co_finalizado){
		this.co_finalizado = co_finalizado;
	}
	
	public int getCo_finalizado(){
		return co_finalizado;
	}
	
	
	public static CorridaSOAPVO crearCorridaSOAPVO(orm.Hip_corrida hip_corridaOrm){
		
		CorridaSOAPVO obj= new CorridaSOAPVO();
		
		obj.setCo_id_carrera(hip_corridaOrm.getCo_id_carrera());
		obj.setCo_fecha(hip_corridaOrm.getCo_fecha());
		obj.setCo_hora(hip_corridaOrm.getCo_hora());
		obj.setCo_ganancia(hip_corridaOrm.getCo_ganancia());
		obj.setCo_finalizado(hip_corridaOrm.getCo_finalizado());

		return obj;
	}
}
