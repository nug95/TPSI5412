package application;

import java.util.Scanner;

import controller.GereCliente;
import model.Cliente;

public class App {
	
	public App(){
		
		boolean sair = true;
		int opc = 0;
		
		do{
			switch(opc){
				case 1: //Inserir Cliente
					inserir_cliente();
					opc = 0;
					break;
				case 2: //Inserir Restaurante
					break;
				case 3: //Inserir Reserva
					break;
				case 4: //Listar Clientes
					listar_clientes();
					opc = 0;
					break;
				case 9: //Terminar Programa
					System.out.printf("\n\n\tPrograma Terminado com Sucesso!\n");
					sair = false;
					break;
				default:
					System.out.printf("\t Bem vindo ao Sistema de Reservas dos TPSI1116 \n\n");
					System.out.printf("Menu:\n");
					System.out.printf("\t1 - Inserir Cliente \n");
					System.out.printf("\t2 - Inserir Restaurante \n");
					System.out.printf("\t3 - Inserir Reserva \n");
					System.out.printf("\t4 - Listar Clientes \n");
					System.out.printf("\t5 - Listar Restaurantes \n");
					System.out.printf("\t6 - Listar Reservas \n");
					System.out.printf("\t7 - Procurar Cliente \n");
					System.out.printf("\t8 - Procurar Restaurante \n");
					System.out.printf("\t9 - Terminar Programa \n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
		}while(sair);
	}
	
	public void inserir_cliente(){

		//nome do cliente
		System.out.printf("\nNome do cliente: ");
		String nome = new Scanner(System.in).nextLine();
		//Morada do cliente
		System.out.printf("\nMorada do cliente: ");
		String morada = new Scanner(System.in).nextLine();
		//Email do cliente
		System.out.printf("\nEmail do cliente: ");
		String email = new Scanner(System.in).nextLine();
		//Telefone do cliente
		System.out.printf("\nTelefone do cliente: ");
		String telefone = new Scanner(System.in).nextLine();
		
		GereCliente gc = new GereCliente();
		gc.addCliente(nome, morada, email, telefone);
	}
	
	public void listar_clientes(){
		GereCliente gc = new GereCliente();
		gc.getAllClientes();
	}

	public static void main(String[] args) {
		new App();
	}

}
