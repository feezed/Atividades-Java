package aplicacao;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	static Calendar calendario;
	private static final int QUANTIDADE = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mes = 0;
		int mesAtual = 0;
		int contador = 0;
		double mensalidade = 0;
		double mensalidadeNova = 0;
		
		while(contador < QUANTIDADE) {
			System.out.println("Valor da mensalidade: ");
			mensalidade = input.nextDouble();
			
			System.out.println("Mês de referência: ");
			mes = input.nextInt();
			
			calendario = Calendar.getInstance();
			mesAtual = calendario.get(Calendar.MONTH) + 1;
			
			mensalidadeNova = verificarValorMensalidade(mes, mesAtual, mensalidade, mensalidadeNova);
			imprimirResultados(mes, mesAtual, mensalidade, mensalidadeNova);
			
			contador++;
		}		
		input.close();
	}

	private static double verificarValorMensalidade(int mes, int mesAtual, double mensalidade, double mensalidadeNova) {
		if(mes < mesAtual)
			mensalidadeNova = mensalidade * 1.10;
		else if ( mes>= mesAtual)
			mensalidadeNova = mensalidade;
		return mensalidadeNova;
	}

	private static void imprimirResultados(int mes, int mesAtual, double mensalidade, double mensalidadeNova) {
		System.out.println("Resuldade: ");
		System.out.println("Mês atual: " + mesAtual);
		System.out.println("Referência: " + mes);
		System.out.println("Mensalidade: " + mensalidade);
		System.out.println("Novo valor: " + mensalidadeNova);
	}
}
