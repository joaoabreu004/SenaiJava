import java.util.*;
public class _18_exercicio{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double area, h;
        System.out.print("1º Lado do triângulo: ");
        double L1 = leia.nextDouble();
        System.out.print("2º Lado do triângulo: ");
        double L2 = leia.nextDouble();
        System.out.print("3º Lado do triângulo: ");
        double L3 = leia.nextDouble();

        if ((L1 + L2) < L3 || (L1 + L3) < L2 || (L2 + L3) < L1 || L1 == 0 || L2 == 0 || L3 == 0){
            System.out.println("Não é um triangulo");
        } else {
            if(L1 == L2 && L2 == L3){
                System.out.println("É um triângulo Equilátero.");
            } else {
                if(L1 == L2 || L2 == L3 || L1 == L3) {
                    System.out.println("É um triângulo Isóceles.");
                } else {
                    System.out.println("É um triangulo  Escaleno.");
                }
            }
        }
    }
}
