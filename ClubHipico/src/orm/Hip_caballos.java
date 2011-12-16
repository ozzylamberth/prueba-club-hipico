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
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_HIP_CABALLOS_CO_ID_CARRERA) {
			return ORM_co_id_carrera;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HIP_CABALLOS_HIP_APUESTA) {
			this.hip_apuesta = (orm.Hip_apuesta) owner;
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
	
	private String ca_id_caballo;
	
	private String ca_nombre;
	
	private String ca_sexo;
	
	private int ca_edad;
	
	private java.util.Set ORM_co_id_carrera = new java.util.HashSet();
	
	private orm.Hip_apuesta hip_apuesta;
	
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
	
	private void setORM_Co_id_carrera(java.util.Set value) {
		this.ORM_co_id_carrera = value;
	}
	
	private java.util.Set getORM_Co_id_carrera() {
		return ORM_co_id_carrera;
	}
	
	public final orm.Hip_corridaSetCollection co_id_carrera = new orm.Hip_corridaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HIP_CABALLOS_CO_ID_CARRERA, orm.ORMConstants.KEY_HIP_CORRIDA_CA_ID_CABALLO, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
	
	public String toString() {
		return String.valueOf(getCa_id_caballo());
	}
	
}
