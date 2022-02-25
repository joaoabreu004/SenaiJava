import java.util.*;
public class _22_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 1;
        int numPar = 0;
        int numImpar = 0;

        while (x <= 10){
            System.out.print("Digite o " + x + "° número: ");
            int n = leia.nextInt();

            if((n % 2) != 0){
                numImpar += n;
            } else {
                numPar += n;
            }
            x++;
        }

        System.out.println("A soma dos números impares é: " + numImpar);
        System.out.println("A soma dos números pares é: " + numPar);
    }
}
