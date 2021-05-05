import java.util.Scanner;

public class Ejer3 {
	public static void main (String[] args ) {

		Scanner entrada = new Scanner (System.in);
		String palabra= " ";
		
		 System.out.print("Ingrese una palabra: ");
		   palabra = entrada.nextLine();
		   
		   System.out.println("La palabra: "+ palabra+ " es palindromo? "+palindromo(palabra));
		   		 
	}	

		public static boolean palindromo(String palabra) {
			palabra= palabra.toLowerCase();
			
			for (int i = 0, j = palabra.length()-1; i<= j; i++, j--) {
				if (palabra.charAt(i) != palabra.charAt(j)) {
					return false;
				}
				
			}
          return true;
		
		}
}

