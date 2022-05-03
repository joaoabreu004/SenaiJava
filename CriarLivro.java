package prova;
import java.util.*;

public class CriarLivro {
	public static void main(String[] args) {

		ListaLivro lista = new ListaLivro(); 
		Livro livro = new Livro();
		
		
//		System.out.println("Olá usuário, qual é o seu nome?: ");
//		String nome = leia.nextLine(); 
//		
//		System.out.println("Seja Bem Vindo " + nome + " Qual operação você deseja realizar? Lembre-se:");
//		System.out.println("1: Novo Cadastro; 2: Alterar Cadastro; 3: Excluir; 9: Sair");
//		int opcao = leiaNum.nextInt();
//		
//		if(opcao == 1){
//			
//			System.out.println("Qual título do Livro?: ");
//			String titulo = leia.nextLine();
//			livro.setTitulo(titulo);
//			System.out.println("Qual o autor?: ");
//			String autor = leia.nextLine();
//			livro.setAutor(autor);
//			System.out.println("Qual o ISBN?: ");
//			String isbn = leia.nextLine();
//			livro.setAutor(isbn);
//			System.out.println("Qual a quantidade de páginas: ");
//			String qtdPag = leia.nextLine();
//			livro.setAutor(qtdPag);
//		} 
		
		
		
		
		
		
		Livro Livro1 = new Livro(); 
		Livro Livro2 = new Livro();
			
		
		Livro1.setTitulo("Pequeno Príncipe");
		Livro1.setAutor("Saint"); 
		Livro1.setIsbn("978-073-34-2609-4");
		Livro1.setQtdPagina("200 páginas");
		
		Livro2.setTitulo("B�blia");
		Livro2.setAutor("Jesus"); 
		Livro2.setIsbn("933-323-34-2609-4");
		Livro2.setQtdPagina("4000 páginas");
		
		lista.adicionar(Livro1);
		lista.adicionar(Livro2);
		
		lista.excluir(0);
		
		System.out.println(lista.mostrar(0).getTitulo());
		
		int pos = lista.buscar("B�blia"); 
		Livro temp = lista.mostrar(pos); 
		temp.setTitulo("1� testamento");
		lista.alterar(0, temp);

		System.out.println(lista.mostrar(0).getTitulo());
		
		
	}
}
