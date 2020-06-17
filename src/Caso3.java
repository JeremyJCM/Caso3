import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime un numero: (\nmaximo hasta el 7)");
		int n = sc.nextInt();
		int fac = 1;
		if (n < 7) {
		 for(int i = 1 ; i<=n ; i++ ) {
			fac *= i;
		   } 
           System.out.println("El factorial de " + n + " es: " + fac );
		}else {
			System.out.println("El numero es supeior a 7");
		}  
	}

}
