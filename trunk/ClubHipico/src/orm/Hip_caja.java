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
public class Hip_caja implements Serializable {
	public Hip_caja() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Hip_caja))
			return false;
		Hip_caja hip_caja = (Hip_caja)aObj;
		if (getCaj_id_caja() != hip_caja.getCaj_id_caja())
			return false;
		if (getCo_id_carrera() == null) {
			if (hip_caja.getCo_id_carrera() != null)
				return false;
		}
		else if (!getCo_id_carrera().equals(hip_caja.getCo_id_carrera()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getCaj_id_caja();
		if (getCo_id_carrera() != null) {
			hashcode = hashcode + (getCo_id_carrera().getORMID() == null ? 0 : getCo_id_carrera().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private int caj_id_caja;
	
	private int caj_ganancia;
	
	private orm.Hip_corrida co_id_carrera;
	
	private String co_id_carreraId;
	
	private void setCo_id_carreraId(String value) {
		this.co_id_carreraId = value;
	}
	
	public String getCo_id_carreraId() {
		return co_id_carreraId;
	}
	
	public void setCaj_id_caja(int value) {
		this.caj_id_caja = value;
	}
	
	public int getCaj_id_caja() {
		return caj_id_caja;
	}
	
	public void setCaj_ganancia(int value) {
		this.caj_ganancia = value;
	}
	
	public int getCaj_ganancia() {
		return caj_ganancia;
	}
	
	public void setCo_id_carrera(orm.Hip_corrida value) {
		if (this.co_id_carrera != value) {
			orm.Hip_corrida lco_id_carrera = this.co_id_carrera;
			this.co_id_carrera = value;
			if (value != null) {
				co_id_carrera.setHip_caja(this);
			}
			else {
				lco_id_carrera.setHip_caja(null);
			}
		}
	}
	
	public orm.Hip_corrida getCo_id_carrera() {
		return co_id_carrera;
	}
	
	public String toString() {
		return String.valueOf(getCaj_id_caja() + " " + ((getCo_id_carrera() == null) ? "" : String.valueOf(getCo_id_carrera().getORMID())));
	}
	
}
