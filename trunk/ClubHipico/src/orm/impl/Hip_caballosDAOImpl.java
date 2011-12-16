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

public class Hip_caballosDAOImpl implements orm.dao.Hip_caballosDAO {
	public Hip_caballos loadHip_caballosByORMID(String ca_id_caballo) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballosByORMID(session, ca_id_caballo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos getHip_caballosByORMID(String ca_id_caballo) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballosByORMID(session, ca_id_caballo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByORMID(String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballosByORMID(session, ca_id_caballo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos getHip_caballosByORMID(String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballosByORMID(session, ca_id_caballo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByORMID(PersistentSession session, String ca_id_caballo) throws PersistentException {
		try {
			return (Hip_caballos) session.load(orm.Hip_caballos.class, ca_id_caballo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos getHip_caballosByORMID(PersistentSession session, String ca_id_caballo) throws PersistentException {
		try {
			return (Hip_caballos) session.get(orm.Hip_caballos.class, ca_id_caballo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByORMID(PersistentSession session, String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caballos) session.load(orm.Hip_caballos.class, ca_id_caballo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos getHip_caballosByORMID(PersistentSession session, String ca_id_caballo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caballos) session.get(orm.Hip_caballos.class, ca_id_caballo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos[] listHip_caballosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos[] listHip_caballosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos[] listHip_caballosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos as Hip_caballos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_caballos[]) list.toArray(new Hip_caballos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos[] listHip_caballosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos as Hip_caballos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_caballos[]) list.toArray(new Hip_caballos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_caballos[] hip_caballoses = listHip_caballosByQuery(session, condition, orderBy);
		if (hip_caballoses != null && hip_caballoses.length > 0)
			return hip_caballoses[0];
		else
			return null;
	}
	
	public Hip_caballos loadHip_caballosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_caballos[] hip_caballoses = listHip_caballosByQuery(session, condition, orderBy, lockMode);
		if (hip_caballoses != null && hip_caballoses.length > 0)
			return hip_caballoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_caballosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos as Hip_caballos");
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
	
	public static java.util.Iterator iterateHip_caballosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballos as Hip_caballos");
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
	
	public Hip_caballos createHip_caballos() {
		return new orm.Hip_caballos();
	}
	
	public boolean save(orm.Hip_caballos hip_caballos) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_caballos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_caballos hip_caballos) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_caballos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballos hip_caballos)throws PersistentException {
		try {
			if(hip_caballos.getHip_apuesta() != null) {
				hip_caballos.getHip_apuesta().setCa_id_caballo(null);
			}
			
			if(hip_caballos.getHip_caballo_carrera() != null) {
				hip_caballos.getHip_caballo_carrera().setCa_id_caballo(null);
			}
			
			return delete(hip_caballos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballos hip_caballos, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hip_caballos.getHip_apuesta() != null) {
				hip_caballos.getHip_apuesta().setCa_id_caballo(null);
			}
			
			if(hip_caballos.getHip_caballo_carrera() != null) {
				hip_caballos.getHip_caballo_carrera().setCa_id_caballo(null);
			}
			
			try {
				session.delete(hip_caballos);
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
	
	public boolean refresh(orm.Hip_caballos hip_caballos) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_caballos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_caballos hip_caballos) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_caballos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballos loadHip_caballosByCriteria(Hip_caballosCriteria hip_caballosCriteria) {
		Hip_caballos[] hip_caballoses = listHip_caballosByCriteria(hip_caballosCriteria);
		if(hip_caballoses == null || hip_caballoses.length == 0) {
			return null;
		}
		return hip_caballoses[0];
	}
	
	public Hip_caballos[] listHip_caballosByCriteria(Hip_caballosCriteria hip_caballosCriteria) {
		return hip_caballosCriteria.listHip_caballos();
	}
}
