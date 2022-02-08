package Funciones;

public class Calendario {
	private Jornada[] jornadas;
	private Liga liga;
	
	public Calendario (Liga liga) {
		this.liga=liga;
		generarCalendario();
	}
	private void generarCalendario() {
		//Para sacar las jornadas necesito traerme todos los equipos
		
		Equipo[] equipos = liga.getEquipos();
	}
	
	public Liga getLiga() {
		return liga;
	}
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	public Jornada[] getJornadas() {
		return jornadas;
	}

	public void setJornadas(Jornada[] jornadas) {
		this.jornadas = jornadas;
	}

}
