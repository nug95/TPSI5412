package model;

import java.util.ArrayList;

public class Reserva {
	private int id; 
	private int nr_pessoas;
	
	ArrayList<Cliente> arCliente;
	ArrayList<Restaurante> arRestaurante;

	public Reserva(int nr_pessoas, ArrayList<Cliente> arCliente, ArrayList<Restaurante> arRestaurante) {
		super();
		this.nr_pessoas = nr_pessoas;
		this.arRestaurante = arRestaurante;
		this.arCliente = arCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNr_pessoas() {
		return nr_pessoas;
	}

	public void setNr_pessoas(int nr_pessoas) {
		this.nr_pessoas = nr_pessoas;
	}

	public ArrayList<Restaurante> getArRestaurante() {
		return arRestaurante;
	}

	public void setArRestaurante(ArrayList<Restaurante> arRestaurante) {
		this.arRestaurante = arRestaurante;
	}

	public ArrayList<Cliente> getArCliente() {
		return arCliente;
	}

	public void setArCliente(ArrayList<Cliente> arCliente) {
		this.arCliente = arCliente;
	}
	
}
