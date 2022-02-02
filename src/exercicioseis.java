public class exercicioseis {
    public static void main(String[] args) {
        //1 pé = 12 polegadas
        //1 jarda = 3 pés
        //1 milha = 1.760 jardas

        float pes = 9;

        //Polegadas para pés
        float pespolegadas = pes * 12;

        //Jardas
        float pesjardas = pes/3;

        //Milhas
        float pesmilhas = pes/(1760*3);

        //Saídas
        System.out.println("Polegadas: " + pespolegadas);
        System.out.println("Jardas: " + pesjardas);
        System.out.println("Milhas: " + pesmilhas);


    }
}
