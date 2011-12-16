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

public class Hip_caballosCriteria extends AbstractORMCriteria {
	public final StringExpression ca_id_caballo;
	public final StringExpression ca_nombre;
	public final StringExpression ca_sexo;
	public final IntegerExpression ca_edad;
	
	public Hip_caballosCriteria(Criteria criteria) {
		super(criteria);
		ca_id_caballo = new StringExpression("ca_id_caballo", this);
		ca_nombre = new StringExpression("ca_nombre", this);
		ca_sexo = new StringExpression("ca_sexo", this);
		ca_edad = new IntegerExpression("ca_edad", this);
	}
	
	public Hip_caballosCriteria(PersistentSession session) {
		this(session.createCriteria(Hip_caballos.class));
	}
	
	public Hip_caballosCriteria() throws PersistentException {
		this(orm.HipicoPersistentManager.instance().getSession());
	}
	
	public Hip_corridaCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaCriteria(createCriteria("ORM_Co_id_carrera"));
	}
	
	public Hip_apuestaCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaCriteria(createCriteria("hip_apuesta"));
	}
	
	public Hip_caballos uniqueHip_caballos() {
		return (Hip_caballos) super.uniqueResult();
	}
	
	public Hip_caballos[] listHip_caballos() {
		java.util.List list = super.list();
		return (Hip_caballos[]) list.toArray(new Hip_caballos[list.size()]);
	}
}

