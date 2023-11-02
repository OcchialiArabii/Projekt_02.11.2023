import java.util.Locale;
import java.util.Scanner;

public class Restauracje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        class restauracja {
            String name;
            String wegan;
            String wegetarian;
            String glutenfree;

            public restauracja(String nameC, String ifwegan, String ifwegetarian, String ifglutenfree) {
                wegan = ifwegan;
                wegetarian = ifwegetarian;
                glutenfree = ifglutenfree;
                name = nameC;
            }
        }
        restauracja r1 = new restauracja("Luksusowe Burgery u Jarka", "nie", "nie", "nie");
        restauracja r2 = new restauracja("Pizzeria przy Dworcowej", "nie", "tak", "tak");
        restauracja r3 = new restauracja("Kawiarnia na Rogu", "tak", "tak", "tak");
        restauracja r4 = new restauracja("Włoskie Specjały", "nie", "tak", "nie");
        restauracja r5 = new restauracja("Kuchnia u Szefa", "tak", "tak", "tak");

        restauracja[] restauracje = {r1, r2, r3, r4, r5};

        String ifWegetarian;
        String ifGluten;
        String ifWegan;

        while (true) {
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
            ifWegetarian = scanner.next().toLowerCase();
            if (ifWegetarian.equals("tak") || ifWegetarian.equals("nie")) {
                break;
            } else {
                System.out.println("Podano złą wartość");
            }
        }

        while (true) {
            System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
            ifWegan = scanner.next().toLowerCase();

            if (ifWegan.equals("tak") || ifWegan.equals("nie")) {
                break;
            } else {
                System.out.println("Podano złą wartość");
            }
        }
        while (true) {
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
            ifGluten = scanner.next().toLowerCase();
            if (ifGluten.equals("tak") || ifGluten.equals("nie")) {
                break;
            } else {
                System.out.println("Podano złą wartość");
            }
        }

        System.out.println("Możecie wybrać się do: ");
        for (int i = 0; i < restauracje.length; i++) {
            if ((ifWegetarian.equals("tak") && restauracje[i].wegetarian.equals("tak")) || ifWegetarian.equals("nie")) {
                if ((ifWegan.equals("tak") && restauracje[i].wegan.equals("tak")) || ifWegan.equals("nie")) {
                    if ((ifGluten.equals("tak") && restauracje[i].glutenfree.equals("tak")) || ifGluten.equals("nie")) {
                        System.out.println(restauracje[i].name);
                    }
                }
            }

        }
    }
}
