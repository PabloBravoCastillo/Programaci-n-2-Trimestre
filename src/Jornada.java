import java.util.Scanner;
public class Jornada {
	//Ejercicio 1//
	//vamos a crear un programa que genere los partidos a partir de un numero de equipo determinados.//

	

		 
public static void CrearPartidoResultado(String[] args) {
	        // TODO Auto-generated method stub
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce el nombre del equipo 1");
	String equipo1=teclado.nextLine();
	System.out.println("Introduce el nombre del equipo 2");
	String equipo2=teclado.nextLine();
	
	
	

	 int puntosEquipo1 =0;
     int puntosEquipo2 =0;
     int partido = 1;


     while (partido <=10) {
         int goles1 = (int)(Math.random()*10);
         int goles2 = (int)(Math.random()*10);
         if(goles1<goles2) {
             puntosEquipo1+=3;
         }else if (goles2>goles1) {
             puntosEquipo2+=3;
         }else if ( goles1==goles2) {
         puntosEquipo1++;
         puntosEquipo2++;
         }else {

         }
     partido++;    
     }
     System.out.println("Resultados del partido"+partido);
     

 }

}
	
	//Ejercicio 2//
		//vamos a crear un programa que genere los partidos a partir de un numero de equipo determinados.//
	

