package fp.daw.examen1ev;


public class Ejercicio2 {
public static void main(String[] args) {
	
	System.out.println("Introduzca un año:");
	System.out.println(esBisiesto(2002) ? "Es bisiesto.":"No es bisiesto.");
	
}
	static boolean esBisiesto(int anno) {
		
		return anno%4 == 0 || anno%400 ? true: false;
	}
}
