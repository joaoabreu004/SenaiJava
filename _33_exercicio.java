import java.util.*;
public class _33_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double pi = 3.1415;

        double r = leia.nextDouble();

        double resposta = calc(pi, r );
        System.out.println(resposta);

    }

    public static double calc (double pi, double r ){
        return pi * (r * r);
    }
}
