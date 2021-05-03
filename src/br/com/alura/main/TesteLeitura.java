package br.com.alura.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) {

		try {
//			InputStream fs = new FileInputStream("lorem.txt");
			InputStream fs = System.in;
			Reader isr = new InputStreamReader(fs, "UTF-8");
			BufferedReader bf = new BufferedReader(isr);
			
//			OutputStream fo = new FileOutputStream("lorem2.txt");
			OutputStream fo = System.out;
			Writer osw = new OutputStreamWriter(fo);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String line = bf.readLine();
			
			while(line != null && !line.isEmpty()) {
				bw.write(line);
				bw.newLine();
				bw.flush();
				line = bf.readLine();
			}
			
			bf.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
