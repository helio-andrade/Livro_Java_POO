// Programa 01.05
package modulo1;

// Exemplo de métodos, variáveis e atributos
import	java.util.Date;

public class ExemploMetodo {
	private int meuAtributo = 0; // pode ser usada por qualquer método
	
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		imprimir();
	}

	private static void imprimir() {
		// esta variável poderá ser usada somente no método imprimir()
		int minhaVariavel = 0;
		System.out.println("método imprimir");
	}
}