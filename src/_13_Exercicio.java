import  java.util.*;
public class _13_Exercicio {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int dia = leia.nextInt();

        if(dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda-Feira");
        } else if (dia == 3){
            System.out.println("Terça-Feira");
        } else if (dia == 4){
            System.out.println("Quarta-Feira");
        } else if (dia == 5){
            System.out.println("Quinta-Feira");
        } else if (dia == 6){
            System.out.println("Sexta-Feira");
        } else if (dia == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Código de dia inválido.");
        }
    }
}
