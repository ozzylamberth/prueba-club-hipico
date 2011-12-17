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
public class Hip_log implements Serializable {
	public Hip_log() {
	}
	
	private int lo_id;
	
	private String lo_hora;
	
	private String lo_parametros;
	
	private String lo_resultado;
	
	private String lo_tiempo;
	
	private void setLo_id(int value) {
		this.lo_id = value;
	}
	
	public int getLo_id() {
		return lo_id;
	}
	
	public int getORMID() {
		return getLo_id();
	}
	
	public void setLo_hora(String value) {
		this.lo_hora = value;
	}
	
	public String getLo_hora() {
		return lo_hora;
	}
	
	public void setLo_parametros(String value) {
		this.lo_parametros = value;
	}
	
	public String getLo_parametros() {
		return lo_parametros;
	}
	
	public void setLo_resultado(String value) {
		this.lo_resultado = value;
	}
	
	public String getLo_resultado() {
		return lo_resultado;
	}
	
	public void setLo_tiempo(String value) {
		this.lo_tiempo = value;
	}
	
	public String getLo_tiempo() {
		return lo_tiempo;
	}
	
	public String toString() {
		return String.valueOf(getLo_id());
	}
	
}
