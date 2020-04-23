package aula5.adsm.ex91;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Maquina {
	public static void main(String[] args) {
		NumberFormat f = new DecimalFormat("#0.00");
		
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot25 = new Slot25();
		Slot slot50 = new Slot50();
		Slot slot100 = new Slot100();
		slot5.setSlot(slot10);
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot100);
		
		double preco = 0;
		String produto = JOptionPane.showInputDialog("Escolha o item: (1) Cholocate - R$ 5,50; (2) Salgadinho - R$ 2,25; (3) Amendoim - R$ 1,15");
		
		switch (produto) {
		case "1":
			preco = 5.50;
			break;
		case "2":
			preco = 2.25;
			break;
		case "3":
			preco = 1.15;
			break;
		default:System.out.println("Produto Invalido");
		}
					
		double valorInserido = 0;
		if (preco > 0) {
			System.out.println("Total a pagar:  R$" + f.format(preco));
			while (preco > valorInserido) {
				System.out.println("------------------------------------------");
				System.out.println("Total Inserido: R$" + f.format(valorInserido));
				double nova = slot5.recebeMoeda(Integer.parseInt(JOptionPane.showInputDialog("Insira uma moeda (5,10,25,50,100)")));
				valorInserido += nova;
			}
			double troco = valorInserido - preco;
			System.out.println("Total inserido: R$" + f.format(valorInserido));
			System.out.println("Troco:          R$" + f.format(troco));
		}

	}

}
