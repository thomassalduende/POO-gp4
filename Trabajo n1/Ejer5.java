import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] sueldos = new int[5];
		String[] nombre = new String[5];

		for (int i = 0; i < 5; ++i) {
			System.out.print("Ingrese un nombre: ");
			nombre[i] = entrada.next();

			System.out.print("Ingrese su sueldo: ");
			sueldos[i] = entrada.nextInt();

		}
		int max = 0, suma = 0;
		String aux_nombre = " ";

		for (int i = 0; i <= sueldos.length-1; ++i) {
			suma = suma + sueldos[i];
			if (sueldos[i] > max) {
				max = sueldos[i];
				aux_nombre = nombre[i];
			}

		}
		System.out.println("El empleado que mas gana es: " + aux_nombre + " con un sueldo de: $" + max);
		System.out.println("El sueldo promedio de los empleados es: $" + suma / sueldos.length);
	}
}
