package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Restaurante;

public class GereRestaurante {
	ArrayList<Restaurante> arRestaurante;
	
	public GereRestaurante(){
		this.arRestaurante = new ArrayList<Restaurante>();
	}
	
	public void addRestaurante(String nome, String morada, String contacto, String especialidade){
		Restaurante rr = new Restaurante(nome, morada, contacto, especialidade);
		int novoID = arRestaurante.size();
		
		rr.setId(novoID);
		arRestaurante.add(rr);
	}
	
	public void addRestaurante(Restaurante rr){
		int novoID = arRestaurante.size();
		
		rr.setId(novoID);
		arRestaurante.add(rr);
	}
	
	public Restaurante getRestaurante(int id){
		for(Restaurante rr : arRestaurante){
			if(rr.getId() == id)
				return rr;
		}
		return null;
	}
	
	
}
