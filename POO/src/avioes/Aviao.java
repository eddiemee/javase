package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	/**
	 * aterrissar
	 */
	public void aterrissar() {
		System.out.println("Avi�o pousou __________");
	}
	/**
	 * acelerar
	 */
	public void acelerar() {
		System.out.println("Avi�o decolou__________");
	}
}
