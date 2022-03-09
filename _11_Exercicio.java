import java.util.Scanner;

public class _11_Exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leia.nextInt();

        if(n1 > n2 ){
            System.out.println("O número maior é: " + n1 + " e a diferença entre ele e " + n2 + " é: " + (n1 - n2));
        } else {
            System.out.print("O número maior é: " + n2 + " e a diferença entre ele e " + n1 + " é: " + (n2 - n1));
        }
    }
}
