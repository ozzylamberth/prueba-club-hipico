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

public class Hip_apuestaDAOImpl implements orm.dao.Hip_apuestaDAO {
	public Hip_apuesta loadHip_apuestaByORMID(int ap_id_apuesta) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_apuestaByORMID(session, ap_id_apuesta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta getHip_apuestaByORMID(int ap_id_apuesta) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_apuestaByORMID(session, ap_id_apuesta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByORMID(int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_apuestaByORMID(session, ap_id_apuesta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta getHip_apuestaByORMID(int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_apuestaByORMID(session, ap_id_apuesta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta) throws PersistentException {
		try {
			return (Hip_apuesta) session.load(orm.Hip_apuesta.class, new Integer(ap_id_apuesta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta getHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta) throws PersistentException {
		try {
			return (Hip_apuesta) session.get(orm.Hip_apuesta.class, new Integer(ap_id_apuesta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_apuesta) session.load(orm.Hip_apuesta.class, new Integer(ap_id_apuesta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta getHip_apuestaByORMID(PersistentSession session, int ap_id_apuesta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_apuesta) session.get(orm.Hip_apuesta.class, new Integer(ap_id_apuesta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta[] listHip_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta[] listHip_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta[] listHip_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_apuesta as Hip_apuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_apuesta[]) list.toArray(new Hip_apuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta[] listHip_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_apuesta as Hip_apuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_apuesta[]) list.toArray(new Hip_apuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_apuesta[] hip_apuestas = listHip_apuestaByQuery(session, condition, orderBy);
		if (hip_apuestas != null && hip_apuestas.length > 0)
			return hip_apuestas[0];
		else
			return null;
	}
	
	public Hip_apuesta loadHip_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_apuesta[] hip_apuestas = listHip_apuestaByQuery(session, condition, orderBy, lockMode);
		if (hip_apuestas != null && hip_apuestas.length > 0)
			return hip_apuestas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_apuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_apuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_apuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_apuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_apuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_apuesta as Hip_apuesta");
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
	
	public static java.util.Iterator iterateHip_apuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_apuesta as Hip_apuesta");
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
	
	public Hip_apuesta createHip_apuesta() {
		return new orm.Hip_apuesta();
	}
	
	public boolean save(orm.Hip_apuesta hip_apuesta) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_apuesta hip_apuesta) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_apuesta hip_apuesta)throws PersistentException {
		try {
			if(hip_apuesta.getCa_id_caballo() != null) {
				hip_apuesta.getCa_id_caballo().hip_apuesta.remove(hip_apuesta);
			}
			
			if(hip_apuesta.getCo_id_carrera() != null) {
				hip_apuesta.getCo_id_carrera().hip_apuesta.remove(hip_apuesta);
			}
			
			return delete(hip_apuesta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_apuesta hip_apuesta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hip_apuesta.getCa_id_caballo() != null) {
				hip_apuesta.getCa_id_caballo().hip_apuesta.remove(hip_apuesta);
			}
			
			if(hip_apuesta.getCo_id_carrera() != null) {
				hip_apuesta.getCo_id_carrera().hip_apuesta.remove(hip_apuesta);
			}
			
			try {
				session.delete(hip_apuesta);
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
	
	public boolean refresh(orm.Hip_apuesta hip_apuesta) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_apuesta hip_apuesta) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_apuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_apuesta loadHip_apuestaByCriteria(Hip_apuestaCriteria hip_apuestaCriteria) {
		Hip_apuesta[] hip_apuestas = listHip_apuestaByCriteria(hip_apuestaCriteria);
		if(hip_apuestas == null || hip_apuestas.length == 0) {
			return null;
		}
		return hip_apuestas[0];
	}
	
	public Hip_apuesta[] listHip_apuestaByCriteria(Hip_apuestaCriteria hip_apuestaCriteria) {
		return hip_apuestaCriteria.listHip_apuesta();
	}
}
