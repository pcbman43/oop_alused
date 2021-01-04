import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Mihkel Kougia
 * ülesanne 2.1
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage pilede aluse kõrgus (km): ");
        double pilved = sisend.nextDouble();

        if (pilved > 6.0) {
            System.out.println("Need on ülemised pilved.");
        } else {
            System.out.println("Need ei ole ülemised pilved.");
        }
    }
}