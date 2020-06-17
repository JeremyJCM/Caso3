

import java.util.Scanner;
public class Caso6 {



	public static void main(String[] args) {
		int c = 0 ;  
	    String continuacion = "s", estado ="";
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0, aptos = 0;
		while(continuacion.equals("s")  ||  continuacion.equals("S")  ) {
			c++;
			System.out.println("REGISTRO DE DATOS " + c);
			System.out.println("********************");			
			System.out.println("Dime tu nombre: ");
			nombre = sc.nextLine();
						System.out.println("Dime tu edad: ");
			edad = sc.nextInt();
			if(edad >=18) {
				estado = "Apto para votar";
				aptos++;
			}else {
				estado = "Menor de edad";
			}			
			System.out.println("Estado del participante " + estado);
			
			sc.nextLine();
			System.out.println("Quieres continuar? (S/N ");
			continuacion = sc.nextLine();

		}
		if(continuacion.equals("n") || continuacion.equals("N")) {
			System.out.println("RESUMEN");
			System.out.println("*******");
			System.out.println("Numero de participantes registrados: " + c);
			System.out.println("Numero de participantes aptos para votar: " + aptos);
		}


	}

}
