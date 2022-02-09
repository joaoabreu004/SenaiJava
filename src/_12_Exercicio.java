import  java.util.*;
public class _12_Exercicio {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = leia.nextInt();

        if (idade <= 12 ){
            System.out.println("Criança");
        } else {
            if (idade <= 18){
                System.out.println("Adolescente");
            } else {
                if (idade <= 30){
                    System.out.println("Jovem");
                } else {
                    if (idade < 60){
                        System.out.println("Adulto");
                    } else {
                        if (idade >= 60){
                            System.out.println("Sênior");
                        }
                    }
                }
            }
        }

    }
}
