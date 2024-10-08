//matriculado ou nao matriculado
package exercicios;
import java.util.Scanner;
public class exemplo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sim para matriculado e nao matriculado: ");
		String imput = scanner.nextLine();
		
		//usando equals para comprar o conteudo da string
		if (imput.equalsIgnoreCase("sim")) {
			System.err.println("matriculado");
		}else if (imput.equals("nao")) {
				System.out.println("nao matriculado");
		}else {
			System.out.println("erro, entrada invalida.");
		}
		scanner.close();

	}

}
