import java.util.Scanner;

/*
 * while tsükkel
 * autor - Mihkel Kougia
 * ülesanne 3.1
 */
public class test {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Sisestage ringide arv: ");
        int ringideArv = sisend.nextInt();

        int porgand = 0;
        int ring = 1;
        while (ring <= ringideArv) {
            if (ring % 2 == 0) {
                porgand += ring;
            }
            ring++;
        }
        System.out.println("Porgandite koguarv on " + porgand);


    }
}