package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class GereReserva {
	
	ArrayList<Reserva> arRV;
	
	public GereReserva() {
		super();
		this.arRV = new ArrayList<Reserva>();
	}
	
	public void addReserva(int id, ArrayList<Cliente> arCl, ArrayList<Restaurante> arRR){
		Reserva rv = new Reserva(id, arCl, arRR);
		
		arRV.add(rv);
	}
	
	public Reserva getReserva(int id){
		for(Reserva rv : arRV){
			if(rv.getId() == id)
				return rv;
		}
		return null;
	}

	//Cada prato equivale a uma pessoa feito em reserva, Ex: reserva para 4 pessoas = 4 pratos
	public int getTotal(){
		int total = 0;
		for (Reserva rv : arRV){
			total += rv.getNr_pessoas();
		}
		return total;
	}
	
}
