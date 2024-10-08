//calcula o IMC de uma pessoa conforme seu peso e altura
package exercicios;


import java.util.Scanner;

public class Calc_IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("digite seu sexo: ");
		char sexo = scanner.nextLine().charAt(0);
		
		System.out.println("digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("digite seu peso: ");
		double peso = scanner.nextDouble();
		
        double IMC = peso/ (altura*altura);  
        
        System.out.println("seu imc é de: " + altura + "*" + altura + "/" + peso + " =" + IMC + "");
        
        if(IMC <18.5)
        {
           System.out.println("voce está abaixo do peso");
        }
        else if(IMC >18.6 &&  IMC < 24.9 )
        {
        	System.out.println("peso ideal, parabens!!");
        }
        
        else if (IMC >25.0 && IMC < 29.9)
        {
        	System.out.println("levemente acima do peso");
        }
        
        else if(IMC >30.0 && IMC <34.9)
        {
        	System.out.println("obesidade grau 1");
        }
        
        else if(IMC >35.0 && IMC <39.9)
        {
        	System.out.println("obesidade grau 2(severa)");
        }
        else {
        	System.out.println("obesidade 3 (morbida");
        }
        
        
        
		
		
		

	}

}
