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

public class Hip_logCriteria extends AbstractORMCriteria {
	public final IntegerExpression lo_id;
	public final StringExpression lo_hora;
	public final StringExpression lo_parametros;
	public final StringExpression lo_resultado;
	public final StringExpression lo_tiempo;
	
	public Hip_logCriteria(Criteria criteria) {
		super(criteria);
		lo_id = new IntegerExpression("lo_id", this);
		lo_hora = new StringExpression("lo_hora", this);
		lo_parametros = new StringExpression("lo_parametros", this);
		lo_resultado = new StringExpression("lo_resultado", this);
		lo_tiempo = new StringExpression("lo_tiempo", this);
	}
	
	public Hip_logCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_log.class));
	}
	
	public Hip_logCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_log uniqueHip_log() {
		return (Hip_log) super.uniqueResult();
	}
	
	public Hip_log[] listHip_log() {
		java.util.List list = super.list();
		return (Hip_log[]) list.toArray(new Hip_log[list.size()]);
	}
}

