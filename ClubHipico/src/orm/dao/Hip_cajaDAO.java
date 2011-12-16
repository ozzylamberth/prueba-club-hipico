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

public interface Hip_cajaDAO {
	public Hip_caja loadHip_cajaByORMID(int caj_id_caja) throws PersistentException;
	public Hip_caja getHip_cajaByORMID(int caj_id_caja) throws PersistentException;
	public Hip_caja loadHip_cajaByORMID(int caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja getHip_cajaByORMID(int caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja loadHip_cajaByORMID(PersistentSession session, int caj_id_caja) throws PersistentException;
	public Hip_caja getHip_cajaByORMID(PersistentSession session, int caj_id_caja) throws PersistentException;
	public Hip_caja loadHip_cajaByORMID(PersistentSession session, int caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja getHip_cajaByORMID(PersistentSession session, int caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja[] listHip_cajaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caja[] listHip_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja[] listHip_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caja[] listHip_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja loadHip_cajaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caja loadHip_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja loadHip_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caja loadHip_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caja createHip_caja();
	public boolean save(orm.Hip_caja hip_caja) throws PersistentException;
	public boolean delete(orm.Hip_caja hip_caja) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caja hip_caja) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caja hip_caja, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_caja hip_caja) throws PersistentException;
	public boolean evict(orm.Hip_caja hip_caja) throws PersistentException;
	public Hip_caja loadHip_cajaByCriteria(Hip_cajaCriteria hip_cajaCriteria);
	public Hip_caja[] listHip_cajaByCriteria(Hip_cajaCriteria hip_cajaCriteria);
}
