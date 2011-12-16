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
public class Hip_corrida implements Serializable {
	public Hip_corrida() {
	}
	
	private String co_id_carrera;
	
	private String co_fecha;
	
	private String co_hora;
	
	private orm.Hip_caja hip_caja;
	
	private orm.Hip_apuesta hip_apuesta;
	
	private orm.Hip_caballo_carrera hip_caballo_carrera;
	
	public void setCo_id_carrera(String value) {
		this.co_id_carrera = value;
	}
	
	public String getCo_id_carrera() {
		return co_id_carrera;
	}
	
	public String getORMID() {
		return getCo_id_carrera();
	}
	
	public void setCo_fecha(String value) {
		this.co_fecha = value;
	}
	
	public String getCo_fecha() {
		return co_fecha;
	}
	
	public void setCo_hora(String value) {
		this.co_hora = value;
	}
	
	public String getCo_hora() {
		return co_hora;
	}
	
	public void setHip_caja(orm.Hip_caja value) {
		if (this.hip_caja != value) {
			orm.Hip_caja lhip_caja = this.hip_caja;
			this.hip_caja = value;
			if (value != null) {
				hip_caja.setCo_id_carrera(this);
			}
			else {
				lhip_caja.setCo_id_carrera(null);
			}
		}
	}
	
	public orm.Hip_caja getHip_caja() {
		return hip_caja;
	}
	
	public void setHip_apuesta(orm.Hip_apuesta value) {
		if (this.hip_apuesta != value) {
			orm.Hip_apuesta lhip_apuesta = this.hip_apuesta;
			this.hip_apuesta = value;
			if (value != null) {
				hip_apuesta.setCo_id_carrera(this);
			}
			else {
				lhip_apuesta.setCo_id_carrera(null);
			}
		}
	}
	
	public orm.Hip_apuesta getHip_apuesta() {
		return hip_apuesta;
	}
	
	public void setHip_caballo_carrera(orm.Hip_caballo_carrera value) {
		if (this.hip_caballo_carrera != value) {
			orm.Hip_caballo_carrera lhip_caballo_carrera = this.hip_caballo_carrera;
			this.hip_caballo_carrera = value;
			if (value != null) {
				hip_caballo_carrera.setCo_id_carrera(this);
			}
			else {
				lhip_caballo_carrera.setCo_id_carrera(null);
			}
		}
	}
	
	public orm.Hip_caballo_carrera getHip_caballo_carrera() {
		return hip_caballo_carrera;
	}
	
	public String toString() {
		return String.valueOf(getCo_id_carrera());
	}
	
}
