package br.com.alura.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteCopiarArquivo {

	public static void main(String[] args) {

		try {
			InputStream fs = new FileInputStream("lorem.txt");
			Reader isr = new InputStreamReader(fs);
			BufferedReader bf = new BufferedReader(isr);
			String line = bf.readLine();
			
			System.out.println(line);
			
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
			bf.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
