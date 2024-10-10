
// Fazer um programa para ler um número N. Depois leia N pares de
//números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
//zero, mostrar a mensagem ;divisao impossivel;.
import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int x = 0;
		int y = 0;
		double valor = 0;

		System.out.println("digite um valor: ");
		int Num = scanner.nextInt();

		for (int i = 0; i < Num; i++) {

			System.out.println("digite outro numero: ");
			x = scanner.nextInt();

			y = scanner.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				valor = x / y;
				System.out.println("%.2f\n" + valor);
			}

		}

	}

}
