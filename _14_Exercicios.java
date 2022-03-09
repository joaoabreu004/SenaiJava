import java.util.*;
public class _14_Exercicios {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual cor está no semáforo?:");
        String cor = leia.nextLine();

        if (cor.equals("verde")){
            System.out.println("Prossiga");
        } else if (cor.equals("amarelo")){
            System.out.println("Atenção");
        } else if (cor.equals("vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("invalida");
        }
    }
}
