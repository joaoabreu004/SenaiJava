import java.util.*;
public class _19_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leia.nextInt();
        for(int x=1; x <= 10; x++ ){
            System.out.println(num + " X " + x + " = " + num*x);
        }

    }
}
