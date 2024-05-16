package Poupança2;

import java.util.Scanner;

public class Euro extends Moeda{
	// definição de variaveis
	static double valorEuro;
	static double totalEuro;
	static double removerEuro;
	static double conversaoEuro;

	public static void valorEuro(double valor) throws InterruptedException {
		// scanner para armazenar valor do deósito
		Scanner vEuro = new Scanner(System.in);
		
		System.out.println("Quantos Euro(s) você quer depositar?");
		double valor1 = vEuro.nextDouble();
		
		vEuro.nextLine();
		
		if(valor1>0) {
			valorEuro = valor1;
			totalEuro += valorEuro;

			Euro euro = new Euro();
			Moeda.info();
			euro.info();
		}else {
			System.out.println("Não pode depositar valor negativo ou nulo\n");
			Thread.sleep(1500);
			valorEuro(0);
		}

	}
	
	public static void info() {
		System.out.printf("Valor em euro adicionado \u20AC%.2f \n",valorEuro);
		System.out.printf("Total em euro \u20AC%.2f\n",totalEuro);
	}
	
	public static double getTotalEuro() {
		return totalEuro;
	}
	
	public static void removerEuro() throws InterruptedException {
		Scanner rEuro = new Scanner(System.in);
		
		if(Euro.getTotalEuro()>0) {
			System.out.printf("Você tem \u20AC%.2f euros\n", Euro.getTotalEuro());
			System.out.println("Qual o valor que quer remover?");
			
			double remEuro = rEuro.nextDouble();
			rEuro.nextLine();
			
			if(remEuro <= totalEuro) {
				removerEuro = totalEuro - remEuro;
				System.out.println("Valor removido com sucesso!");
				System.out.printf("Agora seu saldo em euro é de \u20AC%.2f \n",removerEuro);
				totalEuro = removerEuro;
				Thread.sleep(1500);
			}else {
				System.out.println("Não é possìvel remover valor acima do saldo");
				removerEuro();
			}

		}else {
			System.out.println("Desculpe, mas não tem nenhum valor em euro!");
			Thread.sleep(1500);
		}
	}
	@Override
	public void converter() {
		double cambio = 5.44; // dia 17.03 google
		conversaoEuro = totalEuro * cambio;
	}

	public static double getConversaoEuro() {
		return conversaoEuro;
	}

}
