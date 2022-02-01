public class exerciciodois {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        int p1, p2, p3;

        nota1= 10;
        nota2 = 8;
        nota3 = 7;

        p1 = 3;
        p2 = 2;
        p3 = 1;

        media = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / (p1 + p2 + p3);

        System.out.println("A média ponderada é: " + media);
    }
}
