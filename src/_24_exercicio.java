import java.util.*;
public class _24_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int alunos = 1;
        double mediaAluno = 0;
        double mediaSala = 0;
        int aluReprov = 0;
        int aluExa = 0;
        int aluAprov = 0;


        while (alunos <= 6) {
            double nota = 0;
            double somaNotas = 0;

            System.out.println(alunos + "º aluno ");
            for (int x = 1; x <= 2; x++) {
                System.out.print("Digite a " + x + "ª nota: ");
                nota = leia.nextDouble();
                somaNotas += nota;
            }
            mediaAluno = somaNotas / 2;
            mediaSala += mediaAluno;
            System.out.println("Média do aluno: " + mediaAluno);


            if (mediaAluno <= 3) {
                System.out.println("reprovado");
                aluReprov++;
            } else {
                if (mediaAluno >3 && mediaAluno <= 7) {
                    System.out.println("recuperação");
                    aluExa++;
                } else {
                    System.out.println("aprovado!");
                    aluAprov++;
                }
            }
            System.out.println("===========");
            alunos++;
        }

        System.out.println("Número de reprovados: " + aluReprov);
        System.out.println("Número de recuperação: " + aluExa);
        System.out.println("Número aprovados: " + aluAprov);
        System.out.println("A média da sala é: " + mediaSala/6);

    }
}
