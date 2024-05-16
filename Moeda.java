package Poupança2;

import java.util.Scanner;

public abstract class Moeda {
	static double valor;
	
	public static void info() {
		System.out.println("Moeda adicionada com sucesso");
	}

	public abstract void converter();

}
