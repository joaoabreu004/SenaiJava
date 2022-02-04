import java.util.Scanner;
public class _08_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double dol, cotacao, conversao;

        System.out.print("Quanto dólares?: U$D");
        dol = leia.nextDouble();

        System.out.print("Cotação do dia: R$");
        cotacao = leia.nextDouble();
        conversao = (cotacao * dol);

        System.out.println(conversao);
    }
}
