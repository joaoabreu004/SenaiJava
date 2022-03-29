import java.util.*;
public class _34_exercicio {
//EXAMPLE OF W3SCHOOL "A Method with if... else.
        // Create a checkAge() method with an integer variable called age
        public static int checkAge(int age) {

            // If age is less than 18, print "access denied"
            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");

                // If age is greater than, or equal to, 18, print "access granted"
            } else {
                System.out.println("Access granted - You are old enough!");
            }

            return age;
        }

        public static void main(String[] args) {
           Scanner leia = new Scanner(System.in);

            System.out.print("Qual a sua idade?: ");
            int pegarIdade = leia.nextInt();
            System.out.println(checkAge(pegarIdade));

        }
}
