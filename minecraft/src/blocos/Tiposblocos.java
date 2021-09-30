package blocos;

public class Tiposblocos {

	public static void main(String[] args) {
		
		Bloco blocoterra = new Bloco();
		blocoterra.resistencia = 1;
		blocoterra.textura = "Terra";
		System.out.println("Bloco: Terra");
		System.out.println("Resistência: " + blocoterra.resistencia);
		System.out.println("Textura: " + blocoterra.textura);
		blocoterra.construir();
		blocoterra.minerar();
				
		Bloco blocomadeira = new Bloco();
		blocomadeira.resistencia = 10;
		blocomadeira.textura = "Madeira";
		System.out.println("Bloco: Madeira");
		System.out.println("Resistência: " + blocomadeira.resistencia);
		System.out.println("Textura: " + blocomadeira.textura);
		blocomadeira.construir();
		blocomadeira.minerar();
						
		
		

	}

}
