package Poupança2;

import java.util.Scanner;

public class Dolar extends Moeda {
	// definição das váriaveis
	static double valorDolar;
	static double totalDolar;
	static double removerDolar;
	static double conversaoDolar;
	// definindo um scanner para coletar o valor em dólar
	static Scanner vDolar = new Scanner(System.in);
	// inicio método valorDolar com throws para permitir tempo de espera
	public static void valorDolar(double valor) throws InterruptedException {
		System.out.println("Quantos dolar(es) você quer depositar?");
		double valor1 = vDolar.nextDouble();
		// Limpar buffer de entrada
		vDolar.nextLine();
		// verificação para saber se o valor a ser depositado é maior que 0
		if(valor1>0) {
			// modifição da variavel valorDolar
			valorDolar = valor1;
			// Adição do valorDolar na variavel totalDolar
			totalDolar = totalDolar + valorDolar;
			// criação de instancia para chamar as informações do depósito
			Dolar dolar = new Dolar();
			Moeda.info();
			dolar.info();
		}else {
			System.out.println("Não pode depositar valor negativo ou nulo\n");
			Thread.sleep(1500);
			valorDolar(0);
		}

	}
	// informações do depósito
	public static void info() {
		System.out.printf("Valor em dólar adicionado: $%.2f\n", valorDolar);
		System.out.printf("Total em dólar: $%.2f\n", totalDolar);
	}
	// método para acessar a variavel totalDolar na classe cofrinho
	public static double getTotalDolar() {
		return totalDolar;
	}
	// método para removerDolar 
	public static void removerDolar() throws InterruptedException {
		Scanner rDolar = new Scanner(System.in);
		// verifica se tem dolar armazenado
		if(Dolar.getTotalDolar()>0) {
			System.out.printf("Você tem $%.2f dólar \n", Dolar.getTotalDolar());
			System.out.println("Qual o valor que quer remover?");
			
			double remDolar = rDolar.nextDouble();
			rDolar.nextLine();
			// não deixa removar um valor maior do que o total armazenado no programa
			if(remDolar <= totalDolar) {
				// remove a quantidade de dolares informada
				removerDolar = totalDolar - remDolar;
				System.out.println("Valor removido com sucesso!");
				System.out.printf("Agora seu saldo em dólar é de $%.2f \n",removerDolar);
				// atualiza a variavel totalDolar
				totalDolar = removerDolar;
				// tempo de espera
				Thread.sleep(1500);
			}else {
				//informa a impossibilidade de remover valores acima do armazenado
				System.out.println("Não é possìvel remover valor acima do saldo");
				Thread.sleep(1500);
				// retorna ao método removerDolar
				removerDolar();
			}

		}else {
			// mensagem aparece se não houver nenhum valor armazenado
			System.out.println("Desculpe, mas não tem nenhum valor em dólar!");
			Thread.sleep(1500);
		}
	}
	
	// método de conversão 
	@Override
	public void converter() {
		double cambio = 5.00; // valor do dolar dia 17.03 fonte:google
		conversaoDolar = totalDolar * cambio;
	}

	public static double getConversaoDolar() {
		return conversaoDolar;
	}
}
