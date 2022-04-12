//AULA 07/04/2022
public class Main {
	public static void main(String[] args){
		Turma sala1 = new Turma("Sala 1", 3, 4);
		
		
		Alunos aluno1 = new Alunos("João", "000000"); 
		Alunos aluno2 = new Alunos("Gabriel", "000000"); 
		Alunos aluno3 = new Alunos("Fabricio", "000000"); 
		
		Professor teacher1 = new Professor("bitt", "FPOO");
		Professor teacher2 = new Professor("julio", "LIMA");
		Professor teacher3 = new Professor("james", "HARE");
		Professor teacher4 = new Professor("danilo", "SOP");
		
		
		//sala1.vetStudent = new Alunos("JOAO", 30402020); 
		
		sala1.vetTeacher[0] = teacher1;
		sala1.vetTeacher[1] = teacher2;
		sala1.vetTeacher[2] = teacher3;
		sala1.vetTeacher[3] = teacher4;
		
		sala1.vetStudent[0] = aluno1;
		sala1.vetStudent[1] = aluno2;
		sala1.vetStudent[2] = aluno3;
	
		
		
		sala1.listarProfessor();
		
		sala1.listarAlunos();
		
		
	}
}
