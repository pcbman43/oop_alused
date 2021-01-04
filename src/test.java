import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Mihkel Kougia
 * ülesanne 1.3
 */
public class test {
    public static void main(String[] args) {

        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage astme alus: ");
        int astmeAlus = sisend.nextInt();
        System.out.println("Sisestage astendaja: ");
        int astendaja = sisend.nextInt();

        int tulemus = (int) Math.pow(astmeAlus, astendaja);

        System.out.println(tulemus);
    }
}
