package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrissar();
		boeing777.tremPouso = false;

		Aviao concorde = new Aviao();
		concorde.ano = 2000;
		concorde.cor = "Cinza";
		concorde.envergadura = 32.4;
		System.out.println("Avião: Concorde");
		System.out.println("Ano: " + concorde.ano);
		System.out.println("Cor: " + concorde.cor);
		System.out.println("Envergadura " + concorde.envergadura);
		concorde.ligar();
		concorde.acelerar();
		concorde.aterrissar();

		if (boeing777.tremPouso == true) {
			boeing777.aterrissar();
		} else {
			System.out.println("ARREMETER!");
		}

	}

}
