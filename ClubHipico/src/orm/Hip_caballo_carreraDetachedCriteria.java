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

public class Hip_caballo_carreraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression cc_id_caballoencarrera;
	
	public Hip_caballo_carreraDetachedCriteria() {
		super(orm.Hip_caballo_carrera.class, orm.Hip_caballo_carreraCriteria.class);
		cc_id_caballoencarrera = new IntegerExpression("cc_id_caballoencarrera", this.getDetachedCriteria());
	}
	
	public Hip_caballo_carreraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_caballo_carreraCriteria.class);
		cc_id_caballoencarrera = new IntegerExpression("cc_id_caballoencarrera", this.getDetachedCriteria());
	}
	
	public Hip_caballosDetachedCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosDetachedCriteria(createCriteria("ca_id_caballo"));
	}
	
	public Hip_corridaDetachedCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaDetachedCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_caballo_carrera uniqueHip_caballo_carrera(PersistentSession session) {
		return (Hip_caballo_carrera) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_caballo_carrera[] listHip_caballo_carrera(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_caballo_carrera[]) list.toArray(new Hip_caballo_carrera[list.size()]);
	}
}

