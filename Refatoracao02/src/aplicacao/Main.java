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
			String s = "Opções\n" + "1-Calcular área do quadrado\n" + "2-Calcular área do retângulo\n"
					+ "3-Calcular área do triângulo\n" + "4-Calcular área do Trapézio\n" + "5-Sair\n";
			
			System.out.println(s);
			System.out.println("Informe a opção: ");
			menu = input.nextInt();
			
			if (menu < 1 || menu > 5)
				System.out.println("Opção inválida!");
			switch (menu) {
			case 1:
				areaQuadrado(input);
				printArea("A área do quadrado é");	
				break;
			case 2:
				areaRetangulo(input);
				printArea("A área do retângulo é");
				break;
			case 3:
				areaTriangulo(input);
				printArea("A área do triângulo é");
				break;
			case 4:
				areaTrapezio(input);
				printArea("A área do trapézio é");
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
		System.out.println("Informe os dois lados do retângulo: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		area = a * b;
	}

	private static void areaTriangulo(Scanner input) {
		System.out.println("Informe a base e a altura do triângulo");
		double y = input.nextDouble();
		double z = input.nextDouble();
		area = y * z / 2;
	}

	private static void areaTrapezio(Scanner input) {
		System.out.println("Informe as medidas do trapézio: ");
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
