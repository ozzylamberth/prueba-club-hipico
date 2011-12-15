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

public class Hip_cajaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression caj_id_caja;
	public final IntegerExpression ganancia;
	
	public Hip_cajaDetachedCriteria() {
		super(orm.Hip_caja.class, orm.Hip_cajaCriteria.class);
		caj_id_caja = new StringExpression("caj_id_caja", this.getDetachedCriteria());
		ganancia = new IntegerExpression("ganancia", this.getDetachedCriteria());
	}
	
	public Hip_cajaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_cajaCriteria.class);
		caj_id_caja = new StringExpression("caj_id_caja", this.getDetachedCriteria());
		ganancia = new IntegerExpression("ganancia", this.getDetachedCriteria());
	}
	
	public Hip_corridaDetachedCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaDetachedCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_caja uniqueHip_caja(PersistentSession session) {
		return (Hip_caja) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_caja[] listHip_caja(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_caja[]) list.toArray(new Hip_caja[list.size()]);
	}
}

