//descubra a diferença entre os valores A, B ,C 
package desenvolvimento.de.Sistemas;
import java.util.Scanner;
public class diferença {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("digite o valor de A: ");
		int A = scanner.nextInt();
		
		System.out.println("digite o valor de B: ");
		int B = scanner.nextInt();
		
		System.out.println("digite o valor de C: ");
		int C = scanner.nextInt();
		
		System.out.println("digite o valor de D: ");
		int D = scanner.nextInt();
		
		double diferenca = (A * B - C * D);
		
		System.out.println("a diferença é: " + A + "*" + B + "-" + C + "*" + D + "=" + diferenca + "");
		

	}

}
