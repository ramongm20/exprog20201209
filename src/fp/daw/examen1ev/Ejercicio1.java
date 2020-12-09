package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.xml.stream.util.StreamReaderDelegate;

public class Ejercicio1 {

	public static void main(String[] args) throws {

		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		char [] array;
		
		System.out.println("Introduzca una cadena de texto:");
		String texto = String.valueOf(in);
		texto.toLowerCase();
		texto.toCharArray();
Arrays.sort(array);

		for (char letra: array)
			System.out.print(letra);
		
		
	}

}
