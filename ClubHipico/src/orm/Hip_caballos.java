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
		if (key == orm.ORMConstants.KEY_HIP_CABALLOS_HIP_APUESTA) {
			return ORM_hip_apuesta;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String ca_id_caballo;
	
	private String ca_nombre;
	
	private String ca_sexo;
	
	private int ca_edad;
	
	private java.util.Set ORM_hip_apuesta = new java.util.HashSet();
	
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
	
	private void setORM_Hip_apuesta(java.util.Set value) {
		this.ORM_hip_apuesta = value;
	}
	
	private java.util.Set getORM_Hip_apuesta() {
		return ORM_hip_apuesta;
	}
	
	public final orm.Hip_apuestaSetCollection hip_apuesta = new orm.Hip_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HIP_CABALLOS_HIP_APUESTA, orm.ORMConstants.KEY_HIP_APUESTA_CA_ID_CABALLO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCa_id_caballo());
	}
	
}
