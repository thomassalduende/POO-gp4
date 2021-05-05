import java.util.Scanner;

public class Ejer4 {
	public static void main (String[] args ) {
		
		Scanner entrada = new Scanner (System.in);
		int nElementos;
		
		System.out.print("Ingrese la cantidad de numeros que quiere ingresar en el array: ");
		nElementos=entrada.nextInt();
		
		int [] numeros = new int [nElementos] ;
		for(int i=0; i<nElementos; i++) {
			System.out.print("Ingrese un numero: ");
			numeros[i]=entrada.nextInt();
		}
		
		int max = 0, pos = 0, suma = 0;
		
		for (int i= 0; i<= numeros.length-1; ++i) {
			suma=suma + numeros[i];
			if (numeros[i]> max) {
				max=numeros[i];
				pos=i; 
			}
			
			
		}
		System.out.println("El total de numeros es de: "+ (numeros.length-1));
		System.out.println("El numero maximo es: "+max+" en la posicion: "+pos);
		System.out.println("El promedio es: "+ (suma/numeros.length));
		
		ordenar (numeros);
		System.out.println("Orden de mayor a menor: ");
		for (int u = 0; u < numeros.length-1; u++) {
			/*System.out.println("Orden de mayor a menor: ");*/
			System.out.println(numeros[u]);
		}
		ordenar_menor(numeros);
		System.out.println("Orden de menor a mayor: ");
		for (int u = 0; u < numeros.length-1; u++) {
			/*System.out.println("Orden de menor a mayor: ");*/
			System.out.println(numeros[u]);
			
		}
	}
	
	public static void ordenar(int numeros[]) {
		int aux;
		for(int u= 0; u < numeros.length-1; u++) {
			for (int j = 0; j < numeros.length - u - 1; j++) {
                if (numeros[j + 1] > numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }     
			}
	}
}
	public static void ordenar_menor (int numeros[]) {
		int aux;
		for(int u= 0; u < numeros.length-1; u++) {
			for (int j = 0; j < numeros.length - u - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }     
			}
	}
}
}

