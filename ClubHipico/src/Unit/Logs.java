package Unit;
import java.lang.reflect.*;
public class Logs {
	
	public static double ejecutar(String nombreClase, String nombreMetodo, Object parametro) throws Exception {
        double t1, t2;
        t1 = System.currentTimeMillis();
        Class    clase = Class.forName(nombreClase);
        Method  metodo = clase.getMethod(nombreMetodo,parametro.getClass());
        metodo.invoke(null, parametro);
        t2 = System.currentTimeMillis();
        return (t2-t1)/1000.0;
    }

}
