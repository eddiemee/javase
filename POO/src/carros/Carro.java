/**
 * POO - Estudo Abstracao Heranca e Polimorfismo
 * @author Eduardo Martins
 */
package carros;

import java.util.Random;

public class Carro {
	public Carro() {
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		Random gerador = new Random();
		System.out.print("* ");
		for (int i = 0; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}

	public int ano;
	public String cor;
	/**
	 * ligar
	 */
	public void ligar() {
		System.out.println("Motor ligado");
	}
	/**
	 * desligar
	 */
	public void desligar() {
		System.out.println("Motor desligado");
	}
	/**
	 * acelerar
	 */
	public void acelerar() {
		System.out.println("Vrummmmmm");
	}
}
