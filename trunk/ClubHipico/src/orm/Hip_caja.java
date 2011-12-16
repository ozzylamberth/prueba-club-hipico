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
	
	private int caj_id_caja;
	
	private int caj_ganancia;
	
	private orm.Hip_corrida co_id_carrera;
	
	private void setCaj_id_caja(int value) {
		this.caj_id_caja = value;
	}
	
	public int getCaj_id_caja() {
		return caj_id_caja;
	}
	
	public int getORMID() {
		return getCaj_id_caja();
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
		return String.valueOf(getCaj_id_caja());
	}
	
}
