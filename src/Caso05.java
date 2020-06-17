import java.util.Scanner;
public class Caso05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = 0 , nm = 99999999 ;
		int array[] = new int [5];
		array[0] = 0;
		int menor = array[0];
		for(int i = 0 ; i< 5 ; i++) {
			System.out.println("Dime el numero #" + (i +1));
			array[i] = sc.nextInt();
			if(array[i] < array[0]) {
				menor = array[i];
			}
		}
        System.out.println("El numero menor es: " + menor);
	}

}
