package Funciones;

public class Clasificacion {
	Liga liga;
	EquipoClasificacion[] equipos;

	public Liga getLiga() {
		return liga;
	}
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	public EquipoClasificacion[] getEquipos() {

		//Este es el metodo que calcula la clasificacion 
		return equipos;
	}

	public void mostrarClasificacion() {

	}


	public void setEquipos(Equipo[] equipos) {
		this.equipos = new EquipoClasificacion[equipos.length];
		//creo un EquipoClasificacion por cada Equipo de la liga
		for(int i=0; i<equipos.length;i++) {
			this.equipos[i].setEquipo(equipos[i]);
		}
	}



}
