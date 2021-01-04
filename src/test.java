import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Mihkel Kougia
 * ülesanne 2.2
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage oma nimi: ");
        String nimi = sisend.next();
        System.out.println("Sisestage lubatud kiirus: ");
        int lubatud = sisend.nextInt();
        System.out.println("Sisestage tegelik kiirus: ");
        int tegelik = sisend.nextInt();
        int trahv = (tegelik - lubatud) * 3;
        if (trahv >= 190) {
            trahv = 190;
        }
        System.out.println(nimi + ", kiiruse ületamise eest on teie trahv " + trahv + " eurot.");

    }
}