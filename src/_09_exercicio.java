import java.util.Scanner;

public class _09_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, nota3;
        System.out.print("Nota 1: ");
        nota1 = leia.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = leia.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = leia.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if(media >= 5 ){
            System.out.println("aluno aprovado");
        }else {
            System.out.println("aluno retido");
        }
    }
}
