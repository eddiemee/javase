package enxada;

public class Enxadas {

	public static void main(String[] args) {
		Enxada enxada = new Enxada();
		enxada.conquista = true;
		System.out.println("Item: Enxada");
		enxada.arar();
		if (enxada.conquista == true) {
			System.out.println("-----------------");
			System.out.println("Conquista obtida!");
			System.out.println("Dedicação séria. Hora do plantio.");
			System.out.println("-----------------");
		} else {
			enxada.minerar();
			}

	}

}
