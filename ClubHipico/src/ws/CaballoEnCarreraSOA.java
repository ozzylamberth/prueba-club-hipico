package ws;

public class CaballoEnCarreraSOA {
	
	public String add(String ca_id_caballo, String ca_id_carrera){
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
				
				
			}
				
			
			
		}
		
		
		
		
		return mensaje;
	}

}
