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

public class Hip_cajaDAOImpl implements orm.dao.Hip_cajaDAO {
	public Hip_caja loadHip_cajaByORMID(String caj_id_caja) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_cajaByORMID(session, caj_id_caja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja getHip_cajaByORMID(String caj_id_caja) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_cajaByORMID(session, caj_id_caja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByORMID(String caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_cajaByORMID(session, caj_id_caja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja getHip_cajaByORMID(String caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_cajaByORMID(session, caj_id_caja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByORMID(PersistentSession session, String caj_id_caja) throws PersistentException {
		try {
			return (Hip_caja) session.load(orm.Hip_caja.class, caj_id_caja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja getHip_cajaByORMID(PersistentSession session, String caj_id_caja) throws PersistentException {
		try {
			return (Hip_caja) session.get(orm.Hip_caja.class, caj_id_caja);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByORMID(PersistentSession session, String caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caja) session.load(orm.Hip_caja.class, caj_id_caja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja getHip_cajaByORMID(PersistentSession session, String caj_id_caja, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caja) session.get(orm.Hip_caja.class, caj_id_caja, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja[] listHip_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja[] listHip_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja[] listHip_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caja as Hip_caja");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_caja[]) list.toArray(new Hip_caja[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja[] listHip_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caja as Hip_caja");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_caja[]) list.toArray(new Hip_caja[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_caja[] hip_cajas = listHip_cajaByQuery(session, condition, orderBy);
		if (hip_cajas != null && hip_cajas.length > 0)
			return hip_cajas[0];
		else
			return null;
	}
	
	public Hip_caja loadHip_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_caja[] hip_cajas = listHip_cajaByQuery(session, condition, orderBy, lockMode);
		if (hip_cajas != null && hip_cajas.length > 0)
			return hip_cajas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_cajaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_cajaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_cajaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_cajaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_cajaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caja as Hip_caja");
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
	
	public static java.util.Iterator iterateHip_cajaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caja as Hip_caja");
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
	
	public Hip_caja createHip_caja() {
		return new orm.Hip_caja();
	}
	
	public boolean save(orm.Hip_caja hip_caja) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_caja hip_caja) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caja hip_caja)throws PersistentException {
		try {
			if(hip_caja.getCo_id_carrera() != null) {
				hip_caja.getCo_id_carrera().setHip_caja(null);
			}
			
			return delete(hip_caja);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caja hip_caja, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hip_caja.getCo_id_carrera() != null) {
				hip_caja.getCo_id_carrera().setHip_caja(null);
			}
			
			try {
				session.delete(hip_caja);
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
	
	public boolean refresh(orm.Hip_caja hip_caja) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_caja hip_caja) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_caja);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caja loadHip_cajaByCriteria(Hip_cajaCriteria hip_cajaCriteria) {
		Hip_caja[] hip_cajas = listHip_cajaByCriteria(hip_cajaCriteria);
		if(hip_cajas == null || hip_cajas.length == 0) {
			return null;
		}
		return hip_cajas[0];
	}
	
	public Hip_caja[] listHip_cajaByCriteria(Hip_cajaCriteria hip_cajaCriteria) {
		return hip_cajaCriteria.listHip_caja();
	}
}
