package SOAPVO;

public class ApuestaSOAPVO {
	
	
	
	int ap_monto;
	String ap_tipo;
	String ca_id_caballo;
	String co_id_carrera;
	
	
	
	
	public void setAp_monto(int ap_monto){
		
		this.ap_monto = ap_monto;
	}
	
	public int getAp_monto(){
		
		return ap_monto;
	}
	
	public void setAp_tipo(String ap_tipo){
		
		this.ap_tipo=ap_tipo;
	}
	
	public String getAp_tipo(){
		
		return ap_tipo;
		
	}
	
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

	/** Para setear objeto apuesta y poder pasarlo al ws
	 * @param hip_apuestaOrm
	 * @return retorna el objeto seteado
	 */
	public static ApuestaSOAPVO crearApuestaSOAPVO(orm.Hip_apuesta hip_apuestaOrm){
		
		ApuestaSOAPVO obj= new ApuestaSOAPVO();
		
	
		obj.setAp_monto(hip_apuestaOrm.getAp_id_apuesta());
		obj.setAp_tipo(hip_apuestaOrm.getAp_tipo());
		obj.setCa_id_caballo(hip_apuestaOrm.getCa_id_caballo().getCa_id_caballo());
		obj.setCo_id_carrera(hip_apuestaOrm.getCo_id_carrera().getCo_id_carrera());

		
		return obj;
	} 
}
