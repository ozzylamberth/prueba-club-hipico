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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Hip_logDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression lo_id;
	public final StringExpression lo_hora;
	public final StringExpression lo_parametros;
	public final StringExpression lo_resultado;
	public final StringExpression lo_tiempo;
	
	public Hip_logDetachedCriteria() {
		super(orm.Hip_log.class, orm.Hip_logCriteria.class);
		lo_id = new IntegerExpression("lo_id", this.getDetachedCriteria());
		lo_hora = new StringExpression("lo_hora", this.getDetachedCriteria());
		lo_parametros = new StringExpression("lo_parametros", this.getDetachedCriteria());
		lo_resultado = new StringExpression("lo_resultado", this.getDetachedCriteria());
		lo_tiempo = new StringExpression("lo_tiempo", this.getDetachedCriteria());
	}
	
	public Hip_logDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_logCriteria.class);
		lo_id = new IntegerExpression("lo_id", this.getDetachedCriteria());
		lo_hora = new StringExpression("lo_hora", this.getDetachedCriteria());
		lo_parametros = new StringExpression("lo_parametros", this.getDetachedCriteria());
		lo_resultado = new StringExpression("lo_resultado", this.getDetachedCriteria());
		lo_tiempo = new StringExpression("lo_tiempo", this.getDetachedCriteria());
	}
	
	public Hip_log uniqueHip_log(PersistentSession session) {
		return (Hip_log) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_log[] listHip_log(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_log[]) list.toArray(new Hip_log[list.size()]);
	}
}

