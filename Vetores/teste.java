//Crie um programa chamado teste de ansiedade onde o usuario responderá 10 perguntas
//especificas para o resultado final o usuario pode responder apenas 'sim' ou 'não' 
//para cada pergunta.As perguntas específicas são:

//Você se sente com dificuldade de concentração?
//Você se sente cansado facilmente?
//Tem dificuldades em adormecer ou permanecer a dormir?
//Você se preocupa muito com o futuro?
//Tem dificuldade em relaxar?
//Sentiu-se tão preocupado que foi dificil ficar parado?
//Sentiu-se facilmente irritável ou chateado?
//Sentiu medo como se algo muito ruim fosse acontecer?
//Você se preocupa com a opinião dos outros?
//Você está com dificuldades em lembrar os detalhes?
package exercicios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String resposta;
		int i = 0;
		String[] perguntas = { "1) Você se sente com dificuldade de concentração?\n",
				"2) Você se sente cansado facilmente?\n", 
				"3) Tem dificuldades em adormecer ou permanecer a dormir?\n",
				"4) Você se preocupa muito com o futuro?\n", 
				"5) Tem dificuldade em relaxar?\n",
				"6) Sentiu-se tão preocupado que foi dificil ficar parado?\n",
				"7) Sentiu-se facilmente irritável ou chateado?\n",
				"8) Sentiu medo como se algo muito ruim fosse acontecer?\n",
				"9) Você se preocupa com a opinião dos outros?\n",
				"10) Você está com dificuldades em lembrar os detalhes?\n", };

		System.out.println("===TESTE DE ANSIEDADE=== ");
		System.out.println("responda as 10 perguntas com 'sim' ou 'nao' \n");

		for (String pergunta : perguntas) {
			System.out.println(pergunta);
			  resposta = scanner.nextLine();

			if (resposta.equals("sim")) {
				i++;

			}
		}

		if (i >= 7) {
			System.out.println("Voce indica fortes indicios de ansiedade, faça terapia ");
		}

		else if (i >=5) {
			System.out.println("Voce precisa cuidar do corpo e da mente, procure orientação medica");
		}

		else {
			System.out.println("Voce está aparentemente bem e sem riscos de ansiedade");
		}

		scanner.close();
	}

}
