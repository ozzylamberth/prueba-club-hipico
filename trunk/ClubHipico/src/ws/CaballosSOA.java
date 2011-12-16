package ws;

import org.orm.PersistentException;

public class CaballosSOA {
	
	
	
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
				lormHip_caballos.setCa_sexo(ca_sexo);
				
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

}//fin clase
