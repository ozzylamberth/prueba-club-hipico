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
package orm.dao;

import org.orm.*;
import orm.*;

public interface Hip_apuestaDAO {
	public Hip_apuesta loadHip_apuestaByORMID(int ap_id_apuesta) throws PersistentException;
	public Hip_apuesta getHip_apuestaByORMID(int ap_id_apuesta) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByORMID(int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta getHip_apuestaByORMID(int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta) throws PersistentException;
	public Hip_apuesta getHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta getHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta[] listHip_apuestaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_apuesta[] listHip_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta[] listHip_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_apuesta[] listHip_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_apuesta createHip_apuesta();
	public boolean save(orm.Hip_apuesta hip_apuesta) throws PersistentException;
	public boolean delete(orm.Hip_apuesta hip_apuesta) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_apuesta hip_apuesta) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_apuesta hip_apuesta, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_apuesta hip_apuesta) throws PersistentException;
	public boolean evict(orm.Hip_apuesta hip_apuesta) throws PersistentException;
	public Hip_apuesta loadHip_apuestaByCriteria(Hip_apuestaCriteria hip_apuestaCriteria);
	public Hip_apuesta[] listHip_apuestaByCriteria(Hip_apuestaCriteria hip_apuestaCriteria);
}
