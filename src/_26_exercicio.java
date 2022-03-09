import java.util.*;
public class _26_exercicio {
    public static void main(String[] args) {

        String sexo ="", sexoMenorSalario ="";
        int idade = 0, qtdPessoas = 0, qtdMulheres = 0, menorIdade = +200, maiorIdade = -10, idadeMenorSalario = 0;
        double salario = 0, totalSalario = 0, salarioMenor = 10000000;

        Scanner leia = new Scanner(System.in);
        while (true){
            System.out.print("Digite sua idade: ");
            idade = leia.nextInt();
            if(idade < 0){
                break;// AQUI O LAÇO É QUEBRADO DE FORMA BRUSCA, SE TORNANDO FALSO(FALSE)!
            } else {
                qtdPessoas++;
            }


            // O if aqui DEVE ser simples!.
            if(idade < menorIdade){
                menorIdade = idade;
            }
            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            System.out.print("Digite o seu sexo: (F) FEMININO ou (M) MASCULINO: ");
            leia.nextLine();
            sexo = leia.nextLine();
            if (sexo.equals("F")){
                qtdMulheres++;
            }

            System.out.print("Qual é o seu salário: R$ ");
            salario = leia.nextDouble();
            totalSalario += salario;

            if(salario < salarioMenor){
                salarioMenor = salario;
                sexoMenorSalario = sexo;
                idadeMenorSalario = idade;
            }

        }


        System.out.println("==================================");
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("A quantidade de mulheres é: " + qtdMulheres);
        System.out.println("A média de salários é: R$" + totalSalario/qtdPessoas);
        System.out.println("O menor salário é : R$" + salarioMenor +
                ". A pessoa tem " + idadeMenorSalario + " anos. e é do sexo " + sexoMenorSalario );

    }
}
