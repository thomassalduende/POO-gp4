import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejer2{
	
   public static void main (String[] args ) {
		
		int [] numero= new int[3];
		int suma;
		int producto;
		String verif = " ";
		//numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		//numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		//numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Desea ejecutar el programa?");
		verif = entrada.next();
	
		while (!verif.equals("no")) {	
			for (int i = 0; i < 3; ++i) {
				System.out.print("Ingrese un numero: ");
				numero[i] = entrada.nextInt();
			}

			if (numero[0] > 0) {
				producto = numero[1] * numero[2];
				System.out.println("El producto es: " + producto);
			} else {
				suma = numero[1] + numero[2];
				System.out.println("La suma es: " + suma);
			}
			System.out.print("Desea volver a ejecutar el programa?");
			verif = entrada.next();
		}

	}
   
}

		
	
	

		