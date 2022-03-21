import java.util.*;
public class _29_exercicio {
        public static void main (String[]args){
        Scanner leia = new Scanner(System.in);

        int rep = 0;
        int copoA, copoB, copoC, copoAux;
        int bolinha = 1;

        System.out.println("Quantas repetições você deseja fazer?");
        rep = leia.nextInt();

        copoA = bolinha;
        copoB = 0;
        copoC = 0;
        copoAux = 0;

        for (int x = 0; x <= rep; x++) {
            copoAux = copoA;
            copoA = copoB;
            copoB = copoAux;

            copoAux = copoB;
            copoB = copoC;
            copoC = copoAux;


        }

//Terceiro desafio

        System.out.println("Qual copo a bolinha está?: ");

        leia.nextLine();
        String resposta = leia.nextLine();

        if (resposta.equals("copoA") && copoA == 1) {
            System.out.println("Acertou!");


        } else if (resposta.equals("copoB") && copoB == 1) {
            System.out.println("Acertou!");

        } else if (resposta.equals("copoC") && copoC == 1) {
            System.out.println("Acertou!");

        } else {
            System.out.println("ERROU!");
        }

        System.out.println("=================POSIÇÕES======================");

        for (int x = 0; x < rep; x++) {
            copoAux = copoA;
            copoA = copoB;
            copoB = copoAux;

            copoAux = copoB;
            copoB = copoC;
            copoC = copoAux;

            System.out.println("[" + copoA + " " + copoB + " " + copoC + "]");


        }
    }
}