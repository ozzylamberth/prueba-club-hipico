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
public class Hip_caballos_hip_corrida implements Serializable {
	public Hip_caballos_hip_corrida() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Hip_caballos_hip_corrida))
			return false;
		Hip_caballos_hip_corrida hip_caballos_hip_corrida = (Hip_caballos_hip_corrida)aObj;
		if (getCa_id_caballo() == null) {
			if (hip_caballos_hip_corrida.getCa_id_caballo() != null)
				return false;
		}
		else if (!getCa_id_caballo().equals(hip_caballos_hip_corrida.getCa_id_caballo()))
			return false;
		if (getCo_id_carrera() == null) {
			if (hip_caballos_hip_corrida.getCo_id_carrera() != null)
				return false;
		}
		else if (!getCo_id_carrera().equals(hip_caballos_hip_corrida.getCo_id_carrera()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getCa_id_caballo() != null) {
			hashcode = hashcode + (getCa_id_caballo().getORMID() == null ? 0 : getCa_id_caballo().getORMID().hashCode());
		}
		if (getCo_id_carrera() != null) {
			hashcode = hashcode + (getCo_id_carrera().getORMID() == null ? 0 : getCo_id_carrera().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_HIP_CABALLOS_HIP_CORRIDA_HIP_APUESTA) {
			return ORM_hip_apuesta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HIP_CABALLOS_HIP_CORRIDA_CA_ID_CABALLO) {
			this.ca_id_caballo = (orm.Hip_caballos) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HIP_CABALLOS_HIP_CORRIDA_CO_ID_CARRERA) {
			this.co_id_carrera = (orm.Hip_corrida) owner;
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
	
	private orm.Hip_caballos ca_id_caballo;
	
	private String ca_id_caballoId;
	
	private void setCa_id_caballoId(String value) {
		this.ca_id_caballoId = value;
	}
	
	public String getCa_id_caballoId() {
		return ca_id_caballoId;
	}
	
	private orm.Hip_corrida co_id_carrera;
	
	private String co_id_carreraId;
	
	private void setCo_id_carreraId(String value) {
		this.co_id_carreraId = value;
	}
	
	public String getCo_id_carreraId() {
		return co_id_carreraId;
	}
	
	private java.util.Set ORM_hip_apuesta = new java.util.HashSet();
	
	public void setCa_id_caballo(orm.Hip_caballos value) {
		if (ca_id_caballo != null) {
			ca_id_caballo.hip_caballos_hip_corrida.remove(this);
		}
		if (value != null) {
			value.hip_caballos_hip_corrida.add(this);
		}
	}
	
	public orm.Hip_caballos getCa_id_caballo() {
		return ca_id_caballo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Ca_id_caballo(orm.Hip_caballos value) {
		this.ca_id_caballo = value;
	}
	
	private orm.Hip_caballos getORM_Ca_id_caballo() {
		return ca_id_caballo;
	}
	
	public void setCo_id_carrera(orm.Hip_corrida value) {
		if (co_id_carrera != null) {
			co_id_carrera.hip_caballos_hip_corrida.remove(this);
		}
		if (value != null) {
			value.hip_caballos_hip_corrida.add(this);
		}
	}
	
	public orm.Hip_corrida getCo_id_carrera() {
		return co_id_carrera;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Co_id_carrera(orm.Hip_corrida value) {
		this.co_id_carrera = value;
	}
	
	private orm.Hip_corrida getORM_Co_id_carrera() {
		return co_id_carrera;
	}
	
	private void setORM_Hip_apuesta(java.util.Set value) {
		this.ORM_hip_apuesta = value;
	}
	
	private java.util.Set getORM_Hip_apuesta() {
		return ORM_hip_apuesta;
	}
	
	public final orm.Hip_apuestaSetCollection hip_apuesta = new orm.Hip_apuestaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_HIP_CABALLOS_HIP_CORRIDA_HIP_APUESTA, orm.ORMConstants.KEY_HIP_APUESTA_CA_ID_CABALLO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getCa_id_caballo() == null) ? "" : String.valueOf(getCa_id_caballo().getORMID())) + " " + ((getCo_id_carrera() == null) ? "" : String.valueOf(getCo_id_carrera().getORMID())));
	}
	
}
