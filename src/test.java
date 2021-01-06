import java.util.Scanner;

/*
 * while tsükkel
 * autor - Mihkel Kougia
 * ülesanne 3.1
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Sisestage mitu korda tuleb äratada: ");
        int mitu = sisend.nextInt();
        int kord = 1;
        while (kord <= mitu) {
            System.out.println("Tõuse ja sära!");
            kord++;
        }


    }
}