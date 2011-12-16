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
public class Hip_caballo_carrera implements Serializable {
	public Hip_caballo_carrera() {
	}
	
	private int cc_id_caballoencarrera;
	
	private orm.Hip_caballos ca_id_caballo;
	
	private orm.Hip_corrida co_id_carrera;
	
	private void setCc_id_caballoencarrera(int value) {
		this.cc_id_caballoencarrera = value;
	}
	
	public int getCc_id_caballoencarrera() {
		return cc_id_caballoencarrera;
	}
	
	public int getORMID() {
		return getCc_id_caballoencarrera();
	}
	
	public void setCa_id_caballo(orm.Hip_caballos value) {
		if (this.ca_id_caballo != value) {
			orm.Hip_caballos lca_id_caballo = this.ca_id_caballo;
			this.ca_id_caballo = value;
			if (value != null) {
				ca_id_caballo.setHip_caballo_carrera(this);
			}
			else {
				lca_id_caballo.setHip_caballo_carrera(null);
			}
		}
	}
	
	public orm.Hip_caballos getCa_id_caballo() {
		return ca_id_caballo;
	}
	
	public void setCo_id_carrera(orm.Hip_corrida value) {
		if (this.co_id_carrera != value) {
			orm.Hip_corrida lco_id_carrera = this.co_id_carrera;
			this.co_id_carrera = value;
			if (value != null) {
				co_id_carrera.setHip_caballo_carrera(this);
			}
			else {
				lco_id_carrera.setHip_caballo_carrera(null);
			}
		}
	}
	
	public orm.Hip_corrida getCo_id_carrera() {
		return co_id_carrera;
	}
	
	public String toString() {
		return String.valueOf(getCc_id_caballoencarrera());
	}
	
}
