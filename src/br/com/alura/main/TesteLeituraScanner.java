package br.com.alura.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) {
		
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");

		try {
			
			props.store(new FileWriter("conf.properties"), "algum comentário");
			
			Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);
			
			String line;
			
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();
//				System.out.println(line);
				
				Scanner scannerLine = new Scanner(line);
				scannerLine.useLocale(Locale.US);
				scannerLine.useDelimiter(",");
				
                String tipoConta = scannerLine.next();
                int agencia = scannerLine.nextInt();
                int numero = scannerLine.nextInt();
                String titular = scannerLine.next();
                double saldo = scannerLine.nextDouble();
				
				System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %010.2f %n", tipoConta, agencia, numero, titular, saldo);
				
				scannerLine.close();
//				String[] valores = line.split(",");
//				System.out.println(Arrays.toString(valores));
			}
			
			scanner.close();
			
			props.load(new FileReader("conf.properties"));

			String login = props.getProperty("login");
			String senha = props.getProperty("senha");
			String endereco = props.getProperty("endereco");

			System.out.println(login + ", " + senha  + ", " +  endereco);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
