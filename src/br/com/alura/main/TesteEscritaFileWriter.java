package br.com.alura.main;

import java.io.BufferedWriter;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.Writer;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) {

		try {
//			OutputStream fo = new FileOutputStream("lorem.txt");
//			Writer osw = new OutputStreamWriter(fo);
//			BufferedWriter bw = new BufferedWriter(osw);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
			bw.write("Java parte 7: Trabalhando com java.io");
			bw.newLine();
			bw.newLine();
			bw.write("Fim do arquivo");
			
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
