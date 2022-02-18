package Funciones;

public class Calendario {
	private Jornada[] jornadas;
	//private Liga liga;
	
	public Calendario (Equipo[]equipos,Arbitro[]arbitros) {
		int numeroEquipos=equipos.length;
		int numeroJornadas=(numeroEquipos-1)*2;
		int numeroPartidos=numeroEquipos/2;
		
		jornadas = new Jornada[numeroJornadas];
		
		Equipo[][]emparejamientos=new Equipo[2][numeroPartidos];
		
	}

		//Para sacar las jornadas necesito traerme todos los equipos
		
//		Equipo[] equipos = liga.getEquipos();
//	}
//	
	//public Liga getLiga() {
//		return liga;
//	}
//	public void setLiga(Liga liga) {
//		this.liga = liga;
//	}
	public Jornada[] getJornadas() {
		return jornadas;
	}

	public void setJornadas(Jornada[] jornadas) {
		this.jornadas = jornadas;
	}

}
