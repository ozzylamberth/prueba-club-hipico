package Unit;

import org.orm.PersistentException;

public class CaballoEnCarreraTest {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {


		
		System.out.println("respuesta: "+new ws.CaballoEnCarreraSOA().add("cab0001", "carr0001"));

	}

}
