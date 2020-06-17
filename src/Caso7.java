import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime un nombre");
		String name = sc.nextLine();
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println( i + ". Bienvenido " + name + " al curso.");
		}
		


	}

}
