public class _10_ExercicioSoluçãoAlternativa {
    public static void main(String[] args) {
        double salario = 2000;
        double aumento;

        if(salario<1000){
            aumento = 0.25;
        } else {
            if ( salario >= 2000){
                aumento = 0.10;
            } else {
                aumento = 0.15;
            }
        }

        double novoSalario;
        novoSalario = (salario * aumento) + salario;
        System.out.println(novoSalario);
    }
}
