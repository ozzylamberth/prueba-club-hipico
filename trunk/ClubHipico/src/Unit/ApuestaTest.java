package Unit;

import org.orm.PersistentException;

public class ApuestaTest {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		
		System.out.println("resultado: "+new ws.ApuestaSOA().add(2000, "1er lugar", "cab0003", "carr0001"));
		
	}

}
