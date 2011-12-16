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

public class Hip_corridaDAOImpl implements orm.dao.Hip_corridaDAO {
	public Hip_corrida loadHip_corridaByORMID(String co_id_carrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_corridaByORMID(session, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida getHip_corridaByORMID(String co_id_carrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_corridaByORMID(session, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByORMID(String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_corridaByORMID(session, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida getHip_corridaByORMID(String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_corridaByORMID(session, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByORMID(PersistentSession session, String co_id_carrera) throws PersistentException {
		try {
			return (Hip_corrida) session.load(orm.Hip_corrida.class, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida getHip_corridaByORMID(PersistentSession session, String co_id_carrera) throws PersistentException {
		try {
			return (Hip_corrida) session.get(orm.Hip_corrida.class, co_id_carrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByORMID(PersistentSession session, String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_corrida) session.load(orm.Hip_corrida.class, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida getHip_corridaByORMID(PersistentSession session, String co_id_carrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_corrida) session.get(orm.Hip_corrida.class, co_id_carrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida[] listHip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida[] listHip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida[] listHip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_corrida as Hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_corrida[]) list.toArray(new Hip_corrida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida[] listHip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_corrida as Hip_corrida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_corrida[]) list.toArray(new Hip_corrida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_corrida[] hip_corridas = listHip_corridaByQuery(session, condition, orderBy);
		if (hip_corridas != null && hip_corridas.length > 0)
			return hip_corridas[0];
		else
			return null;
	}
	
	public Hip_corrida loadHip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_corrida[] hip_corridas = listHip_corridaByQuery(session, condition, orderBy, lockMode);
		if (hip_corridas != null && hip_corridas.length > 0)
			return hip_corridas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_corridaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_corridaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_corridaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_corridaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_corridaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_corrida as Hip_corrida");
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
	
	public static java.util.Iterator iterateHip_corridaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_corrida as Hip_corrida");
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
	
	public Hip_corrida createHip_corrida() {
		return new orm.Hip_corrida();
	}
	
	public boolean save(orm.Hip_corrida hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_corrida hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_corrida hip_corrida)throws PersistentException {
		try {
			orm.Hip_apuesta[] lHip_apuestas = hip_corrida.hip_apuesta.toArray();
			for(int i = 0; i < lHip_apuestas.length; i++) {
				lHip_apuestas[i].setCo_id_carrera(null);
			}
			if(hip_corrida.getHip_caja() != null) {
				hip_corrida.getHip_caja().setCo_id_carrera(null);
			}
			
			return delete(hip_corrida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_corrida hip_corrida, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Hip_apuesta[] lHip_apuestas = hip_corrida.hip_apuesta.toArray();
			for(int i = 0; i < lHip_apuestas.length; i++) {
				lHip_apuestas[i].setCo_id_carrera(null);
			}
			if(hip_corrida.getHip_caja() != null) {
				hip_corrida.getHip_caja().setCo_id_carrera(null);
			}
			
			try {
				session.delete(hip_corrida);
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
	
	public boolean refresh(orm.Hip_corrida hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_corrida hip_corrida) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_corrida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_corrida loadHip_corridaByCriteria(Hip_corridaCriteria hip_corridaCriteria) {
		Hip_corrida[] hip_corridas = listHip_corridaByCriteria(hip_corridaCriteria);
		if(hip_corridas == null || hip_corridas.length == 0) {
			return null;
		}
		return hip_corridas[0];
	}
	
	public Hip_corrida[] listHip_corridaByCriteria(Hip_corridaCriteria hip_corridaCriteria) {
		return hip_corridaCriteria.listHip_corrida();
	}
}
