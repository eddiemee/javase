package carros;

import java.util.Random;

public class Salao {
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
		Carro fusca = new Carro();
		fusca.ano = 1967;
		fusca.cor = "Azul";
		System.out.println("Carro: Fusca");
		System.out.println("Ano:" + fusca.ano);
		System.out.println("Cor:" + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
		Carro mercedes = new Carro();
		mercedes.ano = 2021;
		mercedes.cor = "Prata";
		System.out.println("Carro: Mercedes");
		System.out.println("Ano:" + mercedes.ano);
		System.out.println("Cor:" + mercedes.cor);
		mercedes.ligar();
		mercedes.acelerar();
		mercedes.desligar();
	}
}
