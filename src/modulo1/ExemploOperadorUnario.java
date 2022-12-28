// Programa 01.11: Exemplo do uso dos operadores unários

package modulo1;

public class ExemploOperadorUnario {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		int res = 0;
		
		res = var1 + var2;
		System.out.println("var1 + var2 = " + res); // Imprime 30
		
		/* Após execução do operador '=',
		 * será executado o operador '++' da variável var1 */
		System.out.println("var1 = " + var1);
		
		// var1 vai valer 11 após a execução do operador '='
		res = var1++ + var2; 
		System.out.println("var1++ + var2 = " + res); // Imprime 30
		System.out.println("var1 = " + var1);
		
		res = var1 + var2;
		System.out.println("var1 + var2 = " + res); // Imprime 31
		
		res = var1 + --var2;
		System.out.println("var1 + var2 = " + res); // Imprime 30
	}

}
