//achar a area
package desenvolvimento.de.Sistemas;
import java.util.Scanner;
public class raio {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("digite o valor do raio: ");
	double raio = scanner.nextDouble();
	
	double area = 3.14159 * raio * raio ;
	
	System.out.println("a area é: "  + 3.14159 + " * " + raio + " * " + raio +  " =" + area + "");
	}

}
