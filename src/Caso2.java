import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1 , suma = 0;
		
		System.out.println("Ingrese numero: ");
		int n = sc.nextInt();
		
		while (c <= n) {
			suma += c;
			c++;
		}
        System.out.println("La sumatoria de " + n + " es: " + suma);

	}

}
