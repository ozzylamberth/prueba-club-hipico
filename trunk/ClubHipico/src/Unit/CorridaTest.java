package Unit;

/** prueba unitarias para agregar corridas y mostrar corridas
 * @author erwin
 *
 */
public class CorridaTest {
	
	
	public static void main (String[] args){

		
		System.out.println("mensaje: "+new ws.CorridaSOA().add("carr0001", "22/12/11", "17:45", 0,0));
		System.out.println("mensaje: "+new ws.CorridaSOA().add("carr0002", "22/12/11", "17:45", 0,0));
		System.out.println("mensaje: "+new ws.CorridaSOA().add("carr0003", "23/12/11", "17:45", 0,0));
		System.out.println("mensaje: "+new ws.CorridaSOA().add("carr0004", "24/12/11", "17:45", 0,0));
		//System.out.println("mensaje: "+new ws.CorridaSOA().add(co_id_carrera, co_fecha, co_hora, co_ganancia, co_finalizado)
		System.out.println("mensaje: "+new ws.CorridaSOA().get("carr"));
	}

}
