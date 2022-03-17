import java.util.*;
public class _28_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] nome_alunos = new String[3];
        int[] idade_aluno = new int[3];
        double[][] nota_aluno = new double[3][3];



        //ALUNOS
        for(int x = 0; x < nome_alunos.length; x++){
            System.out.print("Nome do aluno: ");
            leia.nextLine();
            nome_alunos[x] = leia.nextLine();

            System.out.print("Qual sua idade: ");
            idade_aluno[x] = leia.nextInt();

            for(int y = 0; y < 3; y++){
                System.out.print("Digite a " + (y+1) + "ª nota: ");
                nota_aluno[x][y] = leia.nextDouble();
            }

        }

    }
}
