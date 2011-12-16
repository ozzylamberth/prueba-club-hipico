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
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_HIP_CORRIDA_HIP_APUESTA) {
			return ORM_hip_apuesta;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String co_id_carrera;
	
	private String co_fecha;
	
	private String co_hora;
	
	private java.util.Set ORM_hip_apuesta = new java.util.HashSet();
	
	private orm.Hip_caja hip_caja;
	
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
	
	private void setORM_Hip_apuesta(java.util.Set value) {
		this.ORM_hip_apuesta = value;
	}
	
	private java.util.Set getORM_Hip_apuesta() {
		return ORM_hip_apuesta;
	}
	
	public final orm.Hip_apuestaSetCollection hip_apuesta = new orm.Hip_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HIP_CORRIDA_HIP_APUESTA, orm.ORMConstants.KEY_HIP_APUESTA_CO_ID_CARRERA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
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
	
	public String toString() {
		return String.valueOf(getCo_id_carrera());
	}
	
}
