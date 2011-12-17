package Unit;

import org.orm.PersistentException;

public class ApuestaTest {

	/**
	 * @param args
	 * @throws PersistentException 
	 */
	public static void main(String[] args) throws PersistentException {
		
		
		System.out.println("resultado: "+new ws.ApuestaSOA().add(20000, "1er lugar", "cab0004", "carr0001"));
		System.out.println("resultado: "+new ws.ApuestaSOA().add(100, "2er lugar", "cab0004", "carr0001"));
		System.out.println("resultado: "+new ws.ApuestaSOA().add(1500, "3er lugar", "cab0008", "carr0001"));
		System.out.println("resultado: "+new ws.ApuestaSOA().add(8000, "1er lugar", "cab0002", "carr0001"));
		
		
	}

}
