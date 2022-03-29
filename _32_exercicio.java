import java.util.*;
public class _32_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double n1 = leia.nextDouble();
        double resposta = calc(n1);
        System.out.println(resposta);

    }

    public static double calc (double a ){
        return (a * a * a);
    }
}
