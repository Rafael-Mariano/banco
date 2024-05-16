package Poupança2;

import java.util.Scanner;

public class Real extends Moeda{
	static double valorReal;
	static double totalReal;
	static double removerReal;
	static double conversaoReal;
	
	static Scanner vReal = new Scanner(System.in);

	public static void valorReal(double valor) throws InterruptedException {
		System.out.println("Quantos real(is) você quer depositar?");
		
		double valor1 = vReal.nextDouble();
		vReal.nextLine();
		
		if(valor1>0) {
			valorReal = valor1;
			totalReal += valorReal;
			Real real = new Real();
			Moeda.info();
			real.info();
		}else {
			System.out.println("Não pode depositar valor negativo ou nulo\n");
			Thread.sleep(1500);
			valorReal(0);
		}
	}
	
	public static void info() {
		System.out.printf("Valor em real R$%.2f \n",valorReal);
		System.out.printf("Total em real R$%.2f \n",totalReal);
	}
	
	public static double getTotalReal() {
		return totalReal;
	}
	
	public static void removerReal() throws InterruptedException {
		Scanner rReal = new Scanner(System.in);
		
		if(Real.getTotalReal()>0) {
			System.out.printf("Você tem R$%.2f reais \n", Real.getTotalReal());
			System.out.println("Qual o valor que quer remover?");
			
			double remReal = rReal.nextDouble();
			rReal.nextLine();
			
			if(remReal <= totalReal) {
				removerReal = totalReal - remReal;
				System.out.println("Valor removido com sucesso!");
				System.out.printf("Agora seu saldo em real é de R$%.2f \n",removerReal);
				totalReal = removerReal;
				Thread.sleep(1500);
			}else {
				System.out.println("Não é possìvel remover valor acima do saldo");
				removerReal();
			}

		}else {
			System.out.println("Desculpe, mas não tem nenhum valor em real!");
			Thread.sleep(1500);
		}
	}
	
	@Override
	public void converter() {
		conversaoReal = totalReal;
	}
	
	public static double getConversaoReal() {
		return conversaoReal;
	}
}
