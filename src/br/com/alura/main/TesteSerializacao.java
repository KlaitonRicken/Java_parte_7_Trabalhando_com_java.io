package br.com.alura.main;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

import br.com.alura.model.Cliente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
//		Cliente cliente = new Cliente();
//		cliente.setNome("Klaiton");
//		cliente.setCpf(3636464);
//		cliente.setProfissao("Dev");
//		
//gravando objeto
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente)ois.readObject();
		ois.close();
		
		System.out.println(cliente.getNomeCpf());
		
	}
	
}
