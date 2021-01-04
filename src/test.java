import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Mihkel Kougia
 * ülesanne 2.2
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage punktisumma: ");
        double ps = sisend.nextDouble();

        if (ps >= 0 && ps < 66) {
            System.out.println("Vähem kui kandideerimiseks vajalik.");
        } else if (ps >= 66 && ps < 85) {
            System.out.println("Kandideerimiseks vastuvõtule.");
        } else if (ps >= 85 && ps <= 100) {
            System.out.println("Vastuvõtt tagatud.");
        } else if (ps < 0 || ps > 100) {
            System.out.println("Vigane punktisumma.");
        }
    }
}