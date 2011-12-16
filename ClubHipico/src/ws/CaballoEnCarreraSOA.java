package ws;

import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import com.google.gson.Gson;


import SOAPVO.CaballosEnCarreraSOAPVO;
public class CaballoEnCarreraSOA {
	
	public String add(String ca_id_caballo, String ca_id_carrera)throws PersistentException {
		String mensaje="";
		int resultado=1;
		
		
		if(ca_id_caballo.equals("") || ca_id_caballo==null || ca_id_carrera.equals("") || ca_id_carrera==null){
			
			mensaje="ingrese todos los datos";
			resultado=0;
			
		}
		else{
			
			if(resultado==1){
				
				orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
				
				
				//instanciar objeto caballo en carrera
				
				orm.dao.Hip_caballo_carreraDAO lormHip_caballo_carreraDAO = lDAOFactory.getHip_caballo_carreraDAO();
				orm.Hip_caballo_carrera lormHip_caballo_carrera = lormHip_caballo_carreraDAO.createHip_caballo_carrera();
				
				//instanciar objeto caballo
				
				orm.dao.Hip_caballosDAO lormHip_caballosDAO = lDAOFactory.getHip_caballosDAO();
				orm.Hip_caballos lormHip_caballos = lormHip_caballosDAO.getHip_caballosByORMID(ca_id_caballo);
				lormHip_caballosDAO.save(lormHip_caballos);
				
				
				//instanciar objeto carrera
				
				orm.dao.Hip_corridaDAO lormCorridaDAO =lDAOFactory.getHip_corridaDAO();
				orm.Hip_corrida lormHip_corrida = lormCorridaDAO.getHip_corridaByORMID(ca_id_carrera);
				lormCorridaDAO.save(lormHip_corrida);
				
				//setear caballo en carrera
				
				lormHip_caballo_carrera.setCa_id_caballo(lormHip_caballos);
				lormHip_caballo_carrera.setCo_id_carrera(lormHip_corrida);
				
				//guardar cambios
				
				try {
					lormHip_caballo_carreraDAO.save(lormHip_caballo_carrera);
					mensaje="caballo inscrito en carrera";
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					mensaje="no se pudo inscribir";
				}
				
				
			}
				
			
			
		}
		
		
		
		
		return mensaje;
	}

	public String get(String co_id_carrera)throws PersistentException {
		String json=null;
		
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		Collection<CaballosEnCarreraSOAPVO> coleccionCaballosEnCarrera = new ArrayList<CaballosEnCarreraSOAPVO>();
		orm.Hip_caballo_carrera[] ormCaballo_carrera;
		
		
        if((co_id_carrera == null) || (co_id_carrera == (""))){
        	
        	json = "0";        	
        }
        else{
        	//
        	try {
				ormCaballo_carrera = lDAOFactory.getHip_caballo_carreraDAO().listHip_caballo_carreraByQuery("co_id_carrera='"+co_id_carrera+"'", null);

        	for (int i = 0; i < ormCaballo_carrera.length; i++ ){
                CaballosEnCarreraSOAPVO CaballosEnCarreraEncontrados  = CaballosEnCarreraSOAPVO.crearCaballosEnCarreraSOAPVO(ormCaballo_carrera[i]);
                coleccionCaballosEnCarrera.add(CaballosEnCarreraEncontrados );
                System.out.println("Caballo :"+ormCaballo_carrera[i]);
                
                Gson gson = new Gson();
                json = gson.toJson( coleccionCaballosEnCarrera);
        	
        	
        		}
			}
        	catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				json="error";
			}

		
	}
        return json;
 }
}
