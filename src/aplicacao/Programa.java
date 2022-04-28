package aplicacao;

import java.util.Scanner;
import entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String quarto[] = new String[10];
		int op;
		
		do {
		System.out.println("         MENU \n1- reservar quarto \n2- consultar quartos disponiveis \n3- cancelar reserva \n4- sair");
		op = ler.nextInt();
		
		switch(op) {
		case 1 :
			System.out.println("digite o codigo do quarto que desja reservar (0 a 9):");
			int cod = ler.nextInt();
			if (quarto[cod] == null) {
				System.out.print("Informe seu nome: ");
				String nome = ler.next();
				System.out.print("Informe seu e-mail: ");
				String email = ler.next();
				Cliente cliente = new Cliente(nome, email);
				quarto[cod] = cliente.toString();
			}else {
				System.out.println("Quarto indisponivel !!");
			}
		break;
		
		case 2 :  
			System.out.println("informe o quarto qu desja consultar");
			int c = ler.nextInt();
				if(quarto[c] == null) {
					System.out.println("Quarto disponível");
				} else {
					System.out.println("Quarto reservado para o " + quarto[c]);
				}
			
		break;
		
		case 3 :  
			System.out.println("informe o quarto que deseja cancelar a reserva: ");
			int cont = ler.nextInt();
			quarto[cont] = null;
		break;
		}
	} while(op != 4);
	
	System.out.println("RELATORIO");	
	for(int cont = 0; cont < 10; cont++) {
		if(quarto[cont] == null) {
			continue;
		}else {
			System.out.println("Quarto " + cont + " : " + quarto[cont]);
		}
	}
	
	}

}
