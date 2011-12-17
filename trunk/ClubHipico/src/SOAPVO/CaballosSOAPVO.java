package SOAPVO;

public class CaballosSOAPVO {
	
	
	String ca_id_caballo; String ca_nombre; String ca_sexo;int ca_edad;
	
	public void setCa_id_caballo(String ca_id_caballo){
		
		this.ca_id_caballo = ca_id_caballo;
		
	}
	
	public String getCa_id_caballo(){
		return ca_id_caballo;
	}
	
	public void setCa_nombre(String ca_nombre){
		
		this.ca_nombre = ca_nombre;
	}
	
	public String getCa_nombre(){
		
		return ca_nombre;
	}
	
	public void setCa_sexo(String ca_sexo){
		
		this.ca_sexo= ca_sexo;
	}
	
	public String getCa_sexo(){
		
		return ca_sexo;
	}
	
	public void setCa_edad(int ca_edad){
		
		this.ca_edad = ca_edad;
	}
	public int getCa_edad(){
		
		return ca_edad;
	}
	
	
	/**Para setear objeto apuesta y poder pasarlo al ws
	 * @param hip_caballosOrm
	 * @return
	 */
	public static CaballosSOAPVO crearCaballosSOAPVO(orm.Hip_caballos hip_caballosOrm){
		
		
		CaballosSOAPVO obj = new CaballosSOAPVO();
		
		
		obj.setCa_id_caballo(hip_caballosOrm.getCa_id_caballo());
		obj.setCa_nombre(hip_caballosOrm.getCa_nombre());
		obj.setCa_edad(hip_caballosOrm.getCa_edad());
		obj.setCa_sexo(hip_caballosOrm.getCa_sexo());
		
		
		return obj;
	}
	

}
