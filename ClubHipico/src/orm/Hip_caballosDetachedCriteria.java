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

public class Hip_caballosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ca_id_caballo;
	public final StringExpression ca_nombre;
	public final StringExpression ca_sexo;
	public final IntegerExpression ca_edad;
	
	public Hip_caballosDetachedCriteria() {
		super(orm.Hip_caballos.class, orm.Hip_caballosCriteria.class);
		ca_id_caballo = new StringExpression("ca_id_caballo", this.getDetachedCriteria());
		ca_nombre = new StringExpression("ca_nombre", this.getDetachedCriteria());
		ca_sexo = new StringExpression("ca_sexo", this.getDetachedCriteria());
		ca_edad = new IntegerExpression("ca_edad", this.getDetachedCriteria());
	}
	
	public Hip_caballosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_caballosCriteria.class);
		ca_id_caballo = new StringExpression("ca_id_caballo", this.getDetachedCriteria());
		ca_nombre = new StringExpression("ca_nombre", this.getDetachedCriteria());
		ca_sexo = new StringExpression("ca_sexo", this.getDetachedCriteria());
		ca_edad = new IntegerExpression("ca_edad", this.getDetachedCriteria());
	}
	
	public Hip_apuestaDetachedCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaDetachedCriteria(createCriteria("hip_apuesta"));
	}
	
	public Hip_caballo_carreraDetachedCriteria createHip_caballo_carreraCriteria() {
		return new Hip_caballo_carreraDetachedCriteria(createCriteria("hip_caballo_carrera"));
	}
	
	public Hip_caballos uniqueHip_caballos(PersistentSession session) {
		return (Hip_caballos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_caballos[] listHip_caballos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_caballos[]) list.toArray(new Hip_caballos[list.size()]);
	}
}

