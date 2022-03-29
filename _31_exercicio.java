import java.util.*;
public class _31_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double n1 = leia.nextDouble();
        double n2 = leia.nextDouble();
        double resposta = calc(n1, n2);
        System.out.println(resposta);

    }

    public static double calc (double altura, double peso){
        return peso / (altura * altura);
    }
}
