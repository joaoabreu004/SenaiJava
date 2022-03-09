import java.util.*;
public class _21_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int n1 = leia.nextInt();
        System.out.print("Segundo número: ");
        int n2 = leia.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número DEVE ser menor que o segundo!");
        } else {
            while (n1 <= n2){
                int x = n1 % 2;
                if(x != 0){
                    System.out.println(n1);
                }
            n1++;
            }
        }
    }
}
