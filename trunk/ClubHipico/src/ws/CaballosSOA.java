package ws;

import java.util.ArrayList;
import java.util.Collection;
import org.orm.PersistentException;
import com.google.gson.Gson;
import SOAPVO.CaballosSOAPVO;

public class CaballosSOA {
	
	
	
	/** metodo que permite agregar un caballo
	 * @param ca_id_caballo codigo del caballo 
	 * @param ca_nombre nombre del caballo
	 * @param ca_sexo sexo del caballo
	 * @param ca_edad  edad del caballo
	 * @return
	 */
	public String add(String ca_id_caballo, String ca_nombre, String ca_sexo,int ca_edad){
		String mensaje="";
		int resultado=1;

		
		// verficando si las variables vienen vacias		
		if(ca_id_caballo.equals("") || ca_id_caballo==null || ca_nombre.equals("") || ca_nombre==null 
				|| ca_sexo.equals("") || ca_sexo==null || ca_edad==0){
			
			mensaje="ingrese todos los valores";
			resultado=0;
		}
		
		else{
			
            // si no vienen vacias
			if(resultado==1){
			
			try {
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				//instanciando objeto caballo
				orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
				orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.createHip_caballos();
				
				//seteando objeto caballo
				lormHip_caballos.setCa_id_caballo(ca_id_caballo);
				lormHip_caballos.setCa_nombre(ca_nombre);
				lormHip_caballos.setCa_sexo(ca_sexo);
				lormHip_caballos.setCa_edad(ca_edad);
				
				//guardando objeto
				
				
				lormHip_caballosDAO.save(lormHip_caballos);
				mensaje="caballo agregado";	
				} 
			
			catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="error al agregar dato";
				}
								
			}//fin if resultado
		
		}//fin else
		
		
		
		
		
		
		
		return mensaje;
	}//fin metodo add
	
	/** metodo para mostra caballos 
	 * @param ca_id_caballo le paso un parametro caballo que muestra la busqueda del animal
	 * @return retorna un json con todos los caballos
	 */
	public String get(String ca_id_caballo){
		String json="";
		
		
		
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<CaballosSOAPVO> coleccionCaballos = new ArrayList<CaballosSOAPVO>();
        orm.Hip_caballos[] ormCaballos;
        
        
        if((ca_id_caballo== null) || (ca_id_caballo == (""))){
        	
        	json = "0";        	
        }
        else{
        	
        	
        	try {
				ormCaballos = lDAOFactory.getHip_caballosDAO().listHip_caballosByQuery("ca_id_caballo like'%"+ca_id_caballo+"%'", null);
 
				for (int i = 0; i < ormCaballos.length; i++ ){
                    CaballosSOAPVO caballoencontrado = CaballosSOAPVO.crearCaballosSOAPVO(ormCaballos[i]);
                    coleccionCaballos.add(caballoencontrado);
                    System.out.println("Caballos :"+ormCaballos[i]);
				
				}
				
                Gson gson = new Gson();
                json = gson.toJson(coleccionCaballos);
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	
        }
        
        
        
		
		return json;
		
		
	}

}//fin clase
