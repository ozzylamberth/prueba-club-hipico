package Unit;

import org.orm.PersistentException;

public class CajaTest {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {


		
		System.out.println("resultado: "+new ws.CajaSOA().add("caj0001", 10000, "carr0001"));

	}

}
