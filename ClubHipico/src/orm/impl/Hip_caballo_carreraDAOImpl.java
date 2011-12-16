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

public class Hip_caballo_carreraDAOImpl implements orm.dao.Hip_caballo_carreraDAO {
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(int cc_id_caballoencarrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballo_carreraByORMID(session, cc_id_caballoencarrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(int cc_id_caballoencarrera) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballo_carreraByORMID(session, cc_id_caballoencarrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballo_carreraByORMID(session, cc_id_caballoencarrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return getHip_caballo_carreraByORMID(session, cc_id_caballoencarrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera) throws PersistentException {
		try {
			return (Hip_caballo_carrera) session.load(orm.Hip_caballo_carrera.class, new Integer(cc_id_caballoencarrera));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera) throws PersistentException {
		try {
			return (Hip_caballo_carrera) session.get(orm.Hip_caballo_carrera.class, new Integer(cc_id_caballoencarrera));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caballo_carrera) session.load(orm.Hip_caballo_carrera.class, new Integer(cc_id_caballoencarrera), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera getHip_caballo_carreraByORMID(PersistentSession session, int cc_id_caballoencarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hip_caballo_carrera) session.get(orm.Hip_caballo_carrera.class, new Integer(cc_id_caballoencarrera), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballo_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return listHip_caballo_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballo_carrera as Hip_caballo_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Hip_caballo_carrera[]) list.toArray(new Hip_caballo_carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballo_carrera as Hip_caballo_carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Hip_caballo_carrera[]) list.toArray(new Hip_caballo_carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballo_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return loadHip_caballo_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hip_caballo_carrera[] hip_caballo_carreras = listHip_caballo_carreraByQuery(session, condition, orderBy);
		if (hip_caballo_carreras != null && hip_caballo_carreras.length > 0)
			return hip_caballo_carreras[0];
		else
			return null;
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hip_caballo_carrera[] hip_caballo_carreras = listHip_caballo_carreraByQuery(session, condition, orderBy, lockMode);
		if (hip_caballo_carreras != null && hip_caballo_carreras.length > 0)
			return hip_caballo_carreras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHip_caballo_carreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballo_carreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballo_carreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.HipicoPersistentManager.instance().getSession();
			return iterateHip_caballo_carreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballo_carrera as Hip_caballo_carrera");
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
	
	public static java.util.Iterator iterateHip_caballo_carreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hip_caballo_carrera as Hip_caballo_carrera");
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
	
	public Hip_caballo_carrera createHip_caballo_carrera() {
		return new orm.Hip_caballo_carrera();
	}
	
	public boolean save(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().saveObject(hip_caballo_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().deleteObject(hip_caballo_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballo_carrera hip_caballo_carrera)throws PersistentException {
		try {
			if(hip_caballo_carrera.getCa_id_caballo() != null) {
				hip_caballo_carrera.getCa_id_caballo().setHip_caballo_carrera(null);
			}
			
			if(hip_caballo_carrera.getCo_id_carrera() != null) {
				hip_caballo_carrera.getCo_id_carrera().setHip_caballo_carrera(null);
			}
			
			return delete(hip_caballo_carrera);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(orm.Hip_caballo_carrera hip_caballo_carrera, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hip_caballo_carrera.getCa_id_caballo() != null) {
				hip_caballo_carrera.getCa_id_caballo().setHip_caballo_carrera(null);
			}
			
			if(hip_caballo_carrera.getCo_id_carrera() != null) {
				hip_caballo_carrera.getCo_id_carrera().setHip_caballo_carrera(null);
			}
			
			try {
				session.delete(hip_caballo_carrera);
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
	
	public boolean refresh(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().refresh(hip_caballo_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Hip_caballo_carrera hip_caballo_carrera) throws PersistentException {
		try {
			orm.HipicoPersistentManager.instance().getSession().evict(hip_caballo_carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Hip_caballo_carrera loadHip_caballo_carreraByCriteria(Hip_caballo_carreraCriteria hip_caballo_carreraCriteria) {
		Hip_caballo_carrera[] hip_caballo_carreras = listHip_caballo_carreraByCriteria(hip_caballo_carreraCriteria);
		if(hip_caballo_carreras == null || hip_caballo_carreras.length == 0) {
			return null;
		}
		return hip_caballo_carreras[0];
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carreraByCriteria(Hip_caballo_carreraCriteria hip_caballo_carreraCriteria) {
		return hip_caballo_carreraCriteria.listHip_caballo_carrera();
	}
}
