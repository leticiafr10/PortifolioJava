
//Leia um valor inteiro N. Este valor será a quantidade de valores
//inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão
//dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
//informações conforme exemplo (use a palavra “dentro” e “fora”).

import java.util.Scanner;
public class Exe_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um valo N: ");
		int N = scanner.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			
			if(x >=10 && x <= 20) {
				dentro ++;
			}else {
				fora ++;
			}
		}
		
		System.out.println(dentro + " dentro");
		System.out.println(fora + " fora");
		
		scanner.close();
	}

}
