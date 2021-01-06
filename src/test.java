import java.util.Scanner;

/*
 * while tsükkel
 * autor - Mihkel Kougia
 * ülesanne 3.3
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Täringute arv: ");
        int mitu = sisend.nextInt();

        while (true) {
            int taring = (int) Math.round(Math.random() * 6);
            System.out.println(taring);
            if (taring == mitu) {
                break;
            }
        }
    }
}