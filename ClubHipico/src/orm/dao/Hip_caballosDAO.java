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

public interface Hip_caballosDAO {
	public Hip_caballos loadHip_caballosByORMID(String ca_id_caballo) throws PersistentException;
	public Hip_caballos getHip_caballosByORMID(String ca_id_caballo) throws PersistentException;
	public Hip_caballos loadHip_caballosByORMID(String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos getHip_caballosByORMID(String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos loadHip_caballosByORMID(PersistentSession session, String ca_id_caballo) throws PersistentException;
	public Hip_caballos getHip_caballosByORMID(PersistentSession session, String ca_id_caballo) throws PersistentException;
	public Hip_caballos loadHip_caballosByORMID(PersistentSession session, String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos getHip_caballosByORMID(PersistentSession session, String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos[] listHip_caballosByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballos[] listHip_caballosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos[] listHip_caballosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballos[] listHip_caballosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos loadHip_caballosByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballos loadHip_caballosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos loadHip_caballosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballos loadHip_caballosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos createHip_caballos();
	public boolean save(orm.Hip_caballos hip_caballos) throws PersistentException;
	public boolean delete(orm.Hip_caballos hip_caballos) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballos hip_caballos) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballos hip_caballos, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_caballos hip_caballos) throws PersistentException;
	public boolean evict(orm.Hip_caballos hip_caballos) throws PersistentException;
	public Hip_caballos loadHip_caballosByCriteria(Hip_caballosCriteria hip_caballosCriteria);
	public Hip_caballos[] listHip_caballosByCriteria(Hip_caballosCriteria hip_caballosCriteria);
}
