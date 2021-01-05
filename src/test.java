import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Mihkel Kougia
 * ülesanne 2.3a
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage oma vanus: ");
        int vanus = sisend.nextInt();
        System.out.println(vanus);
        System.out.println("Sisestage oma sugu: ");
        String sugu = sisend.next();
        System.out.println(sugu);
        System.out.println("Sisestage oma treeningutüüp: ");
        int typ = sisend.nextInt();
        System.out.println(typ);

        double pulss = 0.0;

        if (sugu == "m" || sugu == "M") {
            pulss = 220 - vanus;
            System.out.println(pulss + "E");
        } else if (sugu == "n" || sugu == "N") {
            pulss = 206 - vanus * 0.88;
            System.out.println(pulss + "e");
        }
        double t1;
        double t2;

        if (typ == 1) {
            t1 = pulss * 0.5;
            t2 = pulss * 0.7;
            System.out.println(t1);
            System.out.println(t2);
            System.out.println("Pulsisagedus peaks olema vahemikus " + t1 + " kuni " + t2 + ".");
        } else if (typ == 2) {
            t1 = pulss * 0.7;
            t2 = pulss * 0.8;
            System.out.println("Pulsisagedus peaks olema vahemikus " + t1 + " kuni " + t2 + ".");
        } else if (typ == 3) {
            t1 = pulss * 0.8;
            t2 = pulss * 0.87;
            System.out.println("Pulsisagedus peaks olema vahemikus " + t1 + " kuni " + t2 + ".");
        }
    }
}