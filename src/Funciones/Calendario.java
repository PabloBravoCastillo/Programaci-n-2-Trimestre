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
		//mitad izquierda del array doble
		for (int i=0;i<numeroPartidos;i++) {
			emparejamientos[0][i]=equipos[i];
		}
		//mitad derecha del array doble
		for(int j=numeroPartidos-1;j>=0;j--){
			emparejamientos[1][j]=equipos[numeroEquipos-1-j];
		}
		for(int i=0; i<numeroJornadas/2; i++) {
			Partido[]partidosIda =new Partido
			
			
			
			
			//Partidos de ida
			partidosIda[j].setLocal(emparejamientos[0][j]);
			
		}
		
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
