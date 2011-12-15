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
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HIP_APUESTA_CA_ID_CABALLO) {
			this.ca_id_caballo = (orm.Hip_caballos_hip_corrida) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String ap_id_apuesta;
	
	private int ap_monto;
	
	private int ap_tipo;
	
	private orm.Hip_caballos_hip_corrida ca_id_caballo;
	
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
	
	public void setAp_tipo(int value) {
		this.ap_tipo = value;
	}
	
	public int getAp_tipo() {
		return ap_tipo;
	}
	
	public void setCa_id_caballo(orm.Hip_caballos_hip_corrida value) {
		if (ca_id_caballo != null) {
			ca_id_caballo.hip_apuesta.remove(this);
		}
		if (value != null) {
			value.hip_apuesta.add(this);
		}
	}
	
	public orm.Hip_caballos_hip_corrida getCa_id_caballo() {
		return ca_id_caballo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Ca_id_caballo(orm.Hip_caballos_hip_corrida value) {
		this.ca_id_caballo = value;
	}
	
	private orm.Hip_caballos_hip_corrida getORM_Ca_id_caballo() {
		return ca_id_caballo;
	}
	
	public String toString() {
		return String.valueOf(getAp_id_apuesta());
	}
	
}
