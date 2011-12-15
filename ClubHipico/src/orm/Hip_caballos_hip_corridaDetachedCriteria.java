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

public class Hip_caballos_hip_corridaDetachedCriteria extends AbstractORMDetachedCriteria {
	
	public Hip_caballos_hip_corridaDetachedCriteria() {
		super(orm.Hip_caballos_hip_corrida.class, orm.Hip_caballos_hip_corridaCriteria.class);
	}
	
	public Hip_caballos_hip_corridaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hip_caballos_hip_corridaCriteria.class);
	}
	
	public Hip_caballosDetachedCriteria createCa_id_caballoCriteria() {
		return new Hip_caballosDetachedCriteria(createCriteria("ORM_Ca_id_caballo"));
	}
	
	public Hip_corridaDetachedCriteria createCo_id_carreraCriteria() {
		return new Hip_corridaDetachedCriteria(createCriteria("ORM_Co_id_carrera"));
	}
	
	public Hip_apuestaDetachedCriteria createHip_apuestaCriteria() {
		return new Hip_apuestaDetachedCriteria(createCriteria("ORM_Hip_apuesta"));
	}
	
	public Hip_caballos_hip_corrida uniqueHip_caballos_hip_corrida(PersistentSession session) {
		return (Hip_caballos_hip_corrida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hip_caballos_hip_corrida[] listHip_caballos_hip_corrida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hip_caballos_hip_corrida[]) list.toArray(new Hip_caballos_hip_corrida[list.size()]);
	}
}

