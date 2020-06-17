import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =  0;
        int nm = 0;
		
		   for(int i = 1 ; i<=4 ; i++) {
			   System.out.println("Dime el numero #" + i);
			   num = sc.nextInt();
			   if(num > nm) {
				   nm = num;
			   }

		   }
		   System.out.println("Numero mayor: " + nm);
	}

}
