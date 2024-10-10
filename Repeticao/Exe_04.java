//Ler um número inteiro N e calcular todos os seus divisores.
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite um numero N: ");
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {

			if (N % i == 0) {

				System.out.println(i + "");
				
				scanner.close();
			}
		}
	}
}