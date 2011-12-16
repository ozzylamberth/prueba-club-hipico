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
		if (key == orm.ORMConstants.KEY_HIP_CORRIDA_CA_ID_CABALLO) {
			return ORM_ca_id_caballo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HIP_CORRIDA_HIP_APUESTA) {
			this.hip_apuesta = (orm.Hip_apuesta) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HIP_CORRIDA_HIP_CAJA) {
			this.hip_caja = (orm.Hip_caja) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String co_id_carrera;
	
	private String co_fecha;
	
	private String co_hora;
	
	private java.util.Set ORM_ca_id_caballo = new java.util.HashSet();
	
	private orm.Hip_apuesta hip_apuesta;
	
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
	
	private void setORM_Ca_id_caballo(java.util.Set value) {
		this.ORM_ca_id_caballo = value;
	}
	
	private java.util.Set getORM_Ca_id_caballo() {
		return ORM_ca_id_caballo;
	}
	
	public final orm.Hip_caballosSetCollection ca_id_caballo = new orm.Hip_caballosSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HIP_CORRIDA_CA_ID_CABALLO, orm.ORMConstants.KEY_HIP_CABALLOS_CO_ID_CARRERA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
