package fp.daw.examen1ev;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [][] matriz = {{1, 5, 5, 2, 4},
{2, 1, 4, 14, 3},
{3, 7, 11, 2, 8},
{4, 8, 12, 16, 4}};
		
		System.out.println("La mayor suma de una matriz contenida es: " + max3x3sum(matriz));
		
	} // main
	
	static int max3x3sum(int [][] m) {
		if (m.length<4 || m[0].length <4)
			return null;
		else {
			
			return max;
		} // else
	} // max3x3sum
}
