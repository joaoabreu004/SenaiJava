public class TesteContas {
	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta(); 
		contaDoJoao.titular = "João Vitor de Abreu Sousa"; 
		contaDoJoao.numAgencia = 1234; 
		contaDoJoao.numAgencia = 392832;
		
		Conta contaDoGabriel = new Conta(); 
		contaDoJoao.titular = "Gabiru"; 
		contaDoJoao.numAgencia = 1234; 
		contaDoJoao.numAgencia = 33332;
		
		
		
		contaDoJoao.MostarExtrato();
		
		contaDoJoao.Depositar(300);
		contaDoJoao.MostarExtrato();
		
		contaDoGabriel.Depositar(100); 
		contaDoGabriel.MostarExtrato();
		
		contaDoJoao.Transferir(150, contaDoGabriel); 
		contaDoJoao.MostarExtrato();
		contaDoGabriel.MostarExtrato();
	}
}
