import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sinvocales {
	public static void main(String[] args) throws IOException {
		String palabra;		
		String sinVocales;
		InputStreamReader entrada = new java.io.InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		palabra = teclado.readLine();		
		sinVocales = palabra.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
		System.out.println(sinVocales);
		
	}
}
