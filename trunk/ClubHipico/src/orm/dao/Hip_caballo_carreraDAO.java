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

public interface Hip_caballo_carreraDAO {
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(int cc_id_caballoencarrera) throws PersistentException;
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(int cc_id_caballoencarrera) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera) throws PersistentException;
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballo_carrera createHip_caballo_carrera();
	public boolean save(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException;
	public boolean delete(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballo_carrera hip_caballo_carrera, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException;
	public boolean evict(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException;
	public Hip_caballo_carrera loadHip_caballo_carreraByCriteria(Hip_caballo_carreraCriteria hip_caballo_carreraCriteria);
	public Hip_caballo_carrera[] listHip_caballo_carreraByCriteria(Hip_caballo_carreraCriteria hip_caballo_carreraCriteria);
}
