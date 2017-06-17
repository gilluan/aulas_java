package projeto_git;

public class IfElse {
	
	//main
	public static void main(String[] args) {
		int idade = 12;
		//.... um monte de outras logicas
		idade = 121;
		if(idade >= 18 && idade <= 65) {
			//syso
			System.out.println("O convidado pode entrar na festa");
		} else if(idade > 65) {
			if(idade > 120) {
				System.out.println("Esta pessoa ja deve ter morrido");
			} 
			System.out.println("Ligar para a familia");
		} else {
			System.out.println("Chamar o conselho tutelar");
		}
		System.out.println("Fim da execucao do programa");
	}

}
