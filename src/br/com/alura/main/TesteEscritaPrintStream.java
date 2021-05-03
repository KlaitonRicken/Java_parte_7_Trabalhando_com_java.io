package br.com.alura.main;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
//import java.io.PrintWriter;

public class TesteEscritaPrintStream {
	
	public static void main(String[] args) {

		try {

			PrintStream ps = new PrintStream(new File("lorem.txt"), "UTF-8");
//			PrintWriter ps = new PrintWriter(new File("lorem2.txt"));
			
			ps.println("teste");
			ps.println();
			ps.println("segunda linha é de teste");
		
			ps.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
