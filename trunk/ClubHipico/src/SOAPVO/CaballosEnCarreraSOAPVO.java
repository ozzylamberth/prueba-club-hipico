package SOAPVO;

public class CaballosEnCarreraSOAPVO {
	
	
	String ca_id_caballo; String co_id_carrera;
	
	public void setCa_id_caballo(String ca_id_caballo){
		
		this.ca_id_caballo=ca_id_caballo;
		
		
	}
	public String getCa_id_caballo(){
		
		return ca_id_caballo;
	}
	
	public void setCo_id_carrera(String co_id_carrera){
		
		this.co_id_carrera= co_id_carrera;
	}
	public String getCo_id_carrera(){
		
		return co_id_carrera;
	}
	
	public static CaballosEnCarreraSOAPVO crearCaballosEnCarreraSOAPVO(orm.Hip_caballo_carrera hip_caballo_carreraOrm){
		
		CaballosEnCarreraSOAPVO obj= new CaballosEnCarreraSOAPVO();
		
		obj.setCa_id_caballo(hip_caballo_carreraOrm.getCa_id_caballo().getCa_id_caballo());
		obj.setCo_id_carrera(hip_caballo_carreraOrm.getCo_id_carrera().getCo_id_carrera());

		
		return obj;
	} 

}
