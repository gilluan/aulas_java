package projeto_git;

public class BreakContinueLabel {

	public static void main(String[] args) {
		// for (int i = 0; i < 5; i++) {
		// if (i == 3) {
		// continue;
		// } else if (i == 4) {
		// break;
		// }
		// System.out.println("contador: " + i);
		// }
		// System.out.println("fim de execucao");
		desvio: for(int x = 0; x < 2; x++) {
			for (int i = 0; i < 5; i++) {
				if (i == 3) {
					continue desvio;
				} else if (i == 4) {
					break desvio;
				}
				System.out.println("contador: " + i);
			}
			System.out.println("fim da execucao");
		}
	}
}
