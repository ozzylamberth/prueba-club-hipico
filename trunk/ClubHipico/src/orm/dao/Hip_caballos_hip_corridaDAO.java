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

public interface Hip_caballos_hip_corridaDAO {
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException;
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException;
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(String condition, String orderBy) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Hip_caballos_hip_corrida createHip_caballos_hip_corrida();
	public boolean save(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException;
	public boolean delete(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException;
	public boolean deleteAndDissociate(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException;
	public boolean evict(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException;
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByCriteria(Hip_caballos_hip_corridaCriteria hip_caballos_hip_corridaCriteria);
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByCriteria(Hip_caballos_hip_corridaCriteria hip_caballos_hip_corridaCriteria);
}
