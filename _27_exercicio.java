import java.util.*;
public class _27_exercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] numeros = new double[10];
        double somaTotal = 0, menorValor = Double.POSITIVE_INFINITY, maiorValor = Double.NEGATIVE_INFINITY;

        for(int x = 0; x < numeros.length; x++){
            System.out.print("Digite um número: ");
            numeros[x] = leia.nextDouble();
        }

        //SOMAR
        for(int x=0; x < numeros.length; x++){
            somaTotal = somaTotal + numeros[x];
        }


        //MENOR/MAIOR
        for(int x=0; x <10; x++){
            if(numeros[x] < menorValor){
                menorValor = numeros[x];
            }
            if(numeros[x] > maiorValor){
                maiorValor = numeros[x];
            }
        }


        System.out.println("=====================");
        //MÉDIA
        System.out.println("Média dos números: " + somaTotal/numeros.length);
        System.out.println("Soma total: " + somaTotal);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
    }
}
