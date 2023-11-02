import java.util.Scanner;

public class Znak {
    public static void main(String[] args) {
        System.out.println("Podaj znak:");
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.next().charAt(0);
        System.out.println("Podaj średnice (Tylko nieparzysta liczba całkowita):");
        int srednica = scanner.nextInt();

        if (srednica % 2 == 0) {
            srednica--;
        }

        for (int i = 1; i <= srednica; i++) {

            if (i % 2 == 1) {
                int z = (srednica - i) / 2;
                for (int g = 0; g <= z; g++) {
                    System.out.print(" ");
                }
                for (int g = 0; g < i; g++) {
                    System.out.print(znak);
                }
                System.out.println("");
            }

        }

        for (int i = 1, z = 0, j = srednica - 1; i <= srednica; srednica--, j = j - 2) {
            z++;
            for (int g = 0; g <= z; g++) {
                System.out.print(" ");
            }
            for (int g = 1; g < j; g++) {
                System.out.print(znak);
            }
            System.out.println("");

        }

    }
}
