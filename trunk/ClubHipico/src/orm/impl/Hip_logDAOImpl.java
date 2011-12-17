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

public class Hip_logDAOImpl implements orm.dao.Hip_logDAO {
	public Hip_log loadHip_logByORMID(int lo_id) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_logByORMID(session, lo_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log getHip_logByORMID(int lo_id) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_logByORMID(session, lo_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByORMID(int lo_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_logByORMID(session, lo_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log getHip_logByORMID(int lo_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_logByORMID(session, lo_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByORMID(PersistentSession session, int lo_id) throws PersistentException {
		try {
			return (Hip_log) session.load(orm.Hip_log.class, new Integer(lo_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log getHip_logByORMID(PersistentSession session, int lo_id) throws PersistentException {
		try {
			return (Hip_log) session.get(orm.Hip_log.class, new Integer(lo_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByORMID(PersistentSession session, int lo_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_log) session.load(orm.Hip_log.class, new Integer(lo_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log getHip_logByORMID(PersistentSession session, int lo_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_log) session.get(orm.Hip_log.class, new Integer(lo_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log[] listHip_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log[] listHip_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log[] listHip_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_log as Hip_log");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_log[]) list.toArray(new Hip_log[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log[] listHip_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_log as Hip_log");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_log[]) list.toArray(new Hip_log[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_log[] hip_logs = listHip_logByQuery(session, condition, orderBy);
		if (hip_logs != null && hip_logs.length > 0)
			return hip_logs[0];
		else
			return null;
	}
	
	public Hip_log loadHip_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_log[] hip_logs = listHip_logByQuery(session, condition, orderBy, lockMode);
		if (hip_logs != null && hip_logs.length > 0)
			return hip_logs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_logByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_logByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_logByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_logByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_logByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_log as Hip_log");
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
	
	public static java.util.Iterator iterateHip_logByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_log as Hip_log");
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
	
	public Hip_log createHip_log() {
		return new orm.Hip_log();
	}
	
	public boolean save(orm.Hip_log hip_log) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_log hip_log) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Hip_log hip_log) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_log hip_log) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_log);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_log loadHip_logByCriteria(Hip_logCriteria hip_logCriteria) {
		Hip_log[] hip_logs = listHip_logByCriteria(hip_logCriteria);
		if(hip_logs == null || hip_logs.length == 0) {
			return null;
		}
		return hip_logs[0];
	}
	
	public Hip_log[] listHip_logByCriteria(Hip_logCriteria hip_logCriteria) {
		return hip_logCriteria.listHip_log();
	}
}
