import java.util.Scanner;
public class _10_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o seu salário?: ");
        double salario = leia.nextDouble();

        if(salario < 1000){
            System.out.println("Seu salário é: R$" + (salario + (salario * 0.25)));
        } else{
            if(salario >= 1000 && salario < 2000){
                System.out.println("Seu salário é: R$" + (salario + (salario * 0.15)));
            } else {
                if (salario >= 2000){
                    System.out.println("Seu salário é: R$" + (salario + (salario * 0.10)));
                }
            }
        }
    }
}
