package fp.daw.examen1ev;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double variable;
int [] coeficientes = new int [10];

System.out.print("Introduzca la variable: ");
variable = in.nextDouble();
System.out.println("Introduzca los coeficientes separados por espacios: ");
for (int i=0; i<coeficientes.length; i++)
	coeficientes[i] = in.nextInt();

	} // main

}
