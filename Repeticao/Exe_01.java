ele indica quais são os numeros impares de um certo numero
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite um valor inteiro: ");
		int x = scanner.nextInt();

		if (x >= 1 && x <= 1000) {

			System.out.println("os numeros impares sao: " );
			for (int i = 1; i <= x; i++) {

				if (i % 2 != 0) {
					
					System.out.println(i +"");

				}
			}
		} else {
			System.out.println("numero incorreto ");
		}
	}
}
