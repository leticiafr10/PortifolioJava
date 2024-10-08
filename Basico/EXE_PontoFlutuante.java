//Fazer um programa que leia três valores com ponto flutuante: A, B em seguida,  calcule e mostre:
package exercicios;
import java.util.Scanner;
public class EXE_PontoFlutuante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o valor A: ");
		double a = scanner.nextDouble();
		
		System.out.println("digite o valor B: ");
		double b = scanner.nextDouble();
		
		System.out.println("digite o valor C: ");
		double c = scanner.nextDouble();
		
		//3- Fazer um programa que leia três valores com ponto flutuante: A, B e
		//C. Em seguida,  calcule e mostre:
		
		double triangulo = (a*c)/2;
		System.out.printf("%.3f%n" , triangulo ,"/n");
		
		double circulo = 3.15159*(c*c);
		System.out.printf("%.3f%n" , circulo , "/n");
		
		double trapezio = (a+b)*c/2;
		System.out.printf("%.3f%n" , trapezio , "/n");
		
		double quadrado = b*b;
		System.out.printf("%.3f%n" , quadrado , "/n");
		
		double retangulo = a*b;
		System.out.printf("%.3f%n" , retangulo , "/n");
		
		

	}

}
