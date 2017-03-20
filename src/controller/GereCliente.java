package controller;

import java.util.ArrayList;

import model.Cliente;

public class GereCliente {
	ArrayList<Cliente> arCliente;
	
	public GereCliente(){
		this.arCliente = new ArrayList<Cliente>();
	}
	
	public void addCliente(String nome, String morada, String email, String telefone){
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoID = arCliente.size();
		
		c.setId(novoID);
		arCliente.add(c);
	}

	public void addCliente(Cliente c){
		int novoID = arCliente.size();
		
		c.setId(novoID);
		arCliente.add(c);
	}
	
	public Cliente getCliente(int id){
		for(Cliente c : arCliente){
			if(c.getId() == id)
				return c;
		}
		return null;
	}
	
	public Cliente getAllClientes(){

		for(int i=0; i<arCliente.size(); i++){
			System.out.println(arCliente.get(i).getNome());
		}
		
		return null;
	}
}
