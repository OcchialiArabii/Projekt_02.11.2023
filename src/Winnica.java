import java.util.Scanner;
public class Winnica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długość rzędy w metrach: ");
        float R = sc.nextFloat();
        System.out.println("Podaj szerokość okratowania w metrach: ");
        float E = sc.nextFloat();
        System.out.println("Podaj odległość sadzonek w metrach: ");
        float S = sc.nextFloat();

        float V = (R-2*E)/S;

        System.out.println("W rzędzie zmieści się "+ (int)V +" sadzonek");
    }
}
