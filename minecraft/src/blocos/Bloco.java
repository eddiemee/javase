package blocos;

public class Bloco {

		int resistencia;
		String textura;
		
		public Bloco() {
			System.out.println("====================");
		}
		void construir() {
			System.out.println("Bloco colocado");
		}
		void minerar() {
			System.out.println("Recursos Obtidos");
		}
		void craftar() {
			System.out.println("Item criado");
		}
}
