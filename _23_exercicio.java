import java.util.*;
public class _23_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x = 1;
        double unicaNota;
        double notas = 0;
        double media = 0;

        while (x <= 3){

            System.out.print("Digite a " + x + "ª nota: ");
            unicaNota = leia.nextDouble();
            x++;

            notas += unicaNota;
        }
        media = notas /3;

        System.out.println(media);
    }
}
