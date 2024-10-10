//Fazer um programa para ler um número inteiro positivo N.
import java.util.Scanner;
public class Exe_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("digite um número: ");
	        int x = scanner.nextInt();
	        if (x <= 0) {
	            System.out.println("O valor não é maior que 0: ");
	        } else {
	            System.out.println("Valores: ");
	            for (int i = 1; i <= x; i++) {
	                int quadrado = i * i;
	                int cubo = i * i * i;
	                
	                System.out.println(i + " " + quadrado + " " + cubo);
	            }
	        }
	        
	        scanner.close();
	    }
	} 