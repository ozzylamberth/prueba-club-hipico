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

public class Hip_caballo_carreraCriteria extends AbstractORMCriteria {
	public final IntegerExpression cc_id_caballoencarrera;
	
	public Hip_caballo_carreraCriteria(Criteria criteria) {
		super(criteria);
		cc_id_caballoencarrera = new IntegerExpression("cc_id_caballoencarrera", this);
	}
	
	public Hip_caballo_carreraCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_caballo_carrera.class));
	}
	
	public Hip_caballo_carreraCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_caballosCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosCriteria(createCriteria("ca_id_caballo"));
	}
	
	public Hip_corridaCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_caballo_carrera uniqueHip_caballo_carrera() {
		return (Hip_caballo_carrera) super.uniqueResult();
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carrera() {
		java.util.List list = super.list();
		return (Hip_caballo_carrera[]) list.toArray(new Hip_caballo_carrera[list.size()]);
	}
}

