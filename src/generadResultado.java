import java.util.Scanner;

public class generadResultado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el nombre del equipo 1");
        String equipo1=teclado.nextLine();
        System.out.println("Introduce el nombre del equipo 2");
        String equipo2=teclado.nextLine();
		int partido = 0;
        int resultado = 0;

        while (partido<1) {

            int goles1 = (int) (Math.random()*10+1);
            int goles2 = (int) (Math.random()*10+1);
            
            System.out.println("Resultados del partido "+goles1+"-"+ goles2);
            partido++;

	}
        
    }
}
