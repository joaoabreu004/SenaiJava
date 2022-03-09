import java.util.*;
public class _16_Exercicio{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual seu tipo sanguíneo?: ");
        String tipoSangue = leia.nextLine().toUpperCase();
        String frase = "Você pode doar seu sangue para pessoas do tipo: ";

        if(tipoSangue.equals("A")){
            System.out.println(frase + "A e AB");
        }else{
            if (tipoSangue.equals("B")){
                System.out.println(frase + "B e AB");
            } else {
                if (tipoSangue.equals("AB")){
                    System.out.println(frase + "AB");
                } else {
                    if (tipoSangue.equals("O")){
                        System.out.println(frase + "A,B AB e O");
                    } else {
                        System.out.println("Tipo de sangue inválido.");
                    }
                }
            }
        }
    }
}

