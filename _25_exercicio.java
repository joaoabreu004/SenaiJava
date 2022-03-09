public class _25_exercicio {
    public static void main(String[] args) {
        int messes =0;

        for(int coelhos = 2; coelhos <= 5000; coelhos = coelhos * 2){
            messes = messes + 3;

            System.out.println("Em " + messes + " a ilha terá: " + coelhos);
        }

        System.out.println("*****************");
        System.out.println("A estimativa de tempo para a ilha ter sua capacidade máxima é de: " + messes/12 + "anos.");
    }
}
