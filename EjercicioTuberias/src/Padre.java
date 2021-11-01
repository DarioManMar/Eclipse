import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;


public class Padre {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		
		System.out.println("****Estamos en el programa padre***");
		System.out.println("Introduce la palabra para quitar las vocales:");
		palabra = teclado.nextLine();
		ProcessBuilder pb = new ProcessBuilder("java","Sinvocales.java");
		Process p = pb.start();
		//Mandamos los datos al hijo
		OutputStream os = p.getOutputStream();
		OutputStreamWriter osw= new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		pw.print(palabra);
		pw.close();
		
		
		
		//Leemos desde el hijo	
		InputStream is = p.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linea = br.readLine();		
		System.out.println(linea);			
		br.close();
		
		
		
		
	
	}
}