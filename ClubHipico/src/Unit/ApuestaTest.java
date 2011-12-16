package Unit;

import org.orm.PersistentException;

public class ApuestaTest {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		int monto=2000;
		System.out.println("resultado: "+new ws.ApuestaSOA().add(monto, "1er lugar", "cab0004", "carr0001"));
		
	}

}
