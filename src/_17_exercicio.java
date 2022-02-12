import java.util.*;
public class _17_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual seu tipo sanguíneo?: ");
        String tipoSangue = leia.nextLine().toUpperCase();
        String frase = "Você pode receber sangue de pessoas do tipo: ";

        if(tipoSangue.equals("A")){
            System.out.println(frase + "A e O.");
        }else{
            if (tipoSangue.equals("B")){
                System.out.println(frase + "B e O.");
            } else {
                if (tipoSangue.equals("AB")){
                    System.out.println(frase + "A, B, AB e O");
                } else {
                    if (tipoSangue.equals("O")){
                        System.out.println(frase + "O");
                    } else {
                        System.out.println("Tipo de sangue inválido.");
                    }
                }
            }
        }
    }
}
