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

public interface Hip_corridaDAO {
	public Hip_corrida loadHip_corridaByORMID(String co_id_carrera) throws PersistentException;
	public Hip_corrida getHip_corridaByORMID(String co_id_carrera) throws PersistentException;
	public Hip_corrida loadHip_corridaByORMID(String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida getHip_corridaByORMID(String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida loadHip_corridaByORMID(PersistentSession session, String co_id_carrera) throws PersistentException;
	public Hip_corrida getHip_corridaByORMID(PersistentSession session, String co_id_carrera) throws PersistentException;
	public Hip_corrida loadHip_corridaByORMID(PersistentSession session, String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida getHip_corridaByORMID(PersistentSession session, String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida[] listHip_corridaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_corrida[] listHip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida[] listHip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_corrida[] listHip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida loadHip_corridaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_corrida loadHip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida loadHip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_corrida loadHip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_corrida createHip_corrida();
	public boolean save(orm.Hip_corrida hip_corrida) throws PersistentException;
	public boolean delete(orm.Hip_corrida hip_corrida) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_corrida hip_corrida) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_corrida hip_corrida, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_corrida hip_corrida) throws PersistentException;
	public boolean evict(orm.Hip_corrida hip_corrida) throws PersistentException;
	public Hip_corrida loadHip_corridaByCriteria(Hip_corridaCriteria hip_corridaCriteria);
	public Hip_corrida[] listHip_corridaByCriteria(Hip_corridaCriteria hip_corridaCriteria);
}
