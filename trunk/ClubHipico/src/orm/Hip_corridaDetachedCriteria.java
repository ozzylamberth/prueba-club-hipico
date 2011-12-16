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

public class Hip_corridaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression co_id_carrera;
	public final StringExpression co_fecha;
	public final StringExpression co_hora;
	
	public Hip_corridaDetachedCriteria() {
		super(orm.Hip_corrida.class, orm.Hip_corridaCriteria.class);
		co_id_carrera = new StringExpression("co_id_carrera", this.getDetachedCriteria());
		co_fecha = new StringExpression("co_fecha", this.getDetachedCriteria());
		co_hora = new StringExpression("co_hora", this.getDetachedCriteria());
	}
	
	public Hip_corridaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_corridaCriteria.class);
		co_id_carrera = new StringExpression("co_id_carrera", this.getDetachedCriteria());
		co_fecha = new StringExpression("co_fecha", this.getDetachedCriteria());
		co_hora = new StringExpression("co_hora", this.getDetachedCriteria());
	}
	
	public Hip_cajaDetachedCriteria createHip_cajaCriteria() {
		return new Hip_cajaDetachedCriteria(createCriteria("hip_caja"));
	}
	
	public Hip_apuestaDetachedCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaDetachedCriteria(createCriteria("hip_apuesta"));
	}
	
	public Hip_caballo_carreraDetachedCriteria createHip_caballo_carreraCriteria() {
		return new Hip_caballo_carreraDetachedCriteria(createCriteria("hip_caballo_carrera"));
	}
	
	public Hip_corrida uniqueHip_corrida(PersistentSession session) {
		return (Hip_corrida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_corrida[] listHip_corrida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_corrida[]) list.toArray(new Hip_corrida[list.size()]);
	}
}

