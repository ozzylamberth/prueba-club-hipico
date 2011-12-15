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
package orm.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import orm.*;

public class Hip_caballos_hip_corridaDAOImpl implements orm.dao.Hip_caballos_hip_corridaDAO {
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballos_hip_corridaByORMID(session, ca_id_caballo, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballos_hip_corridaByORMID(session, ca_id_caballo, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballos_hip_corridaByORMID(session, ca_id_caballo, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballos_hip_corridaByORMID(session, ca_id_caballo, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException {
		try {
			Hip_caballos_hip_corrida hip_caballos_hip_corrida = new orm.Hip_caballos_hip_corrida();
			hip_caballos_hip_corrida.setCa_id_caballo(ca_id_caballo);
			hip_caballos_hip_corrida.setCo_id_carrera(co_id_carrera);
			
			return (Hip_caballos_hip_corrida) session.load(orm.Hip_caballos_hip_corrida.class, hip_caballos_hip_corrida);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera) throws PersistentException {
		try {
			Hip_caballos_hip_corrida hip_caballos_hip_corrida = new orm.Hip_caballos_hip_corrida();
			hip_caballos_hip_corrida.setCa_id_caballo(ca_id_caballo);
			hip_caballos_hip_corrida.setCo_id_carrera(co_id_carrera);
			
			return (Hip_caballos_hip_corrida) session.get(orm.Hip_caballos_hip_corrida.class, hip_caballos_hip_corrida);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Hip_caballos_hip_corrida hip_caballos_hip_corrida = new orm.Hip_caballos_hip_corrida();
			hip_caballos_hip_corrida.setCa_id_caballo(ca_id_caballo);
			hip_caballos_hip_corrida.setCo_id_carrera(co_id_carrera);
			
			return (Hip_caballos_hip_corrida) session.load(orm.Hip_caballos_hip_corrida.class, hip_caballos_hip_corrida, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida getHip_caballos_hip_corridaByORMID(PersistentSession session, orm.Hip_caballos ca_id_caballo, orm.Hip_corrida co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Hip_caballos_hip_corrida hip_caballos_hip_corrida = new orm.Hip_caballos_hip_corrida();
			hip_caballos_hip_corrida.setCa_id_caballo(ca_id_caballo);
			hip_caballos_hip_corrida.setCo_id_carrera(co_id_carrera);
			
			return (Hip_caballos_hip_corrida) session.get(orm.Hip_caballos_hip_corrida.class, hip_caballos_hip_corrida, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballos_hip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballos_hip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos_hip_corrida as Hip_caballos_hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_caballos_hip_corrida[]) list.toArray(new Hip_caballos_hip_corrida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos_hip_corrida as Hip_caballos_hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_caballos_hip_corrida[]) list.toArray(new Hip_caballos_hip_corrida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballos_hip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballos_hip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_caballos_hip_corrida[] hip_caballos_hip_corridas = listHip_caballos_hip_corridaByQuery(session, condition, orderBy);
		if (hip_caballos_hip_corridas != null && hip_caballos_hip_corridas.length > 0)
			return hip_caballos_hip_corridas[0];
		else
			return null;
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_caballos_hip_corrida[] hip_caballos_hip_corridas = listHip_caballos_hip_corridaByQuery(session, condition, orderBy, lockMode);
		if (hip_caballos_hip_corridas != null && hip_caballos_hip_corridas.length > 0)
			return hip_caballos_hip_corridas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_caballos_hip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballos_hip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballos_hip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballos_hip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos_hip_corrida as Hip_caballos_hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballos_hip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos_hip_corrida as Hip_caballos_hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida createHip_caballos_hip_corrida() {
		return new orm.Hip_caballos_hip_corrida();
	}
	
	public boolean save(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_caballos_hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_caballos_hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida)throws PersistentException {
		try {
			orm.Hip_caballos ca_id_caballo = hip_caballos_hip_corrida.getCa_id_caballo();
			if(hip_caballos_hip_corrida.getCa_id_caballo() != null) {
				hip_caballos_hip_corrida.getCa_id_caballo().hip_caballos_hip_corrida.remove(hip_caballos_hip_corrida);
			}
			hip_caballos_hip_corrida.setORM_Ca_id_caballo(ca_id_caballo);
			
			orm.Hip_corrida co_id_carrera = hip_caballos_hip_corrida.getCo_id_carrera();
			if(hip_caballos_hip_corrida.getCo_id_carrera() != null) {
				hip_caballos_hip_corrida.getCo_id_carrera().hip_caballos_hip_corrida.remove(hip_caballos_hip_corrida);
			}
			hip_caballos_hip_corrida.setORM_Co_id_carrera(co_id_carrera);
			
			orm.Hip_apuesta[] lHip_apuestas = hip_caballos_hip_corrida.hip_apuesta.toArray();
			for(int i = 0; i < lHip_apuestas.length; i++) {
				lHip_apuestas[i].setCa_id_caballo(null);
			}
			return delete(hip_caballos_hip_corrida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Hip_caballos ca_id_caballo = hip_caballos_hip_corrida.getCa_id_caballo();
			if(hip_caballos_hip_corrida.getCa_id_caballo() != null) {
				hip_caballos_hip_corrida.getCa_id_caballo().hip_caballos_hip_corrida.remove(hip_caballos_hip_corrida);
			}
			hip_caballos_hip_corrida.setORM_Ca_id_caballo(ca_id_caballo);
			
			orm.Hip_corrida co_id_carrera = hip_caballos_hip_corrida.getCo_id_carrera();
			if(hip_caballos_hip_corrida.getCo_id_carrera() != null) {
				hip_caballos_hip_corrida.getCo_id_carrera().hip_caballos_hip_corrida.remove(hip_caballos_hip_corrida);
			}
			hip_caballos_hip_corrida.setORM_Co_id_carrera(co_id_carrera);
			
			orm.Hip_apuesta[] lHip_apuestas = hip_caballos_hip_corrida.hip_apuesta.toArray();
			for(int i = 0; i < lHip_apuestas.length; i++) {
				lHip_apuestas[i].setCa_id_caballo(null);
			}
			try {
				session.delete(hip_caballos_hip_corrida);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_caballos_hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_caballos_hip_corrida hip_caballos_hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_caballos_hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos_hip_corrida loadHip_caballos_hip_corridaByCriteria(Hip_caballos_hip_corridaCriteria hip_caballos_hip_corridaCriteria) {
		Hip_caballos_hip_corrida[] hip_caballos_hip_corridas = listHip_caballos_hip_corridaByCriteria(hip_caballos_hip_corridaCriteria);
		if(hip_caballos_hip_corridas == null || hip_caballos_hip_corridas.length == 0) {
			return null;
		}
		return hip_caballos_hip_corridas[0];
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corridaByCriteria(Hip_caballos_hip_corridaCriteria hip_caballos_hip_corridaCriteria) {
		return hip_caballos_hip_corridaCriteria.listHip_caballos_hip_corrida();
	}
}
