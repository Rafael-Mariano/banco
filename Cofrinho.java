package Poupança2;
// importação de bibliotecas
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cofrinho {
	// definição de atributos
	private static List<Double> listaMoedas;
	double inserirValor;	
	
	public static void inserirValor(double moeda, int tipoMoeda) throws InterruptedException{
		Scanner escolhaMenu2 = new Scanner(System.in);
		
		int escolha2=0;
		
		System.out.println("Qual o tipo de moeda você quer guardar?");
		System.out.println("1 - Dolar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		
		escolha2 = escolhaMenu2.nextInt();
		escolhaMenu2.nextLine();
		
		switch(escolha2) {
		case 1:
			Dolar.valorDolar(Dolar.valorDolar);
			Thread.sleep(1500);
			break;
		case 2:
			Euro.valorEuro(Euro.valorEuro);
			Thread.sleep(1500);
			break;
		case 3:
			Real.valorReal(Real.valorReal);
			Thread.sleep(1500);
			break;
		default:
			System.out.println("Informaçao Inválida, digite novamente!\n");
			Thread.sleep(1500);
			inserirValor(0,0);
			break;
		}
	}
	
	public static void removerValor(double Moeda) throws InterruptedException {
		Scanner escolhaMenu2 = new Scanner(System.in);
		
		int escolha2=0;
		
		System.out.println("");
		System.out.println("Qual o tipo de moeda você quer remover?");
		System.out.println("1 - Dolar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		
		escolha2 = escolhaMenu2.nextInt();
		escolhaMenu2.nextLine();
		
		switch(escolha2) {
		case 1:
			Dolar.removerDolar();
			break;
		case 2:
			Euro.removerEuro();
			break;
		case 3:
			Real.removerReal();
			break;
		default:
			System.out.println("Informaçao Inválida, digite novamente!\n");
			Thread.sleep(1500);
			break;
		}
	}
	
	public static void listagemMoedas() throws InterruptedException {
		System.out.printf("Total em Dolar: $%.2f\n", Dolar.getTotalDolar());  
		System.out.printf("Total em Euro: \u20AC%.2f\n",Euro.getTotalEuro()); 
		System.out.printf("Total em Real: R$%.2f\n",Real.getTotalReal()); 
		Thread.sleep(1500);
	}
	
	public static void totalConvertido() throws InterruptedException {
		Dolar dolar = new Dolar();
		dolar.converter();
		Euro euro = new Euro();
		euro.converter();
		Real real = new Real();
		real.converter();
		
		double totalEmReais = Dolar.getConversaoDolar()+Euro.getConversaoEuro()+Real.getConversaoReal();
		System.out.printf("Todos os valores convertidos para o real totalizam R$%.2f\n", totalEmReais);
		Thread.sleep(1500);
	}

}
