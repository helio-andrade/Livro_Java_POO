// Programa 01.02
package modulo1;

// Representação de uma classe com atributos e métodos
public class ContaCorrente {
	int conta;
	int agencia;
	double saldo;
	String nome;
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void efetuarSaque(double d) {
		System.out.println("Saque efetuado com sucesso!");
		
	}

}	// Nenhuma linha de código poderá ser definida abaixo deste símbolo de fecha chaves
