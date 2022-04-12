//AULA 07/04/2022
public class Turma {
	
	String nomeTurma;
	Professor[] vetTeacher; 
	Alunos[] vetStudent;
	
	public Turma(String nameTurma, int qtdAlunos, int qtdProf){
		nomeTurma = nameTurma; 
		vetStudent = new Alunos[qtdAlunos]; 
		vetTeacher = new Professor[qtdProf]; 
	}
	
	
	public void listarAlunos(){
		for (int i = 0; i < vetStudent.length; i++ ){
			System.out.println(vetStudent[i].nome);
		}
	}
	
	public void listarProfessor(){
		for (int x = 0; x < vetTeacher.length; x++ ){
			System.out.println(vetTeacher[x].nome + " " +vetTeacher[x].materia);
		}
	}
}
