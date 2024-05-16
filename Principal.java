package Poupança2;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// scanner para o primeiro menu
		Scanner entradaUsuario = new Scanner(System.in);
		// definição e inicialização da variavel escolha
		int escolha = 0;
		// definição de variavel boleana para tratarmos identificar quando é para encerrar o programa
		// no menu 1
		boolean continuar = true;
		// inicio do método while
		while(continuar) {
			// definição do texto do primeiro menu
			System.out.println("");
			System.out.println("Seja bem-vindo meu caro poupador!\n");
			System.out.println("O que você quer fazer agora?");
			System.out.println("1 - Inserir um valor");
			System.out.println("2 - Remover um valor");
			System.out.println("3 - Listar valores sem converter");
			System.out.println("4 - Mostrar total convertido em real");
			System.out.println("0 - Sair da aplicação");
			// modificando a variavel escolha de acordo com a opção selecionada pelo usuario
			escolha = entradaUsuario.nextInt();
			//limpeza de buffer
			entradaUsuario.nextLine();
			// definiçao para executar as funcionalidades de acordo com a escolha selecionada
			switch(escolha) {
			case 1:
				Cofrinho.inserirValor(0, 0);
				break;
			case 2:
				Cofrinho.removerValor(0);
				break;
			case 3:
				Cofrinho.listagemMoedas();
				break;
			case 4:
				Cofrinho.totalConvertido();
				break;
			case 0:
				
				continuar = false;
				break;
			default:
				System.out.println("Informação inválida, digite novamente!");
				Thread.sleep(1500);
				break;
			}	
		}			
	}
}
