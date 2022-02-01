package Funciones;
import Funciones.Principal;
public class Prueba {
private static Equipo[] crearEquipos(it numeroEquipos,int edad) {
		
		String [] nombreBarrios = {"El Candado", "Huelin", "Tiro Pichón", "Rincón de la Victoria", "La Rosaleda", "Torremolinos",
				"Velez Málaga","Cerrado de Calderon", "El Puerto de la Torre", "Bresca", "Mezquitilla", "Teatinos", "Motril",
				"Centro","Santa Paula", "El Palo", "Los Corazones", "Las Delicias", "Recogidas","Nueva Málaga", "Casas Blancas",
				"La Palmilla","Los Asperones","Campanillas","La Corta"};
		String [] mascotas = {"Los Pollos", "Los Araclanes", "Los Limones", "Los Delfines", "Los Chanquetes", "Los Gatitos",
								"Los Boquerones", "Los Toros", "Los Perritos", "Los Halcones", "Los Ornitorrincos", "Los Caracoles",
								"Los Palomos Cojos", "Los Heterosaurios", "Las Tortugas Ninjas", "Los Pintarrojas"};

		Equipo [] listaEquipos= new Equipo[numeroEquipos];
		
		for (int i=0; i<numeroEquipos; i++) {
			//Creamos Equipo
			Equipo equipo = new Equipo();


			
			//Elegimos random un nombre y una mascota de las listas respectivas.
			int numero = (int) Math.floor(Math.random()*nombreBarrios.length);
			String barrio= nombreBarrios[numero];
			numero = (int) Math.floor(Math.random()*mascotas.length);
			String mascota= mascotas[numero];

			//Definimos el club en base al nombre del barrio
			equipo.setClub(barrio+" F.C.");
			
			//Las pegamos con un "de" en medio
			String nombre;
			if (barrio.startsWith("El ")) {
				barrio=barrio.substring(3);
				nombre = mascota + " del "+ barrio;
			}else {
				nombre = mascota + " de "+ barrio;
			}
			
			equipo.setNombre(nombre);
			//Continuamos con entrenador
			Entrenador entrenador = crearEntrenador(equipo);
			equipo.setEntrenador(entrenador);
			
			//Meter los jugadores
			int numeroJugadores=(int) Math.floor(Math.random()*7)+15;
			Jugador[] jugadores = crearJugadores(numeroJugadores,edad,equipo);
			equipo.setJugadores(jugadores);
			
			//Meter el equipo en el array de equipos
			
			listaEquipos[i]=equipo;
			
			
		
		}
		return listaEquipos;
		
	}
}
