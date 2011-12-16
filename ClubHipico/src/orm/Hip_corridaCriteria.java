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

public class Hip_corridaCriteria extends AbstractORMCriteria {
	public final StringExpression co_id_carrera;
	public final StringExpression co_fecha;
	public final StringExpression co_hora;
	
	public Hip_corridaCriteria(Criteria criteria) {
		super(criteria);
		co_id_carrera = new StringExpression("co_id_carrera", this);
		co_fecha = new StringExpression("co_fecha", this);
		co_hora = new StringExpression("co_hora", this);
	}
	
	public Hip_corridaCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_corrida.class));
	}
	
	public Hip_corridaCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_apuestaCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaCriteria(createCriteria("ORM_Hip_apuesta"));
	}
	
	public Hip_cajaCriteria createHip_cajaCriteria() {
		return new Hip_cajaCriteria(createCriteria("hip_caja"));
	}
	
	public Hip_corrida uniqueHip_corrida() {
		return (Hip_corrida) super.uniqueResult();
	}
	
	public Hip_corrida[] listHip_corrida() {
		java.util.List list = super.list();
		return (Hip_corrida[]) list.toArray(new Hip_corrida[list.size()]);
	}
}

