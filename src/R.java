
import java.util.Scanner;

public class R {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile ma być linii?");
        int liczba = scanner.nextInt();

        for (int i = 0; i <= liczba; i++) {
            System.out.print("#");
            for (int z = 0; z <= i; z++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }

    }
}
