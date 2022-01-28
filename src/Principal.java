import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int numeroEquipos;
		System.out.println("Introduce el número de equipos que quieres que tenga la liga: ");
		numeroEquipos=sc.nextInt();
		int numeroJugadores;
		System.out.println("Introduce el número de jugadores que quieres que tenga cada equipo: ");
		numeroJugadores=sc.nextInt();
		int jornadasSimular;
		System.out.println("Introduce el número de jornadas que quieras avanzar: ");
		jornadasSimular=sc.nextInt();
		
		
		//Para opción de parar el programa
		int jornadasAvanzar;
		
		
		//Numero jornadas
		int numJornadas=(numeroEquipos-1)*2;
		
		
		
//		int opcion=1;
//		while(opcion!=10) {
//			limpiarPantalla();
//			imprimirMenu();
//			System.out.println("Introduce la opción que quieras: ");
//			opcion=leerEntrada();
//			switch(opcion) {
//			case 1: 
//			// Avanzar Jornadas    //
//				break;
//			case 2: 
//				// Mostrar Clasificación    //
//				break;
//			case 3: 
//				// Mostar Calendario    //
//			break;
//			case 10:
//				System.out.println("Has salido con exito");
//			break;
//			default:
//				System.out.println("Esta opción no es valida");
//			}
//			if(opcion!=10) {
//			System.out.println();
//			System.out.println("Presiona una tecla para continuar");
//			pressenter();
//		}
//	}
		// TODO Auto-generated method stub
		
		//Crear una Lista de Equipo
		
		int edad = (int) Math.floor(Math.random()*15)+4;
//		int numeroEquipos = (int) Math.floor(Math.random()*13)+4;
//		Equipo[] listaEquipos = crearEquipos(numeroEquipos, edad);
		
//		Imprimimos los equipos
		Equipo[] listaEquipos = crearEquipos(numeroEquipos,  edad);
		System.out.println("Numero de equipos: "+numeroEquipos);
		for (Equipo e: listaEquipos) {
			System.out.println(e.getNombre());
		}
		

		Jornada[] listaJornadas = crearJornadas(numJornadas);
		for (Jornada e: listaJornadas) {
			System.out.println("Jornada: "+numeroEquipos);
			System.out.println(e.getNombre());
		}
		
		
		

	}

	
	
	
	
	
	
	private static Jornada[] crearJornadas(int numeroJugadores, int edad, Equipo equipo) {
		for (int i=0; i<numeroJugadores; i++) {
			//Crear un Jugador
			Jugador jug = new Jugador();
			//Nombre
			int numero = (int) Math.floor(Math.random()*nombres.length);
			String nombre = nombres[numero];
			jug.setNombre(nombre);
	}
	}
	
	
	
	private static void imprimirMenu() {
		// TODO Auto-generated method stub
	System.out.println("*****************************");
	System.out.println("******Menu del Programa**************");
	System.out.println("*****************************");
	System.out.println("1-Avanzar Jornadas");
	System.out.println("2-Mostrar Clasificación");
	System.out.println("3-Mostrar Calendario");
	System.out.println("10-Salir");
	}
	private static void limpiarPantalla() {
		for(int i=1;i<200;i++) {
		System.out.println();
	}
}

	private static int leerEntrada() {
		Scanner sc= new Scanner(System.in);
		return sc.nextInt();
	}
	private static void pressenter() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Jugador[] crearJugadores(int numeroJugadores, int edad, Equipo equipo) {
		//Listado de Nombres, Apellidos, Posiciones para generador random
		String[] nombres = {"Antonio", "Pepito", "Alejandra", "Ismael", "Hugo", "Oliver","Kalesi",
				"Ingrid","Astrid","Indira","Jenny","Jessi","Vane","Joel","Bruno",
				"Sasha","Billie","Masha","Pingu"};
		String[] apellidos = {"Messi", "Vinicius", "Cristiano", "Ronaldo", "PiquÃ©","Bale (lesionado)",
				"Amunike","N'kono","ButragueÃ±o","SanchÃ­s","Neymar","Batistuta","Maradona",
				"PelÃ©","Beckenbauer"};
		String[] posiciones = {"Portero/a","Defensa","Centrocampista","Delantero/a"};
		
		//Estructura de Array de Jugadores
		Jugador[] jugadores = new Jugador[numeroJugadores];
		
		for (int i=0; i<numeroJugadores; i++) {
			//Crear un Jugador
			Jugador jug = new Jugador();
			//Nombre
			int numero = (int) Math.floor(Math.random()*nombres.length);
			String nombre = nombres[numero];
			jug.setNombre(nombre);

			//Apellidos
			numero = (int) Math.floor(Math.random()*apellidos.length);
			String apellido1 = apellidos[numero];
			numero = (int) Math.floor(Math.random()*apellidos.length);
			String apellido2 = apellidos[numero];
			jug.setApellidos(apellido1+" "+apellido2);

			//PosiciÃ³n
			numero = (int) Math.floor(Math.random()*posiciones.length);
			String posicion = posiciones[numero];
			jug.setPosicion(posicion);

			//Edad
			jug.setEdad(edad);

			//Dorsal
			jug.setDorsal(i+1);
			
			//Equipo
			jug.setEquipo(equipo);

			jugadores[i]=jug;

		}
		
		return jugadores;
	}

	private static Equipo[] crearEquipos(int numeroEquipos,int edad) {
		
		String [] nombreBarrios = {"El Candado", "Huelin", "Tiro PichÃ³n", "RincÃ³n de la Victoria", "La Rosaleda", "Torremolinos",
				"Velez MÃ¡laga","Cerrado de Calderon", "El Puerto de la Torre", "Bresca", "Mezquitilla", "Teatinos", "Motril",
				"Centro","Santa Paula", "El Palo", "Los Corazones", "Las Delicias", "Recogidas","Nueva MÃ¡laga", "Casas Blancas",
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

	private static Entrenador crearEntrenador(Equipo equipo) {
		//Listado de Nombres, Apellidos, Posiciones para generador random
		String[] nombres = {"Antonio", "Pepito", "Alejandra", "Ismael", "Hugo", "Oliver","Kalesi",
				"Ingrid","Astrid","Indira","Jenny","Jessi","Vane","Joel","Bruno",
				"Sasha","Billie","Masha","Pingu"};
		String[] apellidos = {"Messi", "Vinicius", "Cristiano", "Ronaldo", "PiquÃ©","Bale (lesionado)",
				"Amunike","N'kono","ButragueÃ±o","SanchÃ­s","Neymar","Batistuta","Maradona",
				"PelÃ©","Beckenbauer"};
		Entrenador entrenador = new Entrenador();
		
		//Nombre
		int numero = (int) Math.floor(Math.random()*nombres.length);
		String nombre = nombres[numero];
		entrenador.setNombre(nombre);

		//Apellidos
		numero = (int) Math.floor(Math.random()*apellidos.length);
		String apellido1 = apellidos[numero];
		numero = (int) Math.floor(Math.random()*apellidos.length);
		String apellido2 = apellidos[numero];
		entrenador.setApellidos(apellido1+" "+apellido2);
		
		//Equipo
		entrenador.setEquipo(equipo);
		
		//Edad
		int edad = (int) Math.floor(Math.random()*47)+18;
		entrenador.setEdad(edad);
		//Licencia
		int licencia = (int) Math.floor(Math.random()*100000);
		entrenador.setNumeroLicencia(licencia);
		
		return entrenador;
	}
}

