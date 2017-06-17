package projeto_git;

import java.util.Date;

public class AulaSwitch {

	
	//main
	public static void main(String[] args) {
		
		int mes = 5;
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Marco");
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Mes pendente");
			break;
	
		}
		
		System.out.println("fim de execucao");
	}
}
