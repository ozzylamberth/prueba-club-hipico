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

public class Hip_apuestaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ap_id_apuesta;
	public final IntegerExpression ap_monto;
	public final StringExpression ap_tipo;
	
	public Hip_apuestaDetachedCriteria() {
		super(orm.Hip_apuesta.class, orm.Hip_apuestaCriteria.class);
		ap_id_apuesta = new IntegerExpression("ap_id_apuesta", this.getDetachedCriteria());
		ap_monto = new IntegerExpression("ap_monto", this.getDetachedCriteria());
		ap_tipo = new StringExpression("ap_tipo", this.getDetachedCriteria());
	}
	
	public Hip_apuestaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_apuestaCriteria.class);
		ap_id_apuesta = new IntegerExpression("ap_id_apuesta", this.getDetachedCriteria());
		ap_monto = new IntegerExpression("ap_monto", this.getDetachedCriteria());
		ap_tipo = new StringExpression("ap_tipo", this.getDetachedCriteria());
	}
	
	public Hip_caballosDetachedCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosDetachedCriteria(createCriteria("ca_id_caballo"));
	}
	
	public Hip_corridaDetachedCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaDetachedCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_apuesta uniqueHip_apuesta(PersistentSession session) {
		return (Hip_apuesta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_apuesta[] listHip_apuesta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_apuesta[]) list.toArray(new Hip_apuesta[list.size()]);
	}
}

