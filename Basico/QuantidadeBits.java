// Kaliel Estrela Rocha. DATA: 19/09/2024
package exercicios;

import java.util.Scanner;

public class QuantidadeBits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("digite o numero de bits: ");
		byte bits = scanner.nextByte();
		
		// processamento dos calculos
		long bytes = bits / 8;

		long bitsRestantes = bits % 8;
		
		// saida de dados
		System.out.println("o numero de bytes é: " + bytes);
		System.out.println("o numero de bits restantes: " + bitsRestantes);

	}

}
