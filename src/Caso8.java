import java.util.Scanner;
class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int n = sc.nextInt();
		int resultado = 0;
		for(int i = 1 ; i<=15 ; i++) {
			
			resultado = i * n;
			System.out.println(n + " * "  + i + " = " + resultado);
		}


	}

}
