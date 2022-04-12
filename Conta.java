public class Conta {
	String titular; 
	int numAgencia; 
	int numConta; 
	private double saldo = 0; 
	
	
	
	public double Depositar(double valor){
		return (this.saldo += valor); 
	}
	
	public double Sacar(double valor){
		return (this.saldo -= valor); 
	}
	
	public boolean Transferir(double valor, Conta contaDestino){
		if (this.saldo < valor){
			return false; 
		}
		this.saldo -= valor; 
		contaDestino.Depositar(valor); 
		return true;
	}
	
	public void MostarExtrato(){
		System.out.println("Seu saldo é: " + this.saldo);
	}
}

