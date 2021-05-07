package ejercicio1;
import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numero_par_impar, numero_fac, numero_primo = 0;
		
		System.out.print("ingrese su numero para saber si es par: ");
		numero_par_impar = in.nextInt();
		System.out.println(par_impar(numero_par_impar));
		
		System.out.print("ingrese su numero para saber el factorial: ");
		numero_fac = in.nextInt();
		System.out.println(factorial(numero_fac));
		
		System.out.print("ingrese su numero para saber si es primo: ");
		numero_primo = in.nextInt();
		System.out.println(primo(numero_primo));
	}
	
	Scanner in = new Scanner(System.in);
	



	public static boolean par_impar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
		
	
	
	public static int factorial(int numero) {
		if (numero == 1) {
			return numero;
		}else {
			return numero * factorial(numero - 1);
		}
	
	}
	
	public static boolean primo(int numero) {
		int cont = 0;
		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0) {
				cont ++ ;
			}
		}
		if (cont == 1) {
			return true;
		}else {
			return false;
		}
	}


	
	
}