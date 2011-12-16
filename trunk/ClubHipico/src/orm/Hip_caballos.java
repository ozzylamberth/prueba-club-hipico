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
public class Hip_caballos implements Serializable {
	public Hip_caballos() {
	}
	
	private String ca_id_caballo;
	
	private String ca_nombre;
	
	private String ca_sexo;
	
	private int ca_edad;
	
	private orm.Hip_apuesta hip_apuesta;
	
	private orm.Hip_caballo_carrera hip_caballo_carrera;
	
	public void setCa_id_caballo(String value) {
		this.ca_id_caballo = value;
	}
	
	public String getCa_id_caballo() {
		return ca_id_caballo;
	}
	
	public String getORMID() {
		return getCa_id_caballo();
	}
	
	public void setCa_nombre(String value) {
		this.ca_nombre = value;
	}
	
	public String getCa_nombre() {
		return ca_nombre;
	}
	
	public void setCa_sexo(String value) {
		this.ca_sexo = value;
	}
	
	public String getCa_sexo() {
		return ca_sexo;
	}
	
	public void setCa_edad(int value) {
		this.ca_edad = value;
	}
	
	public int getCa_edad() {
		return ca_edad;
	}
	
	public void setHip_apuesta(orm.Hip_apuesta value) {
		if (this.hip_apuesta != value) {
			orm.Hip_apuesta lhip_apuesta = this.hip_apuesta;
			this.hip_apuesta = value;
			if (value != null) {
				hip_apuesta.setCa_id_caballo(this);
			}
			else {
				lhip_apuesta.setCa_id_caballo(null);
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
				hip_caballo_carrera.setCa_id_caballo(this);
			}
			else {
				lhip_caballo_carrera.setCa_id_caballo(null);
			}
		}
	}
	
	public orm.Hip_caballo_carrera getHip_caballo_carrera() {
		return hip_caballo_carrera;
	}
	
	public String toString() {
		return String.valueOf(getCa_id_caballo());
	}
	
}
