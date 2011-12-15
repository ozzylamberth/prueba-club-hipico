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

public class Hip_cajaCriteria extends AbstractORMCriteria {
	public final StringExpression caj_id_caja;
	public final IntegerExpression ganancia;
	
	public Hip_cajaCriteria(Criteria criteria) {
		super(criteria);
		caj_id_caja = new StringExpression("caj_id_caja", this);
		ganancia = new IntegerExpression("ganancia", this);
	}
	
	public Hip_cajaCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_caja.class));
	}
	
	public Hip_cajaCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_corridaCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaCriteria(createCriteria("co_id_carrera"));
	}
	
	public Hip_caja uniqueHip_caja() {
		return (Hip_caja) super.uniqueResult();
	}
	
	public Hip_caja[] listHip_caja() {
		java.util.List list = super.list();
		return (Hip_caja[]) list.toArray(new Hip_caja[list.size()]);
	}
}

