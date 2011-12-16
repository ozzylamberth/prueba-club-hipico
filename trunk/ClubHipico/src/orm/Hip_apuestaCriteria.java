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

public class Hip_apuestaCriteria extends AbstractORMCriteria {
	public final StringExpression ap_id_apuesta;
	public final IntegerExpression ap_monto;
	public final StringExpression ap_tipo;
	
	public Hip_apuestaCriteria(Criteria criteria) {
		super(criteria);
		ap_id_apuesta = new StringExpression("ap_id_apuesta", this);
		ap_monto = new IntegerExpression("ap_monto", this);
		ap_tipo = new StringExpression("ap_tipo", this);
	}
	
	public Hip_apuestaCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_apuesta.class));
	}
	
	public Hip_apuestaCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_caballosCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosCriteria(createCriteria("ca_id_caballo"));
	}
	
	public Hip_corridaCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_apuesta uniqueHip_apuesta() {
		return (Hip_apuesta) super.uniqueResult();
	}
	
	public Hip_apuesta[] listHip_apuesta() {
		java.util.List list = super.list();
		return (Hip_apuesta[]) list.toArray(new Hip_apuesta[list.size()]);
	}
}

