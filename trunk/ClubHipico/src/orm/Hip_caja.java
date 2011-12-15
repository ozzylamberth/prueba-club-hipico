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
	
	private String caj_id_caja;
	
	private int ganancia;
	
	private orm.Hip_corrida co_id_carrera;
	
	public void setCaj_id_caja(String value) {
		this.caj_id_caja = value;
	}
	
	public String getCaj_id_caja() {
		return caj_id_caja;
	}
	
	public String getORMID() {
		return getCaj_id_caja();
	}
	
	public void setGanancia(int value) {
		this.ganancia = value;
	}
	
	public int getGanancia() {
		return ganancia;
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
		return String.valueOf(getCaj_id_caja());
	}
	
}
