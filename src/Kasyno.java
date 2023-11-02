import java.util.Scanner;

public class Kasyno {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

            float kwotaK = 0;
            float wygranaK = 0;
            double number;
            while(true) {
                System.out.println("Podaj kwote którą chcesz wrzucić do automatu: ");
                float kwota = scaner.nextFloat();
                String w1 = "", w2 = "", w3 = "";

                String[] slowa = {w1, w2, w3};

                for (int i = 0; i < 3; i++) {
                    number = Math.random() * 5;

                    switch ((int) number) {
                        case 0:
                            slowa[i] = "Wiśnie";
                            break;
                        case 1:
                            slowa[i] = "Pomarańcze";
                            break;
                        case 2:
                            slowa[i] = "Śliwki";
                            break;
                        case 3:
                            slowa[i] = "Melony";
                            break;
                        case 4:
                            slowa[i] = "Bary";
                            break;
                    }
                }

                System.out.println(slowa[0] + "\t" + slowa[1] + "\t" + slowa[2]);

                if (slowa[0].equals(slowa[1]) && slowa[1].equals(slowa[2])) {
                    System.out.println("Gratulacje!!! Wygrałeś " + kwota * 3 + " Zł");
                    wygranaK = wygranaK + (kwota * 3);
                }
                if (slowa[0].equals(slowa[1]) || slowa[1].equals(slowa[2]) || slowa[0].equals(slowa[2])) {
                    System.out.println("Gratulacje!!! Wygrałeś " + kwota * 2 + " Zł");
                    wygranaK = wygranaK + (kwota * 2);
                } else {
                    System.out.println("Nie tym razem, wygrałeś 0 zł");
                }

                String odp;
                while (true) {
                    System.out.println("Chcesz zagrać ponownie?");
                    odp = scaner.next().toLowerCase();
                    if (odp.equals("tak") || odp.equals(("nie"))) {
                        break;
                    } else {
                        System.out.println("Błędna odpowiedź");
                    }
                }
                if (odp.equals("nie")) {
                    kwotaK = kwotaK + kwota;
                    System.out.println("Kwota wrzucona do automatu: " + kwotaK);
                    System.out.println("Wygrana: " + wygranaK);
                    System.out.println("Bilans: " + (wygranaK - kwotaK));
                    break;
                }
                else
                {
                    kwotaK = kwotaK + kwota;
                }
            }





    }

}
