import java.util.Scanner;
public class exerciciosete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double graus, fa, k;

        System.out.print("Digite quantos graus está fazendo no local: ");
        graus = leia.nextDouble();

        fa = (graus * 9/5) + 32;
        k = graus + 273.15;

        System.out.println(graus + " é igua à: " + fa + "Fº");
        System.out.println(graus + " é igua à: " + k + "Kº");

    }
}
