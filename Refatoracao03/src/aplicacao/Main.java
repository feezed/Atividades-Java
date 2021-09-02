package aplicacao;

import javax.swing.JOptionPane;
import entidades.Honda;
import entidades.Moto;
import entidades.Suzuki;
import entidades.Yamaha;

public class Main {
	public static void main(String[] args) {		
		while (true) {
			try {
				String nome = JOptionPane.showInputDialog("Informe a marca [Cancelar] para sair: ");
				if (nome.equalsIgnoreCase("Honda")) {
					Honda moto = new Honda();
					imprimirDadosMoto(moto);
				} else if (nome.equalsIgnoreCase("Yamaha")) {
					Yamaha moto = new Yamaha();
					imprimirDadosMoto(moto);
				} else if (nome.equalsIgnoreCase("Suzuki")) {
					Suzuki moto = new Suzuki();
					imprimirDadosMoto(moto);
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO!");

	}

	private static void imprimirDadosMoto(Moto moto) {
		JOptionPane.showMessageDialog(null,
				"\nNome: " + moto.nome + "\nCilindrada: " + moto.cilindrada + "\nCor: " + moto.cor,
				"Dados da moto", JOptionPane.CLOSED_OPTION);
	}
}
