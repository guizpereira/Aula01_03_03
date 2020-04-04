package aula3.adsm.ex23;

import javax.swing.JOptionPane;

public class TesteFerramenta {
	public static void main(String[] args) {
		String escolha = JOptionPane.showInputDialog("Deseja salvar em console ou em arquivo?: ");
		new Fabrica(escolha);
	}
}
