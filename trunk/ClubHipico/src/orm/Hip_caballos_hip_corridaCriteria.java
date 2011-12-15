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
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Hip_caballos_hip_corridaCriteria extends AbstractORMCriteria {
	
	public Hip_caballos_hip_corridaCriteria(Criteria criteria) {
		super(criteria);
	}
	
	public Hip_caballos_hip_corridaCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_caballos_hip_corrida.class));
	}
	
	public Hip_caballos_hip_corridaCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_caballosCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosCriteria(createCriteria("ORM_Ca_id_caballo"));
	}
	
	public Hip_corridaCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaCriteria(createCriteria("ORM_Co_id_carrera"));
	}
	
	public Hip_apuestaCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaCriteria(createCriteria("ORM_Hip_apuesta"));
	}
	
	public Hip_caballos_hip_corrida uniqueHip_caballos_hip_corrida() {
		return (Hip_caballos_hip_corrida) super.uniqueResult();
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corrida() {
		java.util.List list = super.list();
		return (Hip_caballos_hip_corrida[]) list.toArray(new Hip_caballos_hip_corrida[list.size()]);
	}
}

