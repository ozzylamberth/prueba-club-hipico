/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm;

import java.io.Serializable;
public class Hip_apuesta implements Serializable {
	public Hip_apuesta() {
	}
	
	private String ap_id_apuesta;
	
	private int ap_monto;
	
	private String ap_tipo;
	
	private orm.Hip_caballos ca_id_caballo;
	
	private orm.Hip_corrida co_id_carrera;
	
	public void setAp_id_apuesta(String value) {
		this.ap_id_apuesta = value;
	}
	
	public String getAp_id_apuesta() {
		return ap_id_apuesta;
	}
	
	public String getORMID() {
		return getAp_id_apuesta();
	}
	
	public void setAp_monto(int value) {
		this.ap_monto = value;
	}
	
	public int getAp_monto() {
		return ap_monto;
	}
	
	public void setAp_tipo(String value) {
		this.ap_tipo = value;
	}
	
	public String getAp_tipo() {
		return ap_tipo;
	}
	
	public void setCo_id_carrera(orm.Hip_corrida value) {
		if (this.co_id_carrera != value) {
			orm.Hip_corrida lco_id_carrera = this.co_id_carrera;
			this.co_id_carrera = value;
			if (value != null) {
				co_id_carrera.setHip_apuesta(this);
			}
			else {
				lco_id_carrera.setHip_apuesta(null);
			}
		}
	}
	
	public orm.Hip_corrida getCo_id_carrera() {
		return co_id_carrera;
	}
	
	public void setCa_id_caballo(orm.Hip_caballos value) {
		if (this.ca_id_caballo != value) {
			orm.Hip_caballos lca_id_caballo = this.ca_id_caballo;
			this.ca_id_caballo = value;
			if (value != null) {
				ca_id_caballo.setHip_apuesta(this);
			}
			else {
				lca_id_caballo.setHip_apuesta(null);
			}
		}
	}
	
	public orm.Hip_caballos getCa_id_caballo() {
		return ca_id_caballo;
	}
	
	public String toString() {
		return String.valueOf(getAp_id_apuesta());
	}
	
}
