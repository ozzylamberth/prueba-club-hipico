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

public interface Hip_logDAO {
	public Hip_log loadHip_logByORMID(int lo_id) throws PersistentException;
	public Hip_log getHip_logByORMID(int lo_id) throws PersistentException;
	public Hip_log loadHip_logByORMID(int lo_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log getHip_logByORMID(int lo_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log loadHip_logByORMID(PersistentSession session, int lo_id) throws PersistentException;
	public Hip_log getHip_logByORMID(PersistentSession session, int lo_id) throws PersistentException;
	public Hip_log loadHip_logByORMID(PersistentSession session, int lo_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log getHip_logByORMID(PersistentSession session, int lo_id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log[] listHip_logByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_log[] listHip_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log[] listHip_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_log[] listHip_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log loadHip_logByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_log loadHip_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log loadHip_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_log loadHip_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_log createHip_log();
	public boolean save(orm.Hip_log hip_log) throws PersistentException;
	public boolean delete(orm.Hip_log hip_log) throws PersistentException;
	public boolean refresh(orm.Hip_log hip_log) throws PersistentException;
	public boolean evict(orm.Hip_log hip_log) throws PersistentException;
	public Hip_log loadHip_logByCriteria(Hip_logCriteria hip_logCriteria);
	public Hip_log[] listHip_logByCriteria(Hip_logCriteria hip_logCriteria);
}
