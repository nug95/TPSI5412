package misc;

import java.util.ArrayList;

import model.*;

public class MData {
	public static Cliente cl = new Cliente("Nuno", "Rua 1 Dezembro", "nuno@email.com", "912341232");
	public static ArrayList<Cliente> arCl = new ArrayList<Cliente>();
	
	public static Restaurante rr = new Restaurante("Frita Miolo", "Quinta do Anjo", "213435342", "Miolos Fritos");
	public static ArrayList<Restaurante> arRR = new ArrayList<Restaurante>();
	
	public static Reserva re = new Reserva(4, arCl, arRR);
	public static ArrayList<Reserva> arRV = new ArrayList<Reserva>();
	
	public static void fillData(){
		arCl.add(cl);
		arRR.add(rr);
		arRV.add(re);
		
	}
}
