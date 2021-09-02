package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	static double area = 0.0;	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int menu = 1;
		do {
			String s = "Op��es\n" + "1-Calcular �rea do quadrado\n" + "2-Calcular �rea do ret�ngulo\n"
					+ "3-Calcular �rea do tri�ngulo\n" + "4-Calcular �rea do Trap�zio\n" + "5-Sair\n";
			
			System.out.println(s);
			System.out.println("Informe a op��o: ");
			menu = input.nextInt();
			
			if (menu < 1 || menu > 5)
				System.out.println("Op��o inv�lida!");
			switch (menu) {
			case 1:
				areaQuadrado(input);
				printArea("A �rea do quadrado �");	
				break;
			case 2:
				areaRetangulo(input);
				printArea("A �rea do ret�ngulo �");
				break;
			case 3:
				areaTriangulo(input);
				printArea("A �rea do tri�ngulo �");
				break;
			case 4:
				areaTrapezio(input);
				printArea("A �rea do trap�zio �");
				break;
			}
		} while (menu != 5);
		System.out.println("-----------------------");
		System.out.println("* PROGRAMA FINALIZADO *");
		System.out.println("-----------------------");

	}

	private static void areaQuadrado(Scanner input) {
		System.out.println("Informe o lado: ");
		double x = input.nextDouble();
		area = Math.pow(x, 2);
	}

	private static void areaRetangulo(Scanner input) {
		System.out.println("Informe os dois lados do ret�ngulo: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		area = a * b;
	}

	private static void areaTriangulo(Scanner input) {
		System.out.println("Informe a base e a altura do tri�ngulo");
		double y = input.nextDouble();
		double z = input.nextDouble();
		area = y * z / 2;
	}

	private static void areaTrapezio(Scanner input) {
		System.out.println("Informe as medidas do trap�zio: ");
		double m1 = input.nextDouble();
		double m2 = input.nextDouble();
		double m3 = input.nextDouble();
		area = ((m1 + m2) * m3) / 2;
	}

	private static void printArea(String texto) {
		System.out.println("---------------------------");
		System.out.println( texto + ": " + String.format("%.2f", area));
		System.out.println("---------------------------");
	}
}
